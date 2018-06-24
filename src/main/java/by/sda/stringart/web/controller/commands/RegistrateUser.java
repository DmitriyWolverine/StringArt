package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.USER_PAGE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.sda.stringart.service.UserService;

@Controller
@RequestMapping("/registrate")
public class RegistrateUser {
	
	@Autowired
	private UserService userService;
	
	public RegistrateUser() {
		super();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doAction(ModelMap model ) {
		
		 return USER_PAGE;
	}
}
