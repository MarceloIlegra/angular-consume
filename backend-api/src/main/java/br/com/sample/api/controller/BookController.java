package br.com.sample.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sample.api.database.mapper.BookMapper;
import br.com.sample.api.model.BookModel;

@RestController
public class BookController {
	
	@Autowired
	private BookMapper bookMapper;

	@RequestMapping(method=RequestMethod.GET, value="api/books")
	public List<BookModel> get(){
		return bookMapper.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="api/books")
	public Long save(@RequestBody BookModel book){
		return bookMapper.save(book);
	}	
	
}
