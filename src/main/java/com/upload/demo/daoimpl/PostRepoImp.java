package com.upload.demo.daoimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import com.upload.demo.dao.PostRepo;
import com.upload.demo.model.Post;

import jakarta.persistence.EntityManager;

@Repository
public class PostRepoImp implements PostRepo {

	private EntityManager em;

	public PostRepoImp(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void save(String createdby, String desc, MultipartFile post) throws IOException {
		Post p = new Post();
		p.setCreatedby(createdby);
		p.setDesc(desc);
		p.setPost(post.getBytes());
		em.persist(p);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getAllPosts() {
		return em.createQuery("select * from Post").getResultList();

	}

}
