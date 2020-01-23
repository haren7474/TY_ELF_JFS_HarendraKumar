package hebbal.collections.MiniProjects.LMS_With_Cursor;

import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book> 
{
	private int bookId;
	private String title;
	private String author;
	private double price;
	private int yop;
	private String shelf;

	public Book(int bookId, String title, String author, double price, int yop, String shelf) 
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.yop = yop;
		this.shelf = shelf;
	}

	public Book() 
	{

	}

	public Book(int bookId) {
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getShelf() {
		return shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

	@Override
	public String toString() {
		return getBookId() + "\t\t" + getTitle() + "\t\t" + getAuthor() + "\t\t" + getPrice() + "\t\t" + getYop()
				+ "\t\t" + getShelf();
	}

	@Override
	public int compareTo(Book b) 
	{
		int num = 0;
		Integer i1 = this.getBookId();
		Integer i2 = b.getBookId();

		String t1 = this.getTitle();
		String t2 = b.getTitle();

		String a1 = this.getAuthor();
		String a2 = b.getAuthor();

		if (LinkedListLibrary.sortingOn == 1)
			num = i1.compareTo(i2);

		else if (LinkedListLibrary.sortingOn == 2)
			num = t1.compareTo(t2);

		else if (LinkedListLibrary.sortingOn == 3)
			num = a1.compareTo(a2);

		return num;
	}

	@Override
	public int compare(Book b1, Book b2) 
	{
		int num = 0;
		Integer i1 = b1.getBookId();
		Integer i2 = b2.getBookId();

		String t1 = b1.getTitle();
		String t2 = b2.getTitle();

		String a1 = b1.getAuthor();
		String a2 = b2.getAuthor();

		if (LinkedListLibrary.sortingOn == 1)
			num = i2.compareTo(i1);

		else if (LinkedListLibrary.sortingOn == 2)
			num = t2.compareTo(t1);

		else if (LinkedListLibrary.sortingOn == 3)
			num = a2.compareTo(a1);

		return num;
	}
}
