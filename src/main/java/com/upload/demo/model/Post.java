package com.upload.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String createdby;

	private String desc;

	@Lob
	@Column(columnDefinition = "LONGBLOB", length = 1000000)
	private byte[] post;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int id, String createdby, String desc, byte[] post) {
		super();
		this.id = id;
		this.createdby = createdby;
		this.desc = desc;
		this.post = post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public byte[] getPost() {
		return post;
	}

	public void setPost(byte[] post) {
		this.post = post;
	}

	
	
}
