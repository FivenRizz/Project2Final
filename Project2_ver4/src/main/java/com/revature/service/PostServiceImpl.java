package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.PostDAOImpl;
import com.revature.entity.Post;
@Service ("postService")
public class PostServiceImpl implements PostService{

	@Autowired
	PostDAOImpl bd;
	
	@Override
	@Transactional
	public List<Post> listAllPosts() {
		
		System.out.println("service");
		
		List<Post> lb = bd.getAllPosts();
		System.out.println("List in service "+lb);
		return lb;
	}

	@Override
	@Transactional
	public void createPost(Post post) {
		bd.addPost(post);
	}
//
	@Override
	@Transactional
	public Post getPostbyId(int PostId) {
		return bd.fetchPostbyId(PostId);
	}

	@Override
	@Transactional
	public List<Post> getPostbyUserId(int UserPostId) {
		return bd.fetchPostbyUserId(UserPostId);
	}
	
	@Override
	@Transactional
	public List<Post> getPostNotUserId(int UserPostId) {
		return bd.fetchPostNotUserId(UserPostId);
	}
	
	@Override
	@Transactional
	public void deletePostById(Integer PostId) {
		bd.deletePostById(PostId);
		
	}
	
	@Override
	@Transactional
	public void addLike(int PostId) {
		bd.addLike(PostId);
	}

}
