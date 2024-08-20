package com.example.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.form.BookEditForm;
import com.example.demo.mapper.BookMapper;
import com.example.demo.mybatis.domain.TrnBooks;
import com.example.demo.mybatis.mapper.TrnBooksMapper;

@Controller
public class BookEditController {

	@Autowired
	BookMapper bookMapper;

	@Autowired
	TrnBooksMapper autoGenBookMapper;

	static final String FORM_NAME = "bookEditForm";

	@GetMapping("bookEdit/index")
	public ModelAndView index(ModelAndView mav, BookEditForm form) {
		TrnBooks book = autoGenBookMapper.selectByPrimaryKey(form.getId());
		BeanUtils.copyProperties(book, form);
		mav.addObject(FORM_NAME, form);
		mav.setViewName("book_edit");
		return mav;
	}

	@PostMapping("/bookEdit/register")
	public ModelAndView register(ModelAndView mav, BookEditForm form) {

		return index(mav, form);
	}

}
