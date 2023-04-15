package Java_Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		Stack<String> vc = new Stack<>();
		vc.push("jobito");
		vc.push("OA");
		vc.push("center");
		
		vc.pop();
		vc.pop();
		
		Iterator<String> itr=vc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
