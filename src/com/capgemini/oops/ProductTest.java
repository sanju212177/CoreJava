package com.capgemini.oops;

public class ProductTest {
	public static void main(String[] args) {
		Product product1 = new Product(101,"Laptop",49999.00);
		Product product2 = new Product(102,"Mobile",15999.00);
		Product product3 = new Product(102,"Mobile",15999.00);
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		System.out.println("product count : " + Product.getProductcount());
		
		
		/*if(product1.equals(product2))
			System.out.println("Product1 and product2 are same.");
		if(product1.equals(product3))
			System.out.println("Product1 and product3 are same.");
		if(product2.equals(product3))
			System.out.println("Product2 and product3 are same.");*/
	}
}
