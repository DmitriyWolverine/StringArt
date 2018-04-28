package by.sda.stringart.commands.impl;

import by.sda.stringart.commands.BaseCommand;

import static by.sda.stringart.web.controller.util.JspNames.START_PAGE;

import javax.servlet.http.HttpServletRequest;;

public class DefaultCommand implements BaseCommand{

	@Override
	public String doAction(HttpServletRequest request) {
		return START_PAGE;
	}

}
