package com.codewithraushanblog;



import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.codewithraushanblog.config.AppConstants;
import com.codewithraushanblog.entities.Role;
import com.codewithraushanblog.repositories.RoleRepo;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner{

	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this.passwordEncoder.encode("xyz"));
		
		try
		{
			Role role = new Role();
			role.setId(AppConstants.ADMIN_USER);
			role.setName("ADMIN_USER");
			
			Role role1 = new Role();
			role1.setId(AppConstants.NORMAL_USER);
			role1.setName("NORMAL_USER");
			
		List<Role> lsRole = new ArrayList<>();
		lsRole.add(role);
		lsRole.add(role1);
		
		List<Role> result = this.roleRepo.saveAll(lsRole);
		result.forEach(r->{
			System.out.println(r.getName());
		});
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
