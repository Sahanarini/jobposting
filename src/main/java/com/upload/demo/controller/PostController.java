package com.upload.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.upload.demo.model.Post;
import com.upload.demo.service.PostService;
import com.upload.demo.utils.ConstUtil;

@RestController
@RequestMapping("/post")
public class PostController {

	private final PostService service;

	private final ConstUtil util;

	public PostController(PostService service, ConstUtil util) {
		this.service = service;
		this.util = util;
	}

	@PostMapping("/linkedin")
	public String addLinkedInPost(@RequestParam String createdBy, @RequestParam String desc,
			@RequestParam MultipartFile img) {
		try {
			service.addPost(createdBy, desc, img);
			return util.SUCCESS;
		} catch (Exception e) {
			return util.FAILURE;
		}

	}

	@PostMapping("/naukri")
	public String addNaukriPost(@RequestParam String createdBy, @RequestParam String desc,
			@RequestParam MultipartFile img) {
		try {
			service.addPost(createdBy, desc, img);
			return util.SUCCESS;
		} catch (Exception e) {
			return util.FAILURE;
		}

	}

	@PostMapping("/indeed")
	public String addIndeedPost(@RequestParam String createdBy, @RequestParam String desc,
			@RequestParam MultipartFile img) {
		try {
			service.addPost(createdBy, desc, img);
			return util.SUCCESS;
		} catch (Exception e) {
			return util.FAILURE;
		}

	}

	@GetMapping("/getlinkedin")
	public List<Post> getLinkedinPost() {
		return service.getPosts();
	}

	@GetMapping("/getNaukari")
	public List<Post> getNaukarinPost() {
		return service.getPosts();
	}

	@GetMapping("/getIndeed")
	public List<Post> getIndeedPost() {
		return service.getPosts();
	}

}
