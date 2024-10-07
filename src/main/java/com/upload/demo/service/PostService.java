package com.upload.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.upload.demo.model.Post;

public interface PostService {

	public void addPost(String createdby, String desc, MultipartFile post) throws IOException;

	public List<Post> getPosts();

}
