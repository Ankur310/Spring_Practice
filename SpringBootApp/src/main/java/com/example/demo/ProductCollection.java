package com.example.demo;
import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
	
	static List<Product> ls = new ArrayList<>();
	
	
	 static {
		ls.add(new Product(2, "IdeaPad", 100000, "Lenovo", 2, 2, 2022));
		ls.add(new Product(3, "M1", 130000, "Macbook", 1, 12, 2021));
		ls.add(new Product(4, "Note", 150000, "Samsung", 5, 23, 2022));
		ls.add(new Product(5, "Inspiron", 120000, "Dell", 6, 54, 2020));
		ls.add(new Product(6, "LunchPad", 160000, "Asus", 8, 65, 2019));
		ls.add(new Product(7, "Vivobook", 180000, "Acer", 9, 5, 2018));
		
	}
	
}
