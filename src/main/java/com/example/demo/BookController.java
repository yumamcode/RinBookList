package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;

@Controller
public class BookController {
	
	@Autowired
	BookMapper bookMapper;
	
	@GetMapping("/book/index")
	public ModelAndView index(ModelAndView mav) {
		List<Book> bookList = bookMapper.selectAll();
		mav.addObject("bookList",bookList);
		mav.setViewName("book_index");
		return mav;
	}

}
