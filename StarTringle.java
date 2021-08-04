import java.awt.print.Printable;

public class StarTringle {

	public static void main(String[] args) {
		int hight = 10, width = 10;
		StarTringle obj = new StarTringle();
		// obj.printPyramid(4);
		//obj.invertedPyramid(6);
		// obj.numberTringle(6);
		// obj.leftNumverTringle(5);
		// obj.incrementedNumberTringle(5);
		obj.multipleTable(6);
	}

	//  multiplication table triangle pattern in Java.

//	0 
//	0 1 
//	0 2 4 
//	0 3 6 9 
//	0 4 8 12 16 
//	0 5 10 15 20 25
	
	public void multipleTable(int num) {
		
		//int printval = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				// printval
				System.out.print(" "+j*i);
			}
			System.out.println();
		}
		
	}
	
	
	// print inverted pyramid
//	 ***********
//	  *********
//	   *******
//	    *****
//	     ***
//	      *
	public void invertedPyramid(int numRows) {
		for (int i = 0; i < numRows; i++) {			
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
	    	for (int j = 0; j < (numRows-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

// Print below incremented number tringle 
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 

	public void incrementedNumberTringle(int num) {
		int printval = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				// printval
				System.out.print(" " + (++printval));
			}
			System.out.println();
		}

	}

// print below tringle 
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
	public void leftNumverTringle(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + (j + 1));
			}
			System.out.println();
		}
	}

	// print reverse number tringle
//	 1 2 3 4 5 6
//	  2 3 4 5 6
//	   3 4 5 6
//	    4 5 6
//	     5 6
//	      6

	public void numberTringle(int num) {
		for (int k = 0; k < num; k++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (int i = k; i < num; i++) {
				System.out.print(" " + (i + 1));
			}
			System.out.println();
		}
	}

	// **** rectangular star print
	public void rectangleStar(int hight) {
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j < hight; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	// tringle star from right side
	public void tringleStarRightSiede(int hight) {
		for (int i = 0; i < hight; i++) {
			for (int j = hight; j <= i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	// tringle star from left side
	public void tringleStar(int hight) {
		for (int i = 0; i < hight; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	// **** star pyramid print
	public void printPyramid(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print("#");
			}
			for (int k = 0; k <= i; k++) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
	}
}
