package com.codewithraushanblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codewithraushanblog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
}
