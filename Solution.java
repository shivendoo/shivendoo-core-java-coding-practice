import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static void main(String[] args) {

		int[] num = { 3, 4, 4, 6, 2, 1, 7 }; // 7
		// int[] updatedArr = Solution.modifyArray(num, 7);
		Solution.modifyArrayNew(num, 7);
		int[] updatedArr = num;

		List<Integer> ls = new ArrayList(Arrays.asList(updatedArr));
		System.out.println(ls);
//		for(int val : updatedArr )
//			System.out.println(val);
		for (int i = 0; i < updatedArr.length; i++) {
			System.out.println(i + " - " + updatedArr[i]);
		}
	}

	// with use of another array
	public static int[] modifyArray(int arr[], int n) {
		int[] newArr = new int[n];
		for (int i = 0; i < n; i++) {
			newArr[i] = -1;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < n) {
				newArr[arr[i]] = arr[i];
			}
		}
		return newArr;
	}

	// without using another array 
	public static int[] modifyArrayNew(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == i) {
				continue;
			}
			for (int j = 0; j < n; j++) {
				if (arr[j] == i) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}

			}

		}
		for (int i = 0; i < n; i++) {
			if (arr[i] != i || arr[i] < 0 || arr[i] > 6)
				arr[i] = -1;
		}
		return arr;
	}
}