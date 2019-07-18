package by.htp.aggregation_composition2.task1.start;

import by.htp.aggregation_composition2.task1.controller.Controller;
import by.htp.aggregation_composition2.task1.view.View;

public class Main {

	public static void main(String[] args) {

		Controller conlr = new Controller();

		View v = new View();
		v.setController(conlr);
		v.show();

	}

}
