package corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Java8StreamPractice {

	public static void main(String[] args) {
		List<String> names = List.of("Rahul", "Mayank", "Kanpur", "Neha", "Pankaj");
		// sorting string
//		names.stream().sorted().forEach(System.out::println);
//		System.out.println("count is : "+names.stream().count());	
		// Map mehtod
//		names.stream().map(name-> name.length()).forEach(System.out::println);
//		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		// Collect method
		List<Integer> ls = names.stream().map(name -> name.length()).collect(Collectors.toList());
		ls.forEach(System.out::println);

		// print name in upper case - usine method reference
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		// print name in upper case - usine lambda
		// names.stream().map(name->name.toUpperCase()).forEach(System.out::println);

		// findAny() method - return any value but mostally it return first value and
		// behave like findFrist() method
		Optional<Integer> obj = ls.stream().sorted().findAny();
		if (obj.isPresent())
			System.out.println("find any valuse is : " + obj);
		else
			System.out.println("No value presesnt");

		// findFirst() method
		System.out.println("Find First value is : " + ls.stream().sorted().findFirst());

		// sum method
		List<Integer> intList = Arrays.asList(1, 3, 7, 9, 16);
		intList.stream().map(num -> num * 3).forEach(System.out::println);
		int sum = intList.stream().filter(num -> num > 5).mapToInt(num -> num).sum();
		System.out.println("Sum is : " + sum);
		int lengthSum = names.stream().mapToInt(name -> name.length()).sum();
		System.out.println("String lenght Sum is : " + lengthSum);

		// anyMatch() return boolean true or false
		boolean test = names.stream().anyMatch(name -> name.startsWith("M"));
		System.out.println("Nay Match is : " + test);

		// noneMatch(predicate) - return true if no match found
		boolean IsNamePresent = names.stream().noneMatch(name -> name.startsWith("Kan"));
		System.out.println("If there city exist : " + IsNamePresent);
		
		// counting() method of collector class 
		
		  	Long count = names.stream().collect(Collectors.counting());
		  	System.out.println("Count is : "+count);

	}

}
