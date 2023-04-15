package Java_Collection;
import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args)
	{
		LinkedList<String> cars = new LinkedList<>();
		
		cars.add("Maruti");
		cars.add("BMW");
		cars.add("Sfari");
		cars.add("Volvo");
		cars.add("Ford");
		
		cars.addFirst("Kia");
		cars.addLast("Artigo");
		cars.removeFirst();
		cars.removeLast();
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		System.out.println(cars);
	}
}
