package by.htp.aggregation_composition2.task1.command.impl;

import java.util.List;

import by.htp.aggregation_composition2.task1.command.Command;
import by.htp.aggregation_composition2.task1.entity.Treasure;
import by.htp.aggregation_composition2.task1.service.ServiceException;
import by.htp.aggregation_composition2.task1.service.ServiceProvider;

public class ByPriceCommand implements Command {

	@Override
	public List<Treasure> doCommand(String[] params) {

		int price = Integer.parseInt(params[1].trim());
		System.out.println(price);
		ServiceProvider provider = ServiceProvider.getInstance();
		List<Treasure> treasures = null;
		try {
			treasures = provider.getSelectService().byPrice(price);
		} catch (ServiceException e) {
			// log
			e.printStackTrace();
		}

		return treasures;
	}

}
