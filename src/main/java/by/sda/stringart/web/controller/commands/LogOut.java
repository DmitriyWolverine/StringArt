package by.sda.stringart.web.controller.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static by.sda.stringart.web.controller.util.JspPagesNames.*;

import by.sda.stringart.service.UserService;

@Controller
@RequestMapping("/log_out")
public class LogOut {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	public LogOut() {
		super();
	}

	public LogOut(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doAction() {
		
		return FRONT_PAGE;
	}
	
}
