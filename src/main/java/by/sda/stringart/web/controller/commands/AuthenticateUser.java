package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.*;
import static by.sda.stringart.web.controller.util.JspParametresPool.USER_LOGIN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.sda.stringart.service.UserService;

@Controller
@RequestMapping("/authenticate")
public class AuthenticateUser {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	public AuthenticateUser() {
		super();
	}

	public AuthenticateUser(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String authentication(ModelMap model, @RequestParam String login,  @RequestParam String password) {
	     if( userService.validateUser(login, password) ) {
	    	model.addAttribute(USER_LOGIN,login);
	    	return USER_PAGE;
	    }
		model.addAttribute(USER_LOGIN,login);
		return AUTHENTICATION_FAILED_PAGE;
	}
	
	
}

