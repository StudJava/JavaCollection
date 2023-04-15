package Java_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class HashSetdemo {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("jobito");
		hs.add("QA");
		hs.add("center");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
