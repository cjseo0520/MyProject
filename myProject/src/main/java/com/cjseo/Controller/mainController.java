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
	
	@Autowired userService us;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home.page";
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginPost(userVO userVO) {
		System.out.println(userVO.getUserid());
		us.selectUser(userVO);

		return "login";
	}
	//회원가입
	@RequestMapping(value = "/signUp" , method = RequestMethod.GET)
	public String signUpGet() throws Exception{
		return "signUp";
	}
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUpPost(userVO userVO) throws Exception{
		System.out.println(userVO.getUserid());
		us.insertUser(userVO);
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
