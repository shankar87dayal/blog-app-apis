package com.codewithraushanblog.payloads;

import java.util.Date;


import com.codewithraushanblog.entities.Category;
import com.codewithraushanblog.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class PostDto {

	
	
	
	 private String title;
	 private String content;
	 
	 private String imageName; 
		
	private Date addedDate; 
		
	private CategoryDto category;
	
	private UserDto user;
	 
}