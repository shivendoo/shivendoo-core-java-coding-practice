
public class ArrayDemo {
	
	

	public static void main(String[] args) {
		
		int marksArray [] = new int [5];
		String nameArray [] = new String [5];
		
		nameArray [0] = "Shiven" ;
		marksArray [0] = 67 ;
		
		nameArray [1] = "Sushila" ;
		marksArray [1] = 23 ;
		
		nameArray [2] = "Chawanni" ;
		marksArray [2] =  87;
		
		nameArray [3] = "neha" ;
		marksArray [3] =  06 ;
		
		nameArray [4] = "ANju " ;
		marksArray [4] = 55 ;
		
//		for(int i = 0; i < marksArray.length ; i++) {
//			System.out.println("Student : "+nameArray[i] +" has obtained marks : "+marksArray[i]);
//		}
		
		for(int marks : marksArray)
			System.out.println("marks are : "+marks);	
		
		for(String name : nameArray)
			System.out.println("Name is  : "+name);
		
	}

}
