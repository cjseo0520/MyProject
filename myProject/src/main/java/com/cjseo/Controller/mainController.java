package com.cjseo.Controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cjseo.Service.userService;
import com.cjseo.dao.userVO;



@Controller
public class mainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home.page";
	}
	@RequestMapping("/login")
	public String login(Locale locale, Model model) {

		return "login";
	}
	//회원가입
	@RequestMapping(value = "/signUp" , method = RequestMethod.POST)
	public String signUp(userVO userVO) {
//		us.userSignup(userVO);
		return "signUp";
	}
	@RequestMapping("/lostID")
	public String lostID(Locale locale, Model model) {

		return "lostID";
	}
	@RequestMapping("/lostPW")
	public String lostPW(Locale locale, Model model) {

		return "lostPW";
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
