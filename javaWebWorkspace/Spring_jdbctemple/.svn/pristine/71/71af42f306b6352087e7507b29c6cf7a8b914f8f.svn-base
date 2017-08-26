package com.spring.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * ≤‚ ‘¿‡
 * 
 * @author Nocol
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProductTest {
	@Autowired
	private ProductDao dao;

	@Test
	public void add() {
		Product product = new Product(1, "a");
		dao.add(product);
	}
	
	@Test
	public void delete() {
		Product product = new Product();
		product.setId(1);
		dao.delete(product);
	}
	
	@Test
	public void update() {
		Product product = new Product(1, "b");
		dao.add(product);
	}
	
	
	@Test
	public void findName(){
		System.out.println(dao.fingNameById(1));
	}
	
	@Test
	public void findAll(){
		System.out.println(dao.fingTotalCount());
	}
	
}
