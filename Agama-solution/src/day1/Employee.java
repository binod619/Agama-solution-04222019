package day1;

public class Employee {
	int salary;
	int bonus;
	public void calculateSalary()
	{
		int totalSalary = salary+bonus;
		System.out.println("Total salary:: " + totalSalary);
	}
	public int calculateSalary1()
	{
		int total= salary+bonus;
		return total;
	}

}
