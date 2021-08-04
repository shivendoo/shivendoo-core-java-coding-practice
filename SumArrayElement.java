
public class SumArrayElement {

	
	public static void main(String[] args) {
		
		int Items [] = {12,34,78,23,76,93,25};
		int sum=0;
		for(int item : Items)
			sum = sum + item ;		
		System.out.println("Sum of array element is -> "+sum+" and average is : "+sum/Items.length);
		
		SumArrayElement test = new SumArrayElement();
		test.makeGrid();
			

	}
	
	
	private void makeGrid() {
		for (int i =0 ; i < 10 ; i ++) {
			System.out.println();
			for (int j = 0 ; j <10 ; j++) {
				System.out.print(" - ");
			}
		}
	}

}
