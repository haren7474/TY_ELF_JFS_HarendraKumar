package hebbal.collections.ArrayList.StudentEmployee_Ex;

import java.util.ArrayList;
import java.util.List;

public class CarAndBookArrayListMainClass {
	public static void main(String[] args) {
		List carAndBook = new ArrayList();
		carAndBook.add(new Car("Audi", "Red", 2005, 3000000));
		carAndBook.add(new Car("RR", "Black", 1965, 8040000));
		carAndBook.add(new Car("Merc", "White", 1990, 6140000));
		carAndBook.add(new Car("BMW", "Gray", 1985, 3500000));
		carAndBook.add(new Car("Swift", "Pink", 2015, 500000));
		carAndBook.add(new Car("Jeep", "White", 2015, 1200000));

		carAndBook.add(new Book("Java", "Imtiaz", 350, 2015));
		carAndBook.add(new Book("Java", "Padma", 450, 2000));
		carAndBook.add(new Book("SQL", "Shubham", 250, 2017));
		carAndBook.add(new Book("Program", "Nitesh", 300, 2016));
		carAndBook.add(new Book("A Java", "Imtiaz", 550, 2019));
		carAndBook.add(new Book("Apti", "Padma", 200, 2012));
		carAndBook.add(new Book("Java", "Haren", 3000, 2022));

		// Display only Car Object
		System.out.println("----------------Q1 Display only Car Object-----------------");
		System.out.println("brand\t\tcolor\t\tyom\t\tprice");
		for (int i = 0; i < carAndBook.size(); i++) 
		{
			Object obj = carAndBook.get(i);
			if (obj instanceof Car) {
				System.out.println(obj);
			}
		}

		// Display only Red Car Object
		System.out.println("\n----------------Q2 Display only Red Car Object-----------------");
		System.out.println("brand\t\tcolor\t\tyom\t\tprice");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);

			if (obj instanceof Car) 
			{
				Car c = (Car) obj;
				if (c.getColor().equalsIgnoreCase("red")) {
					System.out.println(obj);
				}

			}
		}

		// Display All Cars whose price between 10L 30L
		System.out.println("\n---------------Q3 Display All Cars whose price between 10L 40L-----------------");
		System.out.println("brand\t\tcolor\t\tyom\t\tprice");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);

			if (obj instanceof Car) {
				Car c = (Car) obj;
				if (c.getPrice() > 1000000 && c.getPrice() < 4000000) {
					System.out.println(obj);
				}

			}
		}

		// Display All white Cars whose yom 2015
		System.out.println("\n---------------Q4 Display All Cars whose price between 10L 40L-----------------");
		System.out.println("brand\t\tcolor\t\tyom\t\tprice");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);

			if (obj instanceof Car) {
				Car c = (Car) obj;
				if (c.getColor().equalsIgnoreCase("white") && c.getYom() == 2015) {
					System.out.println(obj);
				}

			}
		}

		// Display only Book Object
		System.out.println("----------------Q5 Display only Book Object-----------------");
		System.out.println("title\t\tauthor\t\tprice\t\tyop");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);
			if (obj instanceof Book) {
				System.out.println(obj);
			}
		}

		// Display only Books written by Padma
		System.out.println("\n----------------Q6 Display only Books written by Padma-----------------");
		System.out.println("title\t\tauthor\t\tprice\t\tyop");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);

			if (obj instanceof Book) {
				Book b = (Book) obj;
				if (b.getAuthor().equalsIgnoreCase("padma")) {
					System.out.println(obj);
				}

			}
		}

		// Display all authors of differene java books
		System.out.println("\n----------------Q7 Display  all authors of differene java books-----------------");
		System.out.println("title\t\tauthor");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);

			if (obj instanceof Book) {
				Book b = (Book) obj;
				if (b.getTitle().contains("Java")) {
					System.out.println(b.getTitle()+"\t\t"+ b.getAuthor());
				}

			}
		}
		
		// Display all books witten by Padma and price <300
		System.out.println("\n----------------Q7 Display all books witten by Padma and price <300-----------------");
		System.out.println("title\t\tauthor\t\tprice\t\tyop");
		for (int i = 0; i < carAndBook.size(); i++) {
			Object obj = carAndBook.get(i);

			if (obj instanceof Book) 
			{
				Book b = (Book) obj;
				if (b.getAuthor().equalsIgnoreCase("padma") && (b.getPrice()<300)) 
				{
					System.out.println(obj);
				}

			}
		}
	}
}
 