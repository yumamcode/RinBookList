package com.example.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Book;
import com.example.demo.form.BookEditForm;
import com.example.demo.mapper.BookMapper;

@Controller
public class BookEditController {
	
	@Autowired
	BookMapper bookMapper;
	
	static final String FORM_NAME = "bookEditForm";
	
	@GetMapping("/bookEdit/index")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("book_edit_index");
		return mav;
	}
	
	@PostMapping("/bookEdit/register")
	public ModelAndView register(ModelAndView mav,BookEditForm form) {
		
		return updateIndex(mav,form);
	}
	
	@GetMapping("/bookEdit/updateIndex")
	public ModelAndView updateIndex(ModelAndView mav,BookEditForm form) {
		
		Book book = bookMapper.selectByPrimaryKey(form.getId());
		
		BeanUtils.copyProperties(book,form);
		
		mav.addObject(FORM_NAME,form);
		
		return mav;
	}

}
