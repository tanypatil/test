package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "test", "smart", "good", "good" };
		List<String> list = Arrays.asList(array);  // Convert array to List
		//list.add("mango");
		LinkedList<String> linkedList = new LinkedList<>(list);
		for (Iterator iterator = linkedList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		list1.add(98);
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
