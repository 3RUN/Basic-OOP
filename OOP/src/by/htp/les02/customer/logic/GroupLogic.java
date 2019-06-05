package by.htp.les02.customer.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les02.customer.entity.Customer;
import by.htp.les02.customer.entity.Group;

public class GroupLogic {

	public static List<Customer> getWithinRange(Group group, int min, int max) {

		int i = 0;
		List<Customer> list = group.getList();
		List<Customer> temp = new ArrayList<Customer>();

		for (i = 0; i < list.size(); i++) {

			if (list.get(i).getCreditcard() > min && list.get(i).getCreditcard() < max) {
				temp.add(list.get(i));
			}

		}

		return temp;

	}

	public static void sortByAlphabet(Group group) {

		int i = 0;
		int j = 0;
		List<Customer> list = group.getList();
		Customer temp;

		for (i = 0; i < list.size(); i++) {

			for (j = i + 1; j < list.size(); j++) {

				// alphabetical order
				// get surnames to compare
				String surnameA = list.get(i).getSurname();
				String surnameB = list.get(j).getSurname();

				if (surnameA.compareTo(surnameB) > 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}

			}

		}

	}

}
