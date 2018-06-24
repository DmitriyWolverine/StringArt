package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/to_registration")
public class GoToRegistration {
	 @RequestMapping(method = RequestMethod.POST)
	 public String printHello(ModelMap model ) {
		    return REGISTRATION_PAGE;
	 }

}
