package com.codewithraushanblog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithraushanblog.entities.Category;
import com.codewithraushanblog.entities.Post;
import com.codewithraushanblog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
}
