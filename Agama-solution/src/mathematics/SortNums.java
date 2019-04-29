package mathematics;

public class SortNums {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=90;
		arr[1]=60;
		arr[2]=70;
		arr[3]=50;
		arr[4]=100;
		for (int i=1; i<(arr.length-1); i++) {
		if (arr[i-1]>arr[i]) {
			int temp=arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
			i=i-1;
		}} 

		for ( int j=0; j<arr.length; j++) {
				System.out.println(arr[j]);
		}

	}

}
