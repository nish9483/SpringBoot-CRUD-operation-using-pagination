package com.example.demo;


	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.domain.PageRequest;
	import org.springframework.data.domain.Pageable;
	import org.springframework.data.domain.Sort.Direction;
	import org.springframework.stereotype.Service;

	@Service
	public class PropertyServiceImpl  implements PropertyService {

		@Autowired
		private PropertyRepo cr;

		@Override
		public void save(Property c) {
			// TODO Auto-generated method stub
			cr.save(c);
		}

		@Override
		public void modify(Property c) {
			// TODO Auto-generated method stub
			cr.save(c);
		}

		@Override
		public void deleteById(int id) {
			// TODO Auto-generated method stub
			cr.deleteById(id);
		}

		@Override
		public Property getById(int id) {
			// TODO Auto-generated method stub
			Optional<Property> opt=cr.findById(id);
			if(opt.isPresent()) {
				return opt.get();
			}
			return null;
		}

		@Override
		public List<Property> getAll() {
			// TODO Auto-generated method stub
			Iterable<Property> itr=cr.findAll();
			List<Property> lst=new ArrayList<Property>();
			itr.forEach(e->lst.add(e));
			return lst;
		}

		@Override
		public List<Property> getAllPageAndSort(int PageNo, int sizeSize, String field) {
			// TODO Auto-generated method stub
			Pageable p=PageRequest.of(PageNo,sizeSize,Direction.ASC,field);
			return cr.findAll(p).toList();
		}
	}


