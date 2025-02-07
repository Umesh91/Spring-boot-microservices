package com.SpringCloudBookService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCloudBookService.model.Book;

@RestController
@RequestMapping("/book")
public class BookRestController
{
	@Autowired
	Environment environment;
	
	@GetMapping("/data")
	public String getBookData()
	{
		return "data of BOOK-SERVICE, Running on port: "+environment.getProperty("local.server.port");
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Integer id)
	{
		return new Book(id,"The Miracle Morning",675.00);
	}
	
	@GetMapping("/all")
	public List<Book> getAll()
	{
		return List.of(
				new Book(501,"The psychology of Money",750.00), 
				new Book(510,"Mossad",800.50), 
				new Book(540,"So good they can't Ignore",950.10) );
	}
	
	@GetMapping("/entity")
	public ResponseEntity<String> getEntityData()
	{
		return new ResponseEntity<String>("Hello from BookRestController ",HttpStatus.OK);
	}
	
}
