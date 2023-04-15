package Java_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Rinku");
		ts.add("Upendra");
		ts.add("Shourya");
		ts.add("Mayur");
		ts.add("Girish");
		ts.add("Harsh");
		ts.add("Chetan");
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
