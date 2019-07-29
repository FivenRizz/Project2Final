package com.revature.service;

import java.util.List;

import com.revature.entity.Post;

public interface PostService {

	public List<Post> listAllPosts();
	
	public void createPost(Post post);
	public Post getPostbyId(int PostId);
	public List<Post> getPostbyUserId(int UserPostId);
//	public void updateBookById(int BookId, Float price);
	public void deletePostById(Integer PostId);
	public List<Post> getPostNotUserId(int UserPostId);
	public void addLike(int postId);
}
