package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	int addnewProduct();

	int deleteById(int pid);

	int modifyById(int pid, int qty, double pr);

	List<Product> getAll();

	Product getById(int pid);

	List<Product> getByQty(int qty);



}
