import java.util.Arrays;

public class StaticInitializer {

	static int num;
	static int [] matrix = new int [10];
	
	static {
		for(int i =0 ; i < 10 ; i ++) {
			matrix[i] = i*i;
		}
		System.out.println(Arrays.asList(matrix).toString());
	}
			
	public StaticInitializer() {
	this.num=10;
	}

// static intialiser block , constructor ke pahle run hota hia .. aur agar hum
//	main function me bina object creation ke kuch karna chahte hia to wo constructor se 
//	nahi ho sakta hai , is condition me static intiliser block hi use karna hoga.
	
	public static void main(String[] args) {
//	System.out.println("num is : "+num);
	
	
//	StaticInitializer obj = new StaticInitializer();
//	System.out.println("num in 22 :"+num);

	}

}
