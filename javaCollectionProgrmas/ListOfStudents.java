package javaCollectionProgrmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListOfStudents {

	public static void main(String[] args) {

		List<Student> studentRoll = new ArrayList<>();
		studentRoll.add(new Student(159, "Rajesh"));
		studentRoll.add(new Student(244, "Mayank"));
		studentRoll.add(new Student(566, "Kamal"));
		studentRoll.add(new Student(128, "Ravi"));
		studentRoll.add(new Student(540, "Amit"));
		studentRoll.add(1, new Student(231, "Niranjan"));

		System.out.println("Generic sorting");
		Collections.sort(studentRoll);

		for (Student std : studentRoll)
			System.out.println(std);
		
		System.out.println("Sorting based on Student name");
		
		Comparator<Student> test = (o1,o2)->  o1.getName().compareTo(o2.getName());				
			
		Collections.sort(studentRoll,test);
		for (Student std : studentRoll)
			System.out.println(std);
		
System.out.println("Sorting based on Roll number");
		
		Comparator<Student> test2 = (o1,o2)-> 	(o1.getRollNumber() > o2.getRollNumber()) ? 1 : o1.getRollNumber() < o2.getRollNumber() ? -1 :0 ;
	
			
		Collections.sort(studentRoll,test2);
		for (Student std : studentRoll)
			System.out.println(std);

	}
}
