package com.revature.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.revature.config.HibernateUtil;
import com.revature.entity.Post;

@Repository("postDAO")
public class PostDAOImpl implements PostDAO{
	@Autowired
		SessionFactory sessionFact;
	
	public java.util.List<Post> getAllPosts(){
		
		System.out.println("dao");
		
		ArrayList<Post> postlist = new ArrayList<>();
		
		Query query = sessionFact.getCurrentSession().createQuery("From Post order by POST_ID");
		postlist =  (ArrayList<Post>) query.list();
		System.out.println("List in dao " + postlist);
		
		return postlist;
		
	}
	
	
	@Override
	public void addPost(Post post) {
	
		sessionFact.getCurrentSession().save(post);
		System.out.println(post + " saved");
		
	}
	
	@Override
	public Post fetchPostbyId(int postId) {

		Session currentSession = sessionFact.getCurrentSession();
		Post thepost = currentSession.get(Post.class, postId);
		return thepost;
		
	}
//
	@Override
	public void deletePostById(int PostId) {
	
		Session currentSession = sessionFact.getCurrentSession();
		Post post = currentSession.byId(Post.class).load(PostId);
		System.out.println(" Delete this book: " + post);
		currentSession.delete(post);
	}


	@Override
	public List<Post> fetchPostbyUserId(int UserPostId) {
		
		ArrayList<Post> userpostlist = new ArrayList<>();
		Query query = sessionFact.getCurrentSession().createQuery("From Post where USER_ID =:id order by POST_ID");
		query.setParameter("id", UserPostId);
		userpostlist =  (ArrayList<Post>) query.list();
		System.out.println("List in dao " + userpostlist);
		
		return userpostlist;
	}
	
	@Override
	public List<Post> fetchPostNotUserId(int UserPostId) {
		
		ArrayList<Post> userpostlist = new ArrayList<>();
		Query query = sessionFact.getCurrentSession().createQuery("From Post where not USER_ID =:id order by POST_ID");
		query.setParameter("id", UserPostId);
		userpostlist =  (ArrayList<Post>) query.list();
		
		return userpostlist;
	}
	
	@Override
	public void addLike(int PostId) {
		
		Session currentSession = sessionFact.getCurrentSession();
		Post post = currentSession.byId(Post.class).load(PostId);
		System.out.println(" Add a like to this post : " + post);
		int likecount = post.getLikecount();
		post.setLikecount(likecount+1);
		currentSession.update(post);
		
	}

}
