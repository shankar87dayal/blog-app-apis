package com.codewithraushanblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithraushanblog.entities.Post;
import com.codewithraushanblog.payloads.PostDto;
import com.codewithraushanblog.services.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {
	
	@Autowired
	private PostService postService;

//	create
	@PostMapping("/user/{idValue}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(@RequestBody 
			PostDto postDto,@PathVariable(name ="idValue") Integer userId,
			@PathVariable Integer categoryId){
		PostDto createPost = this.postService.createPost(postDto, userId, categoryId);
		return new ResponseEntity<PostDto>(createPost, HttpStatus.CREATED);
	}
}
