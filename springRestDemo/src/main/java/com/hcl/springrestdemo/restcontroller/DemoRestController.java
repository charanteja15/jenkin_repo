package com.hcl.springrestdemo.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/demo")
@RestController			//this internally uses response body
public class DemoRestController 
{
	@GetMapping("/get")
	public String getData()
	{
		return "hello,Welcome to rest API";
	}
	
	@PostMapping("/post")
	public String postData()
	{
		return "post() executed";
	}
	
	@PutMapping("/put")
	public String updateData()
	{
		return "update() executed";
	}
	
	@DeleteMapping("/delete")
	public String deleteData()
	{
		return "delete() executed";
	}
}
