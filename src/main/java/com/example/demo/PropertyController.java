package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;

	import java.security.Principal;
*/
	@Controller
	public class PropertyController {
	   /* @Autowired
	    private PropertyService propertyService;

	    @GetMapping("/properties")
	    public String listProperties(Model model) {
	        model.addAttribute("properties", propertyService.getProperties());
	        return "properties";
	    }

	    @PostMapping("/properties")
	    public String addProperty(@ModelAttribute Property property, Principal principal) {
	        // assuming you have a way to get the user ID from the principal
	        Long sellerId = Long.parseLong(principal.getName());
	        property.setSellerId(sellerId);
	        propertyService.addProperty(property);
	        return "redirect:/properties";
	    
	}
	

}*/
@Autowired
private PropertyService cs;

@GetMapping("/product")
public String createPage()
{
	return "property";
}
@PostMapping("/add")
public void save( @RequestBody Property c) {
	cs.save(c);
}

@PutMapping("/add")
public void modify(@RequestBody Property c) {
	cs.modify(c);
}

@DeleteMapping("/add/{id}")
public void deleteById(@PathVariable int id) {
	cs.deleteById(id);
}

@GetMapping("/add/{id}")
public Property getById(@PathVariable int id) {
	return cs.getById(id);
}

@GetMapping("/add")
public List<Property> getAll() {
	return cs.getAll();
}

@GetMapping("/add/page")
public List<Property> getAllPageAndSort(@RequestParam int PageNo,@RequestParam int sizeSize,@RequestParam String field) {
	return cs.getAllPageAndSort(PageNo, sizeSize, field);
}
}


