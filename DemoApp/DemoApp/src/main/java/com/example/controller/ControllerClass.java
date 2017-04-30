
package com.example.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Model;
import com.example.service.ServiceClass;

@RestController
public class ControllerClass {

@Autowired
ServiceClass sc;
 
@RequestMapping(value="/ok" )
public String ok(){
	return "It's Working ";
	
}

@RequestMapping("/all")
public Hashtable<String, Model> getAll() {
	return sc.getAll();
}

@RequestMapping("{id}")
public Model getModel(@PathVariable("id") String id){
	return sc.getModel(id);
}
}
