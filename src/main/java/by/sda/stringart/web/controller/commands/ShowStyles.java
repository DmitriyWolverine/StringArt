package by.sda.stringart.web.controller.commands;

import static by.sda.stringart.web.controller.util.JspParametresPool.*;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.sda.stringart.service.impl.StyleServiceImpl;

@Controller
@RequestMapping("/styleList")
public class ShowStyles {
		   @RequestMapping(method = RequestMethod.GET)
		   public String printHello(ModelMap model ) {
		      model.addAttribute(STYLES_LIST, new StyleServiceImpl().getAll());
		      return "stylesList";
		   }
	}

