import java.util.Scanner;
public class TimeClient1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Time t1 = new Time(8, 15, 30);
		Time t2 = new Time();
		int hours, minutes, seconds;

		System.out.print("Initial time t1 (alternate constructor invoved) - military format: ");
		t1.printTimeMilitary();
		System.out.println();

		System.out.print("Initial time t1 (alternate constructor invoved) - standard format: ");
		t1.printTimeStandard();
		System.out.println();

		System.out.print("Initial time t2 (alternate constructor invoved) - military format: ");
		t2.printTimeMilitary();
		System.out.println();

		System.out.print("Initial time t2 (alternate constructor invoved) - standard format: ");
		t2.printTimeStandard();
		System.out.println();

		t2.setTime(9, 45, 35);
		System.out.print("t2 after call to setTime - military format: ");
		t2.printTimeMilitary();
		System.out.println();
		System.out.print("t2 after call to setTime - standard format: ");
		t2.printTimeStandard();
		System.out.println();

		if(t1.equals(t2))
			System.out.println("After call to equals: times are equal.");
		else
			System.out.println("After call to equals: times are NOT equal.");

		if(t1.lessThan(t2))
			System.out.println("After call to equals: time are equal. ");
		else
			System.out.println("After call to lessThan: 1 is NOT less than t2");

		System.out.print("Enter hours, minuts, and seconds: ");
		hours = input.nextInt();
		minutes = input.nextInt();
		seconds = input.nextInt();

		t1.setTime(hours, minutes, seconds);
		System.out.print("New time t1 after call to setTime - standard format: ");
		t1.printTimeStandard();
		System.out.println();

		t1.increment();
		System.out.print("New time t1 after call to increment - standard format: ");
		System.out.println();

		t2.copy(t1);
		System.out.print("New t2 after call to copy - standard format: ");
		t2.printTimeStandard();
		System.out.println();
		System.out.println("Test toString for t2: " + t2);





		




		
	}
}

