package by.htp.aggregation_composition2.task1.dao;

import by.htp.aggregation_composition2.task1.dao.impl.FileTreasureDAO;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private TreasureDAO treasureDAO = new FileTreasureDAO();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public TreasureDAO getTreasureDAO() {
		return treasureDAO;
	}

}
