package org.jsp.product_api.repository;

import java.util.List;

import org.jsp.product_api.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Object save = null;

	List<Product> findByName(String name);

	List<Product> findByPriceGreaterThanEqual(double price);

	List<Product> findByStockBetween(int min, int max);
	
	
}
