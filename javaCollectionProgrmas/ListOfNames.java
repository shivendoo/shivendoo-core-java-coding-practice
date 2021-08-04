package javaCollectionProgrmas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfNames {

	public static void main(String[] args) {
		
		List <String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Pankaj");
		names.add("Mohit");
		names.add("Pravesh");
		names.add(1,"Shivendra");
		
		for(String name : names)
			System.out.println(name);
		
		System.out.println("example for iterator");
		
		Iterator<String> nameItr = names.iterator();
		while(nameItr.hasNext()) 
			System.out.println("Name - "+nameItr.next());
		
		System.out.println("Classic for loop");
		
		for(int i = 0 ; i < names.size() ; i++ )
			System.out.println(names.get(i));

	}

}
