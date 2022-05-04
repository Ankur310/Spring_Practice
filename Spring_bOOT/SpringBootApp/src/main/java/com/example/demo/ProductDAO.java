package com.example.demo;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDAO {

	ProductCollection prcl = new ProductCollection();
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {

		return prcl.ls;
	}
	
	@GetMapping(value = "/product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductById(@PathVariable("id") int id) {
		
		Product pr = prcl.ls.get(id);
		return pr;
	}
	
	@RequestMapping(value  = "/saveProduct", method=RequestMethod.POST)
	public String saveProdcut(@RequestBody Product product) {
		
		prcl.ls.add(product);
		
		return "Data Saved Successfully";
		
	}
	
	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE)
	public String deletePro(@PathVariable("id") int id) {
		prcl.ls.remove(id);
		
		return "Deleted";
	}
	
	@RequestMapping(value = "/updateProduct/{id}/{name}", method = RequestMethod.PUT)
	public String updateProduct(@PathVariable("id") int id, @PathVariable("name") String name) {
		
		Product PR = prcl.ls.get(id);
		PR.setName(name);
		return "Data updated Successfully";
	}
	
}
