package eventer.com.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class eventController {
	
	private static final Logger logger = LoggerFactory.getLogger(eventController.class);
	

	@RequestMapping(value = "/event.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {			
		return "event";
	}
	
}
