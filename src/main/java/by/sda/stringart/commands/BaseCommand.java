package by.sda.stringart.commands;

import javax.servlet.http.HttpServletRequest;

public interface BaseCommand {
	String doAction(HttpServletRequest request);

}
