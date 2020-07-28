package com.cjseo.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.cjseo.dao.userDAO;
import com.cjseo.dao.userVO;

@Service
public class userService {

	@Autowired userDAO udao;

	public void insertUser(userVO userVO) {
		udao.insertUser(userVO);
	}

	public ModelAndView login(userVO userVO, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 on!!!");
		ModelAndView mav = new ModelAndView();
		
		userVO login = udao.login(userVO);
		
		HttpSession session = request.getSession();
				
		Cookie emailCookie = new Cookie("userid",userVO.getUserid());
		if (login != null) {
			session.setAttribute("login", login);
			mav.setViewName("home");				// 로그인 성공 시 login세션 생성하고 home화면으로 이동
			System.out.println("mav" + mav);
			if("on".equals(request.getParameter("rememberid"))) {	// 이메일 기억하기 체크 되어있을 때 이메일 쿠키 생성
//				System.out.println("체크 o : " + request.getParameter("rememberEmail"));
				emailCookie.setMaxAge(60 * 60 * 24 * 7);		// cookie 유효시간 7일
				emailCookie.setPath("/");		//				// 모든 경로에서 쿠키 유효
			}else {
				System.out.println("체크 x : " + request.getParameter("rememberid")); // 이메일 기억하기 체크 해제 되어있을 때 
				emailCookie = new Cookie("idCookie", null);					// 이메일 쿠키가 이미 생성 되어있을 경우 쿠키 삭제
				emailCookie.setMaxAge(0); 										// 쿠키 유호시간 0으로 세팅
				emailCookie.setPath("/");
			}
			response.addCookie(emailCookie);
		} else { mav.setViewName("loginError"); }	//로그인 실패 시 loginError페이지 이동

		return mav;
	}
}
