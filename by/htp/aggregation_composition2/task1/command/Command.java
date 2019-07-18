package by.htp.aggregation_composition2.task1.command;

import java.util.List;

import by.htp.aggregation_composition2.task1.entity.Treasure;

public interface Command {

	List<Treasure> doCommand(String[] params);

}
