package com.cjseo.Controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
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
