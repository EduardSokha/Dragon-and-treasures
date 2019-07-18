package by.htp.aggregation_composition2.task1.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.aggregation_composition2.task1.dao.DAOException;
import by.htp.aggregation_composition2.task1.dao.DAOProvider;
import by.htp.aggregation_composition2.task1.entity.Treasure;
import by.htp.aggregation_composition2.task1.service.SelectService;
import by.htp.aggregation_composition2.task1.service.ServiceException;

public class SelectServiceImpl implements SelectService {
	private DAOProvider provider = DAOProvider.getInstance();

	@Override
	public List<Treasure> displayAll() throws ServiceException {
		List<Treasure> browseTreasure;
		try {
			browseTreasure = provider.getTreasureDAO().takeTreasures();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return browseTreasure;
	}

	@Override
	public Treasure findMax() throws ServiceException {
		int max = 0;
		int index = 0;
		List<Treasure> browseTreasure;
		try {
			browseTreasure = provider.getTreasureDAO().takeTreasures();

			for (int i = 0; i < browseTreasure.size(); i++) {

				if (browseTreasure.get(i).getPrice() > max) {
					max = browseTreasure.get(i).getPrice();
					index = i;
				}

				if (i == browseTreasure.size() - 1) {
					return browseTreasure.get(index);

				}
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return null;
	}

	@Override
	public List<Treasure> byPrice(int price) throws ServiceException {
		int sum = 0;
		List<Treasure> browseTreasure;
		List<Treasure> sumList;

		try {
			browseTreasure = provider.getTreasureDAO().takeTreasures();
			sumList = new ArrayList<Treasure>();

			for (int i = 0; i < browseTreasure.size(); i++) {
				if (browseTreasure.get(i).getPrice() > price) {
					continue;
				}
				if (browseTreasure.get(i).getPrice() + sum > price) {
					continue;
				}

				sum += browseTreasure.get(i).getPrice();
				Treasure gf = browseTreasure.get(i);
				sumList.add(gf);
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return sumList;
	}

}
