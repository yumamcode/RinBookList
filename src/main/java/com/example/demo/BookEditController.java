package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookEditController {
	
	@GetMapping("/bookEdit/index")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("book_edit_index");
		return mav;
	}

}
