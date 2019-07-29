package com.revature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")

public class Post {
	
	@Id
	@Column(name="post_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int post_id;
	
	@Column(name="user_id")
	int user_id;
	
	@Column(name="text",length=2000)
	String text;
	
	@Column(name="likecount")
	Integer likecount;
	
	
	
	public Post() {}
	
	public Post(int post_id, int user_id, String text, Integer likecount) {
		super();
		this.post_id = post_id;
		this.user_id = user_id;
		this.text = text;
		this.likecount = likecount;
	}
	
	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public Integer getLikecount() {
		return likecount;
	}



	public void setLikecount(Integer likecount) {
		this.likecount = likecount;
	}

	

	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", user_id=" + user_id + ", text=" + text + ", likecount=" + likecount
				+ "]";
	}

	public Post(int user_id, String text) {
		super();
		this.user_id = user_id;
		this.text = text;
		this.likecount = 0;
		
	}
	
}
