package com.example.demo;


	import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

	@Service
	public interface UserEntityService {
	
	   

		
		public UserEntity saveUserEntity(UserEntity product);

		public UserEntity getUserEntityById(int id);

		public void deleteUserEntity(int id);

		public UserEntity updateUserEntity(UserEntity product);

		Page<UserEntity> findAll(Pageable p);

		List<UserEntity> getAllUserEntity();
	}
	

