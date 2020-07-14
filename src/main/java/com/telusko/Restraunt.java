package com.telusko;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restraunt {
	
	@RequestMapping ("/items")
	public List<Menu> getitems(){
	
	java.util.List<Menu> items = new ArrayList<>();
	 Menu m= new Menu();
	m.setTable(2);
	m.setRecepie("chicken");
	m.setPrice(300);
	items.add(m);
	return items;
}
}
