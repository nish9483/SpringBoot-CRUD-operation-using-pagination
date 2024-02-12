package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserEntityController {
	@Autowired
	private UserRepository data;
	
	
	
	@PostMapping("/person")
	public ResponseEntity<UserEntity>saveUserEntity(@RequestBody UserEntity userEntity)
	{
		UserEntity u=data.save(userEntity);
	return new ResponseEntity<UserEntity>(u,HttpStatus.CREATED);
	}
	
	@GetMapping("/page-One")
	public List<UserEntity>getPageOne()
	{
		Pageable p=PageRequest.of(0, 5,Sort.by("id").ascending());
		Page<UserEntity>pe=data.findAll(p);
		return pe.getContent();
	}
	/*@GetMapping("/page-two")
	public List<UserEntity>getPageTwo()
	{
		Pageable p=PageRequest.of(1, 5,Sort.by("userName").ascending());
		Page<UserEntity>pe=data.findAll(p);
		return pe.getContent();
	}*/
	
	@PutMapping("/p/{id}")
	public ResponseEntity<UserEntity>updateUserEntity(@RequestBody UserEntity userEntity,@PathVariable int id)
	{
		Optional<UserEntity>o=data.findById(id);
		if(o.isPresent())
		{
			UserEntity u=o.get();
			u.setUserName(userEntity.getUserName());
			u.setPassword(userEntity.getPassword());
			UserEntity t=data.save(u);
			return new ResponseEntity<UserEntity>(t,HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<UserEntity>(HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/p/{id}")
	public ResponseEntity<Void>deleteUserEntity(@PathVariable int id)
	{
		Optional<UserEntity>o=data.findById(id);
		if(o.isPresent())
		{
			data.deleteById(id);
             return new ResponseEntity<Void>(HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		}
	

}
