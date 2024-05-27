package com.example.demo;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	@Controller
	public class UserEntityControlller {
	    @Autowired
	    private UserEntityService ps;

	    /*@GetMapping("/register")
	    public String showRegisterForm(Model model) {
	        model.addAttribute("user", new User());
	        return "register";
	    }

	    @PostMapping("/register")
	    public String registerUser(@ModelAttribute("user") UserEntity user) {
	        userService.registerUser(user);
	        return "redirect:/login";
	    }

	    @GetMapping("/login")
	    public String showLoginForm() {
	        return "login";
	    }
	}*/

		@GetMapping("/productshop")
		public String createPage()
		{
			return "login";
		}
		@PostMapping("/productshop")
		public String save(@ModelAttribute UserEntity product)
		{
			UserEntity r= ps.saveUserEntity(product);
			return "redirect:/productshop";
		}
		//update
		@GetMapping("/edit/{id}")
		public String editPage(@PathVariable int id)
		{
			UserEntity g=ps.getUserEntityById(id);
			return "edit";
		}
		@PostMapping("/edit/{id}")
		public String update(@ModelAttribute UserEntity product,@PathVariable int id)
		{
			product.setId(id);
			UserEntity f=ps.updateUserEntity(product);
			return "redirect:/edit/{id}";
		}
		
		//delete
		@GetMapping("/delete/{id}")
				public String deletepp(@PathVariable int id)
				{
			ps.deleteUserEntity(id);
			return "redirect:/productshop";
				}
		
	}
		
		//---------------------------------
		/*@PostMapping("/product")
		public ResponseEntity<UserEntity>saveProduct(@RequestBody UserEntity product)
		{
			UserEntity e=ps.saveProduct(product);
			return new ResponseEntity<UserEntity>(e,HttpStatus.CREATED);
		}
		
		@GetMapping("/product")
		public List<UserEntity>getPageOne()
		{
			Pageable p=PageRequest.of(0, 5 ,Sort.by("id").ascending());
			Page<Product>g=ps.findAll(p);
			return g.getContent();
		}
		
		@GetMapping("/product/{id}")
		public ResponseEntity<Product>getProductById(@PathVariable int id)
		{
			Product u=ps.getProductById(id);
			return new ResponseEntity<Product>(u,HttpStatus.OK);
		}
		
		@PutMapping("/product/{id}")
		public ResponseEntity<Product>updateProduct(@PathVariable int id,@RequestBody Product product)
		{
			product.setId(id);
			Product m=ps.updateProduct(product);
			return new ResponseEntity<Product>(m,HttpStatus.OK);
		}
		
		@DeleteMapping("/product/{id}")
		public ResponseEntity<Void>deleteProduct(@PathVariable int id)
		{
			ps.deleteProduct(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}*/

