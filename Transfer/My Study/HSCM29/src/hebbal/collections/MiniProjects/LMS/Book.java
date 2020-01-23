package hebbal.collections.MiniProjects.LMS;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;
	private int yop;
	private String shelf;

	public Book(int bookId, String title, String author, double price, int yop, String shelf) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.yop = yop;
		this.shelf = shelf;
	}

	public Book(int bookId) 
	{
	this.bookId= bookId;
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
		return getBookId() + "\t\t" + getTitle() + "\t\t" + getAuthor()
				+ "\t\t" + getPrice() + "\t\t" + getYop() + "\t\t" + getShelf();
	}

}
