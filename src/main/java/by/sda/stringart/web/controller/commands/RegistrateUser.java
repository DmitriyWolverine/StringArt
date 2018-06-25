package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.*;
import static by.sda.stringart.web.controller.util.JspParametresPool.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.sda.stringart.bean.users.User;
import by.sda.stringart.dao.UserDao;
import by.sda.stringart.service.UserService;
import by.sda.stringart.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/registrate")
public class RegistrateUser {
	
	/*@Autowired
	@Qualifier("userServiceImpl")*/
	private UserService userService;
	
	public RegistrateUser() {
		super();
		userService = new UserServiceImpl();
	}
	
	public RegistrateUser(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doAction(ModelMap model, @RequestParam String login, @RequestParam String email, @RequestParam String password) {
		for(User user: userService.getAll()) {
	    	  if( login.equals(user.getLogin()) || email.equals(user.getEmail()) ) {
	    		 return REGISTRATION_FAILED_PAGE;
	    	  }
	    }
		userService.create(login, email, password);
		model.addAttribute(USER_LOGIN,login);
		return USER_PAGE;
	}
}
