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
import by.sda.stringart.service.ArtistService;
import by.sda.stringart.service.UserService;

@Controller
public class CommonController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@Autowired
	@Qualifier("artistServiceImpl")
	private ArtistService artistService;

	public CommonController(UserService userService, ArtistService artistService) {
		super();
		this.userService = userService;
		this.artistService = artistService;
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authentication(ModelMap model, @RequestParam String login,  @RequestParam String password) {
	     if( userService.validateUser(login, password) ) {
	    	model.addAttribute(USER_LOGIN,login);
	    	model.addAttribute(ARTISTS_LIST,artistService.getAll());
	    	return USER_PAGE;
	    }
		model.addAttribute(USER_LOGIN,login);
		return AUTHENTICATION_FAILED_PAGE;
	}
	
	@RequestMapping(value = "/to_about_us", method = RequestMethod.POST)
	public String toAboutUsPage() {
		return ABOUT_US_PAGE;
	}
	
	@RequestMapping(value = "/to_authentication", method = RequestMethod.POST)
	public String toAuthenticationPage() {
		return AUTHENTICATION_PAGE;
	}
	
	@RequestMapping(value = "/to_news", method = RequestMethod.POST)
	public String toNewsPage() {
		return NEWS_PAGE;
	}
	
	@RequestMapping(value = "/to_registration", method = RequestMethod.POST)
	public String toRegistrationPage() {
		return REGISTRATION_PAGE;
	}
	
	@RequestMapping(value="/to_service", method = RequestMethod.POST)
	public String changePage() {
		 return SERVICE_PAGE;
	}
	
	@RequestMapping(value="/log_out", method = RequestMethod.POST)
	public String logOut() {
		return FRONT_PAGE;
	}
	
	@RequestMapping(value ="/registrate", method = RequestMethod.POST)
	public String registration(ModelMap model, @RequestParam String login, @RequestParam String password, @RequestParam String email) {
		for(User user: userService.getAll()) {
	    	  if( login.equals(user.getLogin()) || email.equals(user.getEmail()) ) {
	    		 return REGISTRATION_FAILED_PAGE;
	    	  }
	    }
		userService.create(login, email, password);
		model.addAttribute(USER_LOGIN,login);
    	model.addAttribute(ARTISTS_LIST,artistService.getAll());
		return USER_PAGE;
	}
}
