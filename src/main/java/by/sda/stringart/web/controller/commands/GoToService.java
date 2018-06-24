package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspPagesNames.SERVICE_PAGE;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/to_service")
public class GoToService {

	@RequestMapping(method = RequestMethod.POST)
	public String changePage(ModelMap model ) {
		 return SERVICE_PAGE;
	}
}