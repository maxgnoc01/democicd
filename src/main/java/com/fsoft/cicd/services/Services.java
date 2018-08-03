package com.fsoft.cicd.services;

import java.util.*;

import com.fsoft.cicd.models.Models;

public class Services {
	private String format = "Hello %c";
	private List<Models> list = new ArrayList<Models>();
	
	private void init() {
		for (int i =0;i<5;i++) {
			Models model = new Models(i, String.format(format, 65+i));
			list.add(model);
		}
	}
	public List<Models> getAll(){
		if (list.isEmpty()) {
			init();
		}
		return list;
	}
	public Models getById (int id) {
		if (list.isEmpty()) {
			init();
		}
		for (int i = 0; i < list.size();i++) {
			if (list.get(i).getId() == id) return list.get(i);
		}
		return null;
	}

}