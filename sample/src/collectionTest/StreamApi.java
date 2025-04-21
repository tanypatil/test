package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
public static void main(String[] args) {
	 List<Product> productsList = new ArrayList<Product>(); 
	productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    List<Float> productPriceList = new ArrayList<Float>(); 
    productPriceList = productsList.stream().filter(p->p.price>25000).map(p->p.price).distinct().collect(Collectors.toList());
    System.out.println("productPriceList ::::::::: "+productPriceList);
    boolean test = productsList.stream().anyMatch(p->p.price>25000);
    System.out.println("test ::::::::: "+test);
    boolean test1 = productsList.stream().anyMatch(p->p.name=="HP Laptop");
    System.out.println("test ::::::::: "+test);
    System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
	// List newArrayList = new ArrayList(); 
	 List<Integer> newArrayList = new ArrayList<Integer>();
	 newArrayList.add(1);  
	 newArrayList.add(2);  
	 newArrayList.add(77);  
	 newArrayList.add(88);  
	 newArrayList.add(99); 
	 newArrayList.add(44);  
	 newArrayList.add(101); 
	 List<Integer> oplist = new ArrayList<Integer>();
	 oplist =   newArrayList.stream().filter(l->(l%2)==0).collect(Collectors.toList());
	 
System.out.println("oplist === "+oplist);

	List<Integer> numbers = Arrays.asList(10, 15, 20, 30, 45, 50, 60, 75, 90);
	List<Integer> op = new ArrayList<Integer>();
	op= numbers.stream().filter(l->l%15 ==0).map(n->n*n).collect(Collectors.toList());
	
	System.out.println("oplist === "+op);
	//[225, 900, 2025, 5625, 8100]

	List<Integer> numbers1 = Arrays.asList(5, 3, 9, 1, 7, 9, 8, 6); 
	Optional<Integer> secondHighest = numbers1.stream()
            .distinct() // Remove duplicates
            .sorted((a, b) -> b - a) // Sort in descending order
            .skip(1) // Skip the highest number
            .findFirst(); // Get the second highest number

	System.out.println(secondHighest);
	System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
}
}
