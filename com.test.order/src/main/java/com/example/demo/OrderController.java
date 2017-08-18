package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/getListOfOrders")
	public List<Order> getListOfOrders() {

		Order o1 = new Order("f**", "s**");
		Order o2 = new Order("f**", "s**");

		List<Order> list = new ArrayList<Order>();
		list.add(o1);
		list.add(o2);

		return list;

	}

}
