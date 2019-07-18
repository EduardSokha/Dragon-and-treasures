package by.htp.aggregation_composition2.task1.view;

import java.util.List;
import java.util.Scanner;

import by.htp.aggregation_composition2.task1.controller.Controller;
import by.htp.aggregation_composition2.task1.entity.Treasure;

public class View {

	private Controller controller;
	private Scanner scan = new Scanner(System.in);

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public int selectCommand() {
		System.out.println("choose command");
		scan = new Scanner(System.in);
		int userSelect = scan.nextInt();
		return userSelect;
	}

	public String dispAll() {
		String command = "displayAll  20";
		return command;

	}

	public String findMax() {
		String command = "findMax  20";
		return command;

	}

	public String byPrice() {
		System.out.println("choose command+price");
		scan = new Scanner(System.in);
		String command = scan.nextLine();
		return command;

	}

	public void show() {
		String req;
		int userCh = selectCommand();
		List<Treasure> resp;

		if (userCh < 0 && userCh > 3) {
			System.out.println(" not available command");
			userCh = selectCommand();
		}

		switch (userCh) {
		case 1:
			req = dispAll();
			resp = controller.doAction(req);
			System.out.println(resp);
			break;
		case 2:
			req = findMax();
			resp = controller.doAction(req);
			System.out.println(resp);
			break;
		case 3:
			req = byPrice();
			resp = controller.doAction(req);
			System.out.println(resp);
			break;
		}

	}

}
