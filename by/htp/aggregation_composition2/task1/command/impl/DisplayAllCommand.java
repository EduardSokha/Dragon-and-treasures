package by.htp.aggregation_composition2.task1.command.impl;

import java.util.List;

import by.htp.aggregation_composition2.task1.command.Command;
import by.htp.aggregation_composition2.task1.entity.Treasure;
import by.htp.aggregation_composition2.task1.service.ServiceException;
import by.htp.aggregation_composition2.task1.service.ServiceProvider;

public class DisplayAllCommand implements Command {

	@Override
	public List<Treasure> doCommand(String[] params) {
		ServiceProvider provider = ServiceProvider.getInstance();
		List<Treasure> all = null;
		try {
			all = provider.getSelectService().displayAll();
		} catch (ServiceException e) {
			// log
			e.printStackTrace();
		}
		return all;
	}

}
