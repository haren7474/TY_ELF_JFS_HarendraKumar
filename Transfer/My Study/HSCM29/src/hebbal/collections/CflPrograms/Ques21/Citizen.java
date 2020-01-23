package hebbal.collections.CflPrograms.Ques21;

import java.util.Comparator;

public class Citizen implements Comparable<Citizen>, Comparator<Citizen>
	{
	private String voterId;
	private String name;
	private int age;

	public Citizen(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	public Citizen(String voterId) 
	{
		this.voterId = voterId;
	}

	public Citizen() 
	{
		// TODO Auto-generated constructor stub
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return getName() + "\t\t" + getAge();
	}
	
	@Override
	public int compareTo(Citizen c)
	{
		int num=CitizenManagement.sortingOn;
		int ret=0;
		Integer v1= this.getAge();
		Integer v2= c.getAge();
		
		String s1= this.getVoterId();
		String s2= c.getVoterId();
		
		String s3= this.getName();
		String s4= c.getName();
		
		if(num==1) ret = s1.compareTo(s2);
		else if (num ==2) ret= s3.compareTo(s4);
		else if (num==3) ret= v1.compareTo(v2);
		
		return ret;
	}
	
	@Override
	public int compare(Citizen c1, Citizen c2)
	{
		int num=CitizenManagement.sortingOn;
		int ret=0;
		Integer age1= c1.getAge();
		Integer age2= c2.getAge();
		
		String id1= c1.getVoterId();
		String id2= c2.getVoterId();
		
		String name1= c1.getName();
		String name2= c2.getName();
		
		if(num==1) ret = id2.compareTo(id1);
		else if (num ==2) ret= name2.compareTo(name1);
		else if (num==3) ret= age2.compareTo(age1);

		return ret;
	}

}
