package by.htp.aggregation_composition2.task1.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.aggregation_composition2.task1.command.impl.ByPriceCommand;
import by.htp.aggregation_composition2.task1.command.impl.DisplayAllCommand;
import by.htp.aggregation_composition2.task1.command.impl.FindMaxCommand;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();

	public CommandProvider() {

		commands.put(CommandName.DISPLAYALL, new DisplayAllCommand());
		commands.put(CommandName.FINDMAX, new FindMaxCommand());
		commands.put(CommandName.PRICE, new ByPriceCommand());

	}

	public Command getCommand(String strCommandName) {
		CommandName commandName = CommandName.valueOf(strCommandName.toUpperCase());
		Command command;
		command = commands.get(commandName);
		return command;
	}

}
