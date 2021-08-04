import java.util.Comparator;

public class Main extends TestClass implements Comparable<Main>, Comparator<Integer> {

	int num = 10;

	Main(int num) {
		this.num = num;
	}

	public void getName() {
		System.out.println("name is : Main");
	}

	Main() {
		System.out.println("num is : " + num);
		System.out.println("this is Main class consturctor");
	}

	{
		System.out.println("num22 is : " + num);
		System.out.println("This is istance intialization block");
	}

	public static void main(String args[]) {
		Main mn1 = new Main(10);
		Main mn2 = new Main(10);
		TestClass obj = mn2;
		System.out.println(" 1: " + mn1.equals(mn2));
		System.out.println(" 2: " + mn1.equals(obj));
	}

	public boolean equals(Object obj) {
		System.out.println("this is equals method in Main class");
		if (this == obj)
			return true;
		if (this.num == ((Main) obj).num)
			return true;
		return false;

	}

	@Override
	public int compareTo(Main o) {
		if (this.num > o.num)
			return 1;
		if (this.num < o.num)
			return -1;
		else
			return 0;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}
