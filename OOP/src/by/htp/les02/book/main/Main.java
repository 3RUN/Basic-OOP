package by.htp.les02.book.main;

import java.util.*;

import by.htp.les02.book.entity.Book;
import by.htp.les02.book.entity.Library;
import by.htp.les02.book.logic.LibraryLogic;

public class Main {

	public static void main(String[] args) {

		Book[] book = new Book[5];
		book[0] = new Book(4, "Metro 2033", "Dmitry Glukhovsky", "Gollancz", 2010, 458, 3.47, "Hard cover");
		book[1] = new Book(7, "Hulinomics. Hooligan economy.", "Alexey Markov", "ACT", 2017, 390, 8.16, "Hard cover");
		book[2] = new Book(2, "Crime and Punishment", "Fyodor Dostoevsky", "The Russian Messenger", 1866, 545, 7.0,
				"Hard cover");
		book[3] = new Book(1, "Head First Java, 2nd Edition", "Bert Bates, Kathy Sierra", "O'Reilly Media, Inc", 2005,
				688, 14.22, "Soft cover");
		book[4] = new Book(13, "Fathers and Sons (novel)", "Ivan Turgenev", "The Russian Messenger", 1862, 226, 10.7,
				"Hard cover");

		// create massive
		Library library = new Library(book);

		String author = "Ivan Turgenev";
		String publisher = "The Russian Messenger";
		int year = 2010;

		// display by author
		System.out.println("Display by author " + author + ".");
		displayBookList(LibraryLogic.getByAuthors(library, author));

		// display by publisher
		System.out.println("Display by publisher " + publisher + ".");
		displayBookList(LibraryLogic.getByPublisher(library, publisher));

		// display by year
		System.out.println("Display starting from year " + year + ".");
		displayBookList(LibraryLogic.getByYear(library, year));

	}

	public static void displayBookList(List<Book> list) {

		int i = 0;
		for (i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

}
