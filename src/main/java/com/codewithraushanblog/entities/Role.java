package com.codewithraushanblog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Role {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
}
