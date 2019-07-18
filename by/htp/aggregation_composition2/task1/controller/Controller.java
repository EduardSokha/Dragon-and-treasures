package by.htp.aggregation_composition2.task1.controller;

import java.util.List;

import by.htp.aggregation_composition2.task1.command.Command;
import by.htp.aggregation_composition2.task1.command.CommandProvider;
import by.htp.aggregation_composition2.task1.entity.Treasure;

public class Controller {
	private CommandProvider provider = new CommandProvider();

	public List<Treasure> doAction(String request) {
		String[] params = request.split("\\s+ ");
		List<Treasure> response;

		Command command = provider.getCommand(params[0]);
		response = command.doCommand(params);

		return response;

	}

}
