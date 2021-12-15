package com.springframework.springAOP.Serviceimplimentation;

import com.springframework.springAOP.Service.ProductService;

public class ProductServiceImplimentation implements ProductService {

	@Override
	public int multiply(int multiplicant, int multiplyer) {
		// TODO Auto-generated method stub
		return multiplicant * multiplyer;
	}

}
