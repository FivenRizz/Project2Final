package com.revature.dao;

import java.util.List;

import com.revature.entity.Post;

public interface PostDAO {
	
	public void addPost(Post post);
	public Post fetchPostbyId(int PostId);
	public void deletePostById(int PostId);
	public List<Post> fetchPostbyUserId(int UserPostId);
	public List<Post> fetchPostNotUserId(int UserPostId);
	public void addLike(int PostId);
}
