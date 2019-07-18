package by.htp.aggregation_composition2.task1.service;

import java.util.List;

import by.htp.aggregation_composition2.task1.entity.Treasure;

public interface SelectService {

	List<Treasure> displayAll() throws ServiceException;

	Treasure findMax() throws ServiceException;

	List<Treasure> byPrice(int price) throws ServiceException;

}
