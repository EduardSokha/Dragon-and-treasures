package by.htp.aggregation_composition2.task1.command.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.aggregation_composition2.task1.command.Command;
import by.htp.aggregation_composition2.task1.entity.Treasure;
import by.htp.aggregation_composition2.task1.service.ServiceException;
import by.htp.aggregation_composition2.task1.service.ServiceProvider;

public class FindMaxCommand implements Command {

	@Override
	public List<Treasure> doCommand(String[] params) {
		List<Treasure> findMax = new ArrayList<Treasure>();
		ServiceProvider provider = ServiceProvider.getInstance();
		Treasure max = null;
		try {
			max = provider.getSelectService().findMax();
		} catch (ServiceException e) {
			// log
			e.printStackTrace();
		}
		findMax.add(max);

		return findMax;
	}

}
