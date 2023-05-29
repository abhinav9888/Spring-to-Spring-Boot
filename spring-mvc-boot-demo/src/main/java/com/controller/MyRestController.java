package com.controller;

import com.bean.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Book;

@RestController //@RestController = @Controller + @ResponseBody
public class MyRestController {
	
	List<Book> books = new ArrayList<>();
	
	public MyRestController() {
		books.add(new Book("Spring In Action", 590.90));
		books.add(new Book("Spring In NutShell", 365.45));
	}
	
	@GetMapping("/all")
	public List<Book> showAll()
	{
		return books;
	}
	
	@GetMapping("/add")
	public String addNew(@RequestBody Book book)
	{
		if(books.add(book))
			return "Record added";
		else
			return "Faield to add";
	}

}
