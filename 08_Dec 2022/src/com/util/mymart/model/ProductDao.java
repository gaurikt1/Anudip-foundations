package com.util.mymart.model;

import java.util.LinkedList;



public class ProductDao {
	private static LinkedList<Product> list=new LinkedList<>();
	public static boolean addproduct(Product product) {
		boolean addstatus=false;
		list.add(product);
		addstatus=true;
		return addstatus;
	}
	public static LinkedList<Product>getallproduct(){
		return list;
	}
}