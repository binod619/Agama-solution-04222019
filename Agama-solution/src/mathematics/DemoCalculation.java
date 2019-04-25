package mathematics;

import java.util.Scanner;

public class DemoCalculation {

	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		Calculation calculate = new Calculation();
		System.out.println("---------------welcome to calculator---------------");
		System.out.println();
		System.out.print("Enter your first number::");
		int num1= input.nextInt();
		System.out.print("Enter your second number::");
		int num2= input.nextInt();
		//output of calculation
		System.out.println("The addition of "+num1+" and "+num2 +" :: "+calculate.addition(num1, num2) );
		System.out.println("The subtraction of "+num1+" and "+num2 +" :: "+calculate.subtraction(num1, num2) );
		System.out.println("The multiplication of "+num1+" and "+num2 +" :: "+calculate.multiply(num1, num2) );
		System.out.println("The division of "+num1+" and "+num2 +" :: "+calculate.division(num1, num2) );
		
	}

}
