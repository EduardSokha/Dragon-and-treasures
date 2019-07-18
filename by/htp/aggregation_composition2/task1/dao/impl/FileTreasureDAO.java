package by.htp.aggregation_composition2.task1.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.aggregation_composition2.task1.dao.DAOException;
import by.htp.aggregation_composition2.task1.dao.TreasureDAO;
import by.htp.aggregation_composition2.task1.entity.Treasure;

public class FileTreasureDAO implements TreasureDAO {

	public FileTreasureDAO() {

	}

	@Override
	public List<Treasure> takeTreasures() throws DAOException {
		List<Treasure> allTreasures = new ArrayList<Treasure>();
		File file;
		FileReader fr = null;
		try {
			String[] params;
			file = new File("src/by/htp/aggregation_composition2/task1/resource/treasure.txt");
			fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			while (line != null) {
				params = line.split("\\s+");
				String name = params[0];
				int price = Integer.parseInt(params[1].trim());
				Treasure treasure = new Treasure(name, price);
				allTreasures.add(treasure);
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			throw new DAOException("fdgdfgfdgd", e);
		} catch (IOException e) {
			throw new DAOException("fdgdfgfdgd", e);
		} finally {

			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// log
				}
			}

		}

		return allTreasures;
	}

}
