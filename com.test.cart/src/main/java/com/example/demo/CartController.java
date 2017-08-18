package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	
	
	@RequestMapping("/getListOfCarts")
	public List<Cart> getListOfCarts(){
		
		List<Cart> list = new ArrayList<Cart>();	
		
		Cart c1 = new Cart("shirt", "amazon");
		Cart c2 = new Cart("pants", "amazon");
		list.add(c1);
		list.add(c2);
		
		return list;
		
		
		
	}

}
