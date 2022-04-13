package com.codewithraushanblog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Getter
@Setter

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	 private Integer categoryid;
	 
	 @Column(name = "title", nullable = false , length =  100)
	 private String categoryTitle;
	 
	 @Column(name = "Description")
	 private String categoryDescription;
	 
	
}
