package com.codewithraushanblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithraushanblog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

	
}
