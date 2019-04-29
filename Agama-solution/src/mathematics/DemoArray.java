package mathematics;

public class DemoArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=90;
		arr[1]=60;
		arr[2]=70;
		arr[3]=80;
		arr[4]=100;
		int greater=arr[0];
		for (int i=1; i<arr.length; i++) {
		if (arr[i]>greater) {
			greater=arr[i];
		}} System.out.println("the greater number is ::" + greater + " position is ");
		
		for ( int j=0; j<arr.length; j++) {
			if( arr[j]==greater) {
				System.out.println(j);
			}
		}
	}
		
		

}

