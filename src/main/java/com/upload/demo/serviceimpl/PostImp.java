package com.upload.demo.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.upload.demo.dao.PostRepo;
import com.upload.demo.model.Post;
import com.upload.demo.service.PostService;

public class PostImp implements PostService {

	private PostRepo repo;

	public PostImp(PostRepo repo) {
		this.repo = repo;
	}

	@Override
	public void addPost(String createdby, String desc, MultipartFile post) throws IOException {
		repo.save(createdby, desc, post);

	}

	@Override
	public List<Post> getPosts() {
		return repo.getAllPosts();
	}

}
