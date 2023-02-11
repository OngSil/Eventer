package eventer.com.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class memberController {
	
	private static final Logger logger = LoggerFactory.getLogger(memberController.class);
	

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {			
		return "login";
	}
	
	@RequestMapping(value = "/signup.do", method = RequestMethod.GET)
	public String signup(Locale locale, Model model) {			
		return "signup";
	}
	
}
