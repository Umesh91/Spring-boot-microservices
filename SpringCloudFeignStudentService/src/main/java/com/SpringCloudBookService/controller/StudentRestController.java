package com.SpringCloudBookService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController 
{
	@Autowired
	private BookRestConsumer consumer;
	
	@GetMapping("/data")
	public String getStudentInfo()
	{
		//prints as a proxy class
		System.out.println(consumer.getClass().getName());
		return "Accessing from STUDENT-SERVICE ==>" +consumer.getBookData();
	}
	
	@GetMapping("/allBooks")
	public String getBooksInfo()
	{
		return "Accessing BOOKS INFO from STUDENT-SERVICE ==>" +consumer.getAllBooks();
	}
	
	@GetMapping("/getOneBook/{id}")
	public String getOneBookForStd(@PathVariable Integer id)
	{
		return "Accessing ONE BOOK INFO from STUDENT-SERVICE ==>" +consumer.getBookById(id);
	}
	
	@GetMapping("/entityData")
	public String printEntityData()
	{
		ResponseEntity<String> resp=consumer.getEntityData();
		return "Accessing from STUDENT-SERVICE ==>" +resp.getBody()+", Status code is:"+resp.getStatusCode(); 
	}
	
}
