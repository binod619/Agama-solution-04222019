package mathematics;

import java.util.Random;

public class DemoMoreArray {

	public static void main(String[] args) {
		int arr[]= new int[100];
		int store[]= new int [10];
		Random random = new Random();
		for (int ran=0; ran<arr.length; ran++) {
			arr[ran]=random.nextInt(10);
		}
		for (int i=0; i<arr.length; i++) {
				store[arr[i]]++;
				}
		for (int j=0; j<10; j++) {
			System.out.println("size of "+j+ " :: "+store[j]);
		}
		

	}

}
