package by.htp.aggregation_composition2.task1.dao;

import java.util.List;

import by.htp.aggregation_composition2.task1.entity.Treasure;

public interface TreasureDAO {

	List<Treasure> takeTreasures() throws DAOException;

}
