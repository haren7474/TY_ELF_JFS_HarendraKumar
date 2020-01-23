package hebbal.collections.MiniProjects.LMS;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListLibrary {
	List<Book> l = new LinkedList<Book>();
	Scanner sc;

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
		} else {
			System.out.println("\n\nBookId\t\tTitle\t\tAuthor\t\tPrice\t\tYop\t\tShelf");

			for (Book b : l) {
				System.out.println(b);
			}
		}
	}

	public void removeBook() {
		Book book = readRemoveBook();
		if (book == null) {
			System.out.println("No Data Fount");
		} else {
			for (Book b : l) {
				if (book.getBookId() == b.getBookId()) {
					l.remove(b);
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
			System.out.println("No Data Fount");
		} else {
			for (Book b : l) {
				if (book.getBookId() == b.getBookId()) {
					System.out.println(b.getTitle() + " has been found in database");
					return;
				}

			}
			System.out.println(book.getBookId() + " has not been found in database");
		}
	}

	public void updateBook()
	{
		Book book = readUpdateBook();
		if (book == null) {
			System.out.println("No Data Fount");
		} 
		else 
		{
			System.out.println("1. Update Title\n2. Update Price\n3. Update Shelf\n\nPlease enter your choice");
			int choice = sc.nextInt();
			
			for (Book b : l) 
			{
				if (book.getBookId() == b.getBookId()) 
				{
					if(choice==1)
					{
					System.out.println("Please enter new Title");
					b.setTitle(sc.next());
					System.out.println("Title has been updated to "+ b.getTitle());
					return;
					}
					
					else if(choice==2)
					{
					System.out.println("Please enter new Price");
					b.setPrice(sc.nextInt());
					System.out.println("Price has been updated to "+ b.getPrice());
					return;
					}
					
					else if(choice==3)
					{
					System.out.println("Please enter new Shelf");
					b.setShelf(sc.next());
					System.out.println("Shelf has been updated to "+ b.getShelf());
					return;
					}
				}
			}
			System.out.println(book.getBookId() + " has been not found in database");
		}
	}
	
	public Book readSearchBook() 
	{
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
	
	public Book readUpdateBook() 
	{
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

}
