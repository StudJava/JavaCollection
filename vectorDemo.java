package Java_Collection;

import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args)
	{
		Vector<String> vc = new Vector<>();
		vc.add("Jobito");
		vc.add("OA");
		vc.add("Center");
		System.out.println(vc);
		
		Iterator<String> itr=vc.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
	}

}
