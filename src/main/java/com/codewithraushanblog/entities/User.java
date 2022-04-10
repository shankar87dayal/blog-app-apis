package com.codewithraushanblog.entities;

import javax.persistence.GeneratedValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter


public class User {

	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;
 
 @Column(name = "user_name", nullable = false , length =  100)
 private String name;
 private String email;
 private String password;
 private String  about;
}
