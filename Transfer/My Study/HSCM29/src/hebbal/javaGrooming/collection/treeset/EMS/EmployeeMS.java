package hebbal.javaGrooming.collection.treeset.EMS;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMS {
	public static void main(String[] args) {

		Set<Employee> se = new TreeSet<Employee>();
		se.add(new Employee("JSP123", "Imtiaz", 6.5));
		se.add(new Employee("JSP127", "Keeth", 4.2));
		se.add(new Employee("JSP125", "Shubham", 7));
		se.add(new Employee("JSP126", "Neitesh", 2));
		se.add(new Employee("JSP124", "Chetan", 1));
		se.add(new Employee("JSP128", "Sumera", 8));
		se.add(new Employee("JSP129", "Dil", 1.5));
		se.add(new Employee("JSP120", "Vil", 7.8));

		//---------------------Sort and Print-----------------
		System.out.println("EmpID\t\tEmpName\t\tYOE\n");
		for (Employee e : se) {
			System.out.println(e);
		}

		//----------------------Exp Count------------------
		Iterator<Employee> itr = se.iterator();
		int exp1 = 0, exp2 = 0, exp3 = 0, exp4 = 0;
		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.getExp() > 0 && e.getExp() <= 2) {
				exp1++;
			}

			else if (e.getExp() > 2 && e.getExp() <= 5) {
				exp2++;
			}

			else if (e.getExp() > 5 && e.getExp() <= 7) {
				exp3++;
			} else {
				exp4++;
			}
		}

		System.out.println("\n\n0-2 Exp Count:\t\t" + exp1 + "\n2-5 Exp Count\t\t" + exp2 + "\n5-7 Exp Count\t\t" + exp3
				+ "\n7+ Exp Count\t\t" + exp4);

		//----------------Remove Employee--------------------
		itr = se.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			if (e.getExp() < 2) {
				itr.remove();
			}
		}
		
		System.out.println("\n\nUpdated List\nEmpID\t\tEmpName\t\tYOE\n");
		for (Employee e : se) {
			System.out.println(e);
		}
	}
}
