//Program to chec if array elements correspond to a given sum
import java.io.*;

class ArrToSum {
	private static final int MAXSIZE = 100000; //Max size of HashMap

	//function to calculate
	static void printPairs(int arr[], int sum) {
		//declare and initialize the whole array as false
		boolean[] binmap = new boolean[MAXSIZE];

		for(int i=0; i<arr.length; ++i) {

			//declare a temp variable. subtracting the current array element from sum
			int temp = sum - arr[i];

			//checking the condition
			if(temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum "+sum+ "is" +arr[i]+temp);
			}
			binmap[arr[i]] = true;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 5, 6, 10};
		int sum = 9;
		printPairs(arr, sum);
	}
}

//Time complexity of the algorithm is O(n)
//Auxillary space is O(R)