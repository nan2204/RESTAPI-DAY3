package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Empmodel;
import com.example.demo.service.Empservice;

@RestController
public class Empcontroller {
	@Autowired
	Empservice eser;
	@PostMapping("addemp")
	public Empmodel add(@RequestBody Empmodel em)
	{
		return eser.saveinfo(em);
	}
	@GetMapping("showemp")
	public List<Empmodel> show()
	{
		return eser.showinfo();
	}

}
