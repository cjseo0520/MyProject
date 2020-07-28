package com.cjseo.Controller;

import java.util.Locale;
import java.util.logging.Logger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cjseo.Service.userService;
import com.cjseo.dao.userDAO;
import com.cjseo.dao.userVO;

@Controller
public class loginController {

	@Autowired userService us;
	@Autowired userDAO dao;
	//로그인페이지
	@RequestMapping(value="/login/", method = RequestMethod.GET)
	public ModelAndView login(userVO userVO) throws Exception {
		ModelAndView mav = new ModelAndView();
		System.out.println("로그인클릭완료");
		return mav;
	}
	//로그인처리페이지
	@RequestMapping(value="/login/", method = RequestMethod.POST)
	public ModelAndView loginPost(userVO userVO, HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("로그인완료111");
		return us.login(userVO, req, resp);
	}
	
	//회원가입
	@RequestMapping(value = "/signUp/" , method = RequestMethod.GET)
	public String signUpGet() throws Exception{
		return "signUp";
	}
	@RequestMapping(value = "/signUp/", method = RequestMethod.POST)
	public String signUpPost(userVO userVO) throws Exception{
		System.out.println(userVO.getUserid());
		us.insertUser(userVO);
		return "signUp";
	}
	@RequestMapping("/lostID/")
	public String lostID(Locale locale, Model model) {

		return "lostID";
	}
	@RequestMapping("/lostPW")
	public String lostPW(Locale locale, Model model) {

		return "lostPW";
	}
}
