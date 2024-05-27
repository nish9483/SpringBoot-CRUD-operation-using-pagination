package com.example.demo;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.List;

	@Service
	public interface PropertyService {
	    
		public void save(Property c) ;

		public void modify(Property c) ;

		public void deleteById(int id) ;

		public Property getById(int id);
		

		public List<Property> getAll() ;
		

		public List<Property> getAllPageAndSort(int pageNo, int sizeSize, String field) ;
		}
	


