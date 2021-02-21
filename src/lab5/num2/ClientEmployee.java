import java.util.*;
public class ClientEmployee{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String last, first, dept;	
		double pay_rate;
		int hours;

		Employee newEmp = new Employee();
		//subclass alternate
		Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC");

		//subclass default constructor invoked

		System.out.println("Enter the first employee last name:");
		last = input.nextLine();

		System.out.println("Enter the first employee first name:");
		first = input.nextLine();

		System.out.println("Enter the deparment name");
		dept = input.next();

		System.out.println("Enter the employee pay rate");
		pay_rate = input.nextDouble();

		System.out.println("Enter hours worked");
		hours = input.nextInt();
	
		newEmp.setAll(first, last, pay_rate, hours, dept);
		
		System.out.println("--- Record for both employeees with overidden .toString from subclass ---");
		System.out.println(prof.toString());
		System.out.println(newEmp.toString());

		System.out.println("--- Output with calls to getters from the method print from subclass ---");
		newEmp.print();
		System.out.println();
		prof.print();
		System.out.println();

		System.out.println("--- Output with calls from the getters from the superclass ---");
		System.out.println("The wages for " + newEmp.getFirstName() + " " + newEmp.getLastName() 
							+ " from the " + newEmp.getDept() + " Department are " + newEmp.calculateWage());

		System.out.println("--- Call to overridden equals/subclass for 2 Employee objects---");
		if(newEmp.equals(prof))
			System.out.println("They are equal");
		else
			System.out.println("Coudn't find an employee with the same record.");
	}
}
