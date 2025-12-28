package com.constructors.levelone;

public class ProductMain {

	public static void main(String[] args) {
		Product product1 = new Product ("Honey", 300);
		Product product2 = new Product ("Sugar", 150);
		product1.displayProductDetails();
		product2.displayProductDetails();
		Product.displayTotalProducts();
	}

}
