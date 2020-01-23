package hebbal.collections.ArrayList.MoviesSorting;

import java.util.Comparator;

public class Movies implements Comparator<Movies>, Comparable<Movies> 
{
	private String name;
	private int year;
	private String director;

	public Movies(String name, int year, String director) {
		this.name = name;
		this.year = year;
		this.director = director;
	}
	public Movies()
	{
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return getName() + "\t\t" + getYear() + "\t\t" + getDirector();
	}
	
	@Override
	public int compareTo(Movies m)
	{
		String m1= this.getName();
		String m2= m.getName();
		
		return m1.compareTo(m2);
	}

	@Override
	public int compare(Movies m1, Movies m2) 
	{
		// Based on Color
		String d1 = m1.getName();
		String d2 = m2.getName();

		return d2.compareTo(d1);
	}
}
