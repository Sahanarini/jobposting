package com.upload.demo.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.upload.demo.model.Post;

public interface PostRepo {

	public void save(String createdby, String desc, MultipartFile post) throws IOException;

	public List<Post> getAllPosts();

}
