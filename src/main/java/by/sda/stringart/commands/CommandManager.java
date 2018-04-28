package by.sda.stringart.commands;

import java.util.HashMap;
import java.util.Map;

import by.sda.stringart.commands.impl.DefaultCommand;
import by.sda.stringart.commands.impl.ShowArtists;

import static by.sda.stringart.commands.util.CommandsPool.SHOW_ARTISTS_LIST;


public class CommandManager {
	private static final CommandManager manager = new CommandManager();
	
	private Map<String, BaseCommand> commands;

	private CommandManager() {
		commands = new HashMap<>();
		commands.put(SHOW_ARTISTS_LIST, new ShowArtists());
	}
	
	public static CommandManager getManager() {
		return manager;
	}
	
	public BaseCommand defineServerAction(String action) {
		BaseCommand command = null;
		if(action != null) {
			command = commands.get(action);
		}
		else {
			command = new DefaultCommand();
		}
		return command;
	}
}
