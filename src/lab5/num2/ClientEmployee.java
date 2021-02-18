import java.util.*;
public class ClientEmployee{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String last, first, dept;	
		double pay_rate;
		int hours;

		Employee newEmp = new Employee();
		//subclass alternate
		Employee prof = new Employee("Shawn", "Ali", 25.50, 50, "COSC");

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

		newEmp.setPayRate(pay_rate);
		System.out.println(newEmp);

		newEmp.setDepartment(dept);
		System.out.println(newEmp);

		newEmp.setName(last, first);
		
		System.out.println("--- Record for both employeees with overidden .toString from subclass ---");
		System.out.println(newEmp.toString());
	}
}
