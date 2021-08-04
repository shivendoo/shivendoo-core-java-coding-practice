import java.util.*;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int[] numArray = { 4, 6, 22, 4, 22, 55, 65, 44, 2, 6, 7, 2, 9, 4 };
		FindDuplicateInArray.printIntegerDuplicate(numArray);
		
		String [] names = {"rahul", "mayank", "raju", "shiven","rahul","pankaj","shiven"}; 
		FindDuplicateInArray.printDuplicateNamesInArray(names);
	}

	public static void printDuplicateNamesInArray(String [] names) {
		
		Map<String, Integer> mapOfNames = new HashMap<>();
		for(String name : names) {
			if(mapOfNames.containsKey(name)) {
				mapOfNames.put(name, mapOfNames.get(name)+1);
			}else {
				mapOfNames.put(name, 1);
			}
		}
		
		System.out.println("Name Map is :"+mapOfNames);
		System.out.println("Duplicate name(s) : ");
		Set<String> nameKeySet = mapOfNames.keySet();
		for(String name : nameKeySet) {
			if(mapOfNames.get(name)>1)
				System.out.print(name+", ");
		}
	}
	
	
	public static void printIntegerDuplicate(int[] numArray) {
		Map<Integer, Integer> numMap = new HashMap<>();
		// created a map with key-number and value-ferquency of num
		for (Integer num : numArray) {
			if (numMap.containsKey(num)) {
				numMap.put(num, numMap.get(num) + 1);
			} else {
				numMap.put(num, 1);
			}
		}
		System.out.println("map is :" + numMap);
		System.out.println("Duplicate numbers is/are -");
		Set<Integer> keySet = numMap.keySet();
		for (Integer key : keySet) {
			if (numMap.get(key) > 1) {
				System.out.print(key + ", ");
			}
		}
	}
}