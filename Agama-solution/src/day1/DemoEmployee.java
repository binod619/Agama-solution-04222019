package day1;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee saurab = new Employee();
		saurab.salary=10000;
		saurab.bonus=2000;
		saurab.calculateSalary();
		System.out.println("-------------------------------------");
		
		Employee binod = new Employee();
		binod.salary=9000;
		binod.bonus=150;
		int totalSalary= binod.calculateSalary1();
		System.out.println(" total salary::  "+ totalSalary);

	}

}
