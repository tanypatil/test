package collectionTest;

import java.util.HashMap;
import java.util.Map;

public class StudentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> subjectMarksMap = new HashMap<>();
		subjectMarksMap.put("maths", 80);
		subjectMarksMap.put("physics", 10);
		subjectMarksMap.put("chemistry", 70);
		
		Map<Integer,Map<String,Integer>> studentMarksMap=new HashMap<>();
		studentMarksMap.put(101, subjectMarksMap);
		
		studentMarksMap.forEach((k,v)->{
			System.out.println("Student ID:: " + k);
			v.forEach((k1,v1)->{
				System.out.println(" Subject:: "+k1+" Marks:: "+v1);
			});
		});
		
		

	}

}
