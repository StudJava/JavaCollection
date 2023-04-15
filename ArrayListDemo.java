package Java_Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> studlist=new ArrayList<>();
		studlist.add(1);
		studlist.add(10);
		studlist.add(100);
		studlist.add(500);
		studlist.add(20);
		studlist.add(200);
		
		
		for(int i:studlist) 
		{
			System.out.println(i);
			
		}
		
		ArrayList<String> studName=new ArrayList<>();
		studName.add("Upendra");
		studName.add("Rinku");
		studName.add("Shourya");
		
		System.out.println(studName);
		
		
	}

}
