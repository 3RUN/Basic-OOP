package by.htp.les02.book.logic;

import java.util.*;

import by.htp.les02.book.entity.Book;
import by.htp.les02.book.entity.Library;

public class LibraryLogic {

	public static List<Book> getByAuthors(Library library, String authors) {

		int i = 0;
		List<Book> list = library.getList();
		List<Book> temp = new ArrayList<Book>();

		for (i = 0; i < list.size(); i++) {

			if (list.get(i).getAuthors().equals(authors)) {
				temp.add(list.get(i));
			}

		}

		return temp;

	}

	public static List<Book> getByPublisher(Library library, String publisher) {

		int i = 0;
		List<Book> list = library.getList();
		List<Book> temp = new ArrayList<Book>();

		for (i = 0; i < list.size(); i++) {

			if (list.get(i).getPublisher().equals(publisher)) {
				temp.add(list.get(i));
			}

		}

		return temp;

	}

	public static List<Book> getByYear(Library library, int year) {

		int i = 0;
		List<Book> list = library.getList();
		List<Book> temp = new ArrayList<Book>();

		for (i = 0; i < list.size(); i++) {

			if (list.get(i).getYear() >= year) {
				temp.add(list.get(i));
			}

		}

		return temp;

	}

}
