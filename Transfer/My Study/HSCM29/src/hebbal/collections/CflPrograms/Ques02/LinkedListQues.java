package hebbal.collections.CflPrograms.Ques02;

import java.util.LinkedList;

public class LinkedListQues {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Hello");
		l.add("Shubham");
		l.add(56.15);
		l.add(54f);
		l.add(20);
		l.add(33);

		System.out.println("\n---Integer Objects------");
		for (Object obj : l) {
			if (obj instanceof Integer) {
				System.out.print(obj + " ");
			}
		}

		System.out.println("\n---Even Integer Objects------");
		for (int i = 0; i < l.size(); i++) {
			Object obj = l.get(i);
			if (obj instanceof Integer) {
				Integer itr = (Integer) obj;

				if (itr % 2 == 0) {
					{
						System.out.print(obj + " ");
					}
				}
			}
		}

		System.out.println("\n---Starts with S------");
		for (int i = 0; i < l.size(); i++) {
			Object obj = l.get(i);
			if (obj instanceof String) {
				String itr = (String) obj;

				if (itr.startsWith("S")) {
					{
						System.out.print(obj + " ");
					}
				}
			}
		}
		
		System.out.println("\nOriginol List\n" + l);
		System.out.println("\n---Remove Begining object------");
		l.removeFirst();
		System.out.println(l);
		
		System.out.println("\n---Remove Last object------");
		l.removeLast();
		System.out.println(l);

	}

}
