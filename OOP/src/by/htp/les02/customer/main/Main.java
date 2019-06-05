package by.htp.les02.customer.main;

import java.util.List;

import by.htp.les02.customer.entity.*;
import by.htp.les02.customer.logic.GroupLogic;

public class Main {

	public static void main(String[] args) {

		Customer[] customer = new Customer[5];
		customer[0] = new Customer(4, "Kochkarov", "Magomet", "Robertovich", "Minsk, Kuzmi Chernogo street", 453670,
				445633308);
		customer[1] = new Customer(9, "Sidorov", "Andrey", "Michaelovich", "Kislovodsk, Lenin street", 313570,
				552344658);
		customer[2] = new Customer(2, "Ivanov", "Ivan", "Ivanovich", "Brest, Ivan street", 567567, 759423589);
		customer[3] = new Customer(1, "Petrov", "Petr", "Petrovich", "Grodno, Petr street", 115570, 112567894);
		customer[4] = new Customer(3, "Semenov", "Ilya", "Eduardovich", "Moscow, Kutuzov street", 866381, 775521036);

		// create group of customers (massive
		Group group = new Group(customer);

		// sort by alphabet
		GroupLogic.sortByAlphabet(group);

		// display the group
		displayGroup(group.getList());

		// display within the given range
		int min = 100000;
		int max = 400000;
		System.out.println("Customers found within the given range of " + min + " to " + max);
		displayGroup(GroupLogic.getWithinRange(group, min, max));

	}

	public static void displayGroup(List<Customer> list) {

		int i = 0;
		for (i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
