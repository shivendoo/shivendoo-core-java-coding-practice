import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;

public class TestClass {

	String name = "TestClass";
	
	public void getName() {
		System.out.println("name is : TestClass and num is :");
	}

	TestClass() {
		System.out.println("This is TestClass coustructor");
		this.getName();
	}

	List<String> names = List.of("Rahul", "Mayank", "Kanpur", "Neha", "Pankaj");
	String concName = "";

	public static void main(String[] args) {
		System.out.println("Hello World");
		TestClass tc = new TestClass();
		tc.printName(tc.names, tc);
	}

	public String concateName(String name) {
		// List<String> names = List.of("Rahul","Mayank","Kanpur","Neha","Pankaj");
		System.out.println(name);
		return concName = concName + name;
	}

	public void printName(List<String> names, TestClass tc) {

//		System.out.println("Classic for loop");
//		for(int i = 0 ; i < names.size(); i ++) {
//			System.out.println(names.get(i));
//		}
//		
//		System.out.println("Enhance for loop");
//		for(String name : names)
//			System.out.println(name);
//		
//		System.out.println("Iteror way ");
//		Iterator<String> it = names.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());			
//		}
		// TestClass tc1 = new TestClass();
		System.out.println("***Lambda***");
		// names.forEach((name) -> System.out.println(name));
		// names.forEach(System.out::println);
		// names.forEach(tc::concateName);
		// System.out.println(concName);
		names.stream().filter(name -> name.startsWith("K")).forEach(System.out::println);

	}

}
