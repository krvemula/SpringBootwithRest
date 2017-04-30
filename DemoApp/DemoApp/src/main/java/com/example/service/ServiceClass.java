package com.example.service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import com.example.model.Model;

@Service
public class ServiceClass {
	Hashtable<String, Model> models = new Hashtable<String, Model>();
	public  ServiceClass() {
		Model m =new Model();
		m.setId("101");
		m.setFirstname("Radhika");
		m.setLastname("vemula");
		models.put("101", m);

		m =new Model();
		m.setId("102");
		m.setFirstname("Radhi");
		m.setLastname("v");
		models.put("102", m);
	}
	public Model getModel(String id){
		if(models.containsKey(id)) 
			return models.get(id);
		else
			return null;
	}

	public Hashtable<String, Model> getAll() {
     return models;
	}
}
