package com.cjseo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cjseo.Service.userService;
import com.cjseo.dao.userVO;


@Controller
public class mainController {
	
	@Autowired userService us;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home.page";
	}

//	@RequestMapping("/testPage.do")
//	public String testPage() {
//		return "test.page";
//	}
//
//	@RequestMapping("/testPart.do")
//	public String testPart() {
//		return "test.part";
//	}
}
