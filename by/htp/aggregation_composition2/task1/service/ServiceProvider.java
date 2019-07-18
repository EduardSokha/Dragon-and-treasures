package by.htp.aggregation_composition2.task1.service;

import by.htp.aggregation_composition2.task1.service.impl.SelectServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	private ServiceProvider() {
	}

	private SelectService selectService = new SelectServiceImpl();

	public static ServiceProvider getInstance() {
		return instance;
	}

	public SelectService getSelectService() {
		return selectService;
	}

}
