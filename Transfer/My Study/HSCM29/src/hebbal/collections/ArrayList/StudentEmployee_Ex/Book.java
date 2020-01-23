package hebbal.collections.ArrayList.StudentEmployee_Ex;

public class Book 
{
	private String title;
	private String author;
	private double price;
	private int yop;
	
	public Book(String title, String author, double price, int yop) 
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.yop = yop;
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

	@Override
	public String toString() {
		return getTitle() + "\t\t" + getAuthor() + "\t\t" + getPrice() + "\t\t" + getYop();
	}
	
	
}
