package hebbal.collections.MiniProjects.LMS_With_Cursor;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListLibrary 
{
	List<Book> l = new LinkedList<Book>();
	static Scanner sc;
	public static int sortingOn;

	public LinkedListLibrary(Scanner sc) 
	{
		this.sc = sc;
	}

	public void addBook() {
		l.add(readAddBook());
	}

	public void displayBook() 
	{
		if (l.size() == 0) {
			System.out.println("no database found");
		}
		else 
		{
			System.out.println("\n\nBookId\t\tTitle\t\tAuthor\t\tPrice\t\tYop\t\tShelf");
			displayList(l);
		}
	}

	public void removeBook() 
	{
		Book book = readRemoveBook();
		if (book == null) {
			System.out.println("No Data Found");
		} else 
		{
			Iterator<Book> itr = l.iterator();
			while (itr.hasNext()) 
			{
				Book b = itr.next();
				if (b.getBookId() == book.getBookId()) 
				{
					itr.remove();
					System.out.println(b.getTitle() + " has been removed");
					return;
				}
			}
			System.out.println(book.getBookId() + " has been not found in database");
		}
	}

	public void searchBook() {
		Book book = readSearchBook();

		if (book == null) {
			System.out.println("No Data Found");
		} else 
		{
			Iterator<Book> itr = l.iterator();
			while (itr.hasNext()) {
				Book b = itr.next();
				if (b.getBookId() == book.getBookId()) 
				{
					System.out.println(b.getTitle() + " has been found");
					return;
				}
			}
			System.out.println(book.getBookId() + " has not been found in database");
		}
	}

	public void sortBook() 
	{
		if (l.size() == 0) 
		{
			System.out.println("No Data Fount");
		} 
		else 
		{
			int choice = sortingOrder();
			sortingOn = sortWithColumn();
			System.out.println("\n\nBookId\t\tTitle\t\tAuthor\t\tPrice\t\tYop\t\tShelf");

			if (choice == 1) 
			{
				Collections.sort(l);
				displayList(l);
			}

			else if (choice == 2) 
			{
				Collections.sort(l, new Book());
				displayList(l);
			}

			else {
				System.out.println("\nInvalid choice");
			}

		}
	}

	public void updateBook() {
		Book book = readUpdateBook();
		if (book == null) {
			System.out.println("No Data Fount");
		}
		else
		{
			System.out.println("1. Update Title\n2. Update Price\n3. Update Shelf\n\nPlease enter your choice");
			int choice = sc.nextInt();

			Iterator<Book> itr = l.iterator();
			while (itr.hasNext()) 
			{
				Book b = itr.next();
				if (b.getBookId() == book.getBookId()) 
				{
					if (choice == 1) {
						System.out.println("Please enter new Title");
						b.setTitle(sc.next());
						System.out.println("Title has been updated to " + b.getTitle());
						return;
					}

					else if (choice == 2) {
						System.out.println("Please enter new Price");
						b.setPrice(sc.nextInt());
						System.out.println("Price has been updated to " + b.getPrice());
						return;
					}

					else if (choice == 3) {
						System.out.println("Please enter new Shelf");
						b.setShelf(sc.next());
						System.out.println("Shelf has been updated to " + b.getShelf());
						return;
					}

				}
			}
			System.out.println(book.getBookId() + " has been not found in database");
		}
	}

	public Book readSearchBook() {
		Book book;
		if (l.size() == 0) {
			book = null;
		} else {
			System.out.println("Please enter BookId to be Searched");
			int bookId = sc.nextInt();
			book = new Book(bookId);
		}
		return book;
	}

	public Book readRemoveBook() {
		Book book;
		if (l.size() == 0) {
			book = null;
		} else {
			System.out.println("Please enter BookId to be removed");
			int bookId = sc.nextInt();

			book = new Book(bookId);
		}

		return book;
	}

	public Book readAddBook() {
		System.out.println("Please enter BookId");
		int bookId = sc.nextInt();

		System.out.println("Please enter Book Title");
		String title = sc.next();

		System.out.println("Please enter Author Name");
		String author = sc.next();

		System.out.println("Please enter Book Price");
		double price = sc.nextDouble();

		System.out.println("Please enter Year of publication");
		int yop = sc.nextInt();

		System.out.println("Please enter Book Row and Shelf");
		String shelf = sc.next();

		return new Book(bookId, title, author, price, yop, shelf);
	}

	public Book readUpdateBook() {
		Book book;
		if (l.size() == 0) {
			book = null;
		} else {
			displayBook();
			System.out.println("Please enter BookId to be updated");
			int bookId = sc.nextInt();
			book = new Book(bookId);
		}
		return book;
	}

	public static int sortWithColumn() {
		System.out.println("\n1. Sort with Book Id\n2. Sort with Book Title\n3. Sort wirh Book Author");
		System.out.println("Please enter sorting choice:");
		return sc.nextInt();
	}

	public int sortingOrder() {
		System.out.println("\n1. Acsending Order\n2. Descending order\n\nPlease enter your choice:");
		return sc.nextInt();
	}
	
	public void displayList(List<Book> l)
	{
		Iterator<Book> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
