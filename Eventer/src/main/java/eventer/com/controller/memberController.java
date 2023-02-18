package eventer.com.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import eventer.com.domain.Member;
import eventer.com.service.MemberService;

@Controller
public class memberController {
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(memberController.class);
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {			
		return "login";
	}
	
	@RequestMapping(value = "/goSignup.do", method = RequestMethod.GET)
	public String goSignup() {			
		return "signup";
	}
	
	          
	@RequestMapping(value = "/signup.do")
	public String signup(String user_id, String name, String password, String phone, String interest_item1, String interest_item2, String interest_item3, String user_type) {	
		Member member = new Member();
		
		int seqNo = memberService.getMemberSeqNo();
		member.setSeq_no(seqNo);
		
		member.setUser_id(user_id);
		member.setName(name);
		member.setPassword(password);
		member.setPhone(phone);
		member.setInterest_item1(interest_item1);
		member.setInterest_item2(interest_item2);
		member.setInterest_item3(interest_item3);
		member.setUser_type(user_type);
		
		memberService.doSignUp(member);
		return "signup";
	}
}
