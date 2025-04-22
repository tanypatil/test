package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("NAYAN");
		lst.add("PAP");
		System.out.println("Palindrome String ::::::: ");
		List<String> palDrn = lst.stream().filter(StreamApi::palindrome).collect(Collectors.toList());
		System.out.println("palDrn ::::: "+palDrn);
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("Even no :::: ");
		int array[]= {9,85,60,23,54,21,36,59};
		List<Integer> listNew = Arrays.stream(array).boxed().filter(e->e%2==0).toList();
	    System.out.println("Even no :::: "+listNew);
	    System.out.println("===============================");
		System.out.println("===============================");

	}
	
	public static boolean palindrome(String str) {
		String reverseString = new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reverseString);
		
	}

}
