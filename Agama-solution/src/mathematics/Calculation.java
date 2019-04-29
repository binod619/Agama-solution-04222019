package mathematics;

public class Calculation {
	public int addition(int a, int b) {
		return a+b;
	}
	public int subtraction ( int a, int b) {
		return a-b;
	}
	public int multiply (int a, int b) {
		return a*b;
	}
	public int division (int a, int b) {
		return a/b;
	}
	public void greatest(int a, int b, int c) {
		if (a>b && a>c) {
			System.out.println("the greatest number is ::"+ a);
		}
		else if (b>a && b>c) {
			System.out.println("the greatest number is ::"+ b);}
		else if (a!=b && a!=c) { System.out.println("the greatest is c");}
		else if (a==b && a==c)
		{
			System.out.println("All number are same");
		}
		else {System.out.println("two number are greater");}
	}
	public void reverseNum(int num1) {
		int reverse=0;
		do  {
			reverse=reverse*10+num1%10;
			num1=num1/10;
		} while (num1>0);
		System.out.println("reverse ="+reverse);
	}

}
