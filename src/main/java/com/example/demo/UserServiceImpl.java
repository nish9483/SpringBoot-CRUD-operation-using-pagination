package com.example.demo;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
	import org.springframework.data.domain.Pageable;
	import org.springframework.data.domain.Sort.Direction;
	import org.springframework.stereotype.Service;

	@Service
	public class UserServiceImpl  implements UserEntityService {

		@Autowired
		private UserEntityRepo pr;
		
		
		@Override
		public UserEntity saveUserEntity(UserEntity product)
		{
			return pr.save(product);
		}
		
		@Override
		public List<UserEntity> getAllUserEntity()
		{
			return pr.findAll();
		}
		
		@Override
		public Page<UserEntity>findAll(Pageable p)
		{
			Page<UserEntity> r=pr.findAll(p);
			return r;
		}
		
		@Override
		public UserEntity getUserEntityById(int id)
		{
			Optional<UserEntity> h=pr.findById(id);
			return h.get();
			
		}
		
		/*@Override
		public UserEntity updateUserEntity(UserEntity product)
		{
			UserEntity t=pr.findById(product.getId()).get();
			t.setUserEntityname(product.getFirstName());
			t.setPrice(product.getlastName());
			Product v=pr.save(t);
			return v;
			
		}*/
		@Override
		public void deleteUserEntity(int id)
		{
			pr.deleteById(id);
		}

		@Override
		public UserEntity updateUserEntity(UserEntity product) {
			// TODO Auto-generated method stub
			return null;
		}

		
		

	}
