package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int productId;
	
	@Size(min = 5, max = 10, message= "{name.invalid}")
	private String name;
	
	@Min(value=10000, message = "{price.invalid}")
	private int price;
	private String brand;
	private int category;
	private int man_Id;
	private int reg_no;

	public Product(int pruductId, String name, int price, String brand, int category, int man_Id, int reg_no) {
		super();
		this.productId = pruductId;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.man_Id = man_Id;
		this.reg_no = reg_no;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPruductId() {
		return productId;
	}

	public void setPruductId(int pruductId) {
		this.productId = pruductId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getMan_Id() {
		return man_Id;
	}

	public void setMan_Id(int man_Id) {
		this.man_Id = man_Id;
	}

	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}

}
