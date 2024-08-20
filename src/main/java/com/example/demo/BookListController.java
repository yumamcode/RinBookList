package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.mybatis.domain.TrnBooks;
import com.example.demo.mybatis.domain.TrnBooksExample;
import com.example.demo.mybatis.mapper.TrnBooksMapper;

@Controller
public class BookListController {
	
	@Autowired
	TrnBooksMapper autoGenBookMapper;
	
	static final String FORM_NAME = "bookListForm";
	
	@GetMapping("/bookList")
	public ModelAndView index(ModelAndView mav) {
		TrnBooksExample trnBooksExample = new TrnBooksExample();
		trnBooksExample.createCriteria().andIs_validEqualTo(true);
		List<TrnBooks> bookList = autoGenBookMapper.selectByExample(trnBooksExample);
		mav.addObject("bookList",bookList);
		mav.setViewName("book_list");
		return mav;
	}

}
