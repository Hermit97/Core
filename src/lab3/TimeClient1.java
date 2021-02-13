import java.util.Scanner;
public class TimeClient1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Time t1 = new Time(8, 15, 30);
		Time t2 = new Time();
		int hours, mins, secs;

		System.out.println("Initial time t1 (alternate constructor invoked) - military format: ");
		t1.printMilitary();
		System.out.println();

		System.out.println("Initial time t1 (alternate constructor invoked) - standard format: ");
		t1.printStandard();
		System.out.println();

		System.out.println("military time");
		t2.printMilitary();
		System.out.println();

		System.out.println("standard time");
		t2.printStandard();
		System.out.println();

		System.out.println("\nNow setting the time military style");
		t2.setTime(9, 45, 35);
		t2.printMilitary();
		System.out.println();

		System.out.println("\nNow setting the time standard style");
		t2.setTime(9, 45, 35);
		t2.printStandard();
		System.out.println();

		if(t1.equals(t2)){
			System.out.println("Times are not equal");

		}else if(t1.lessThan(t2)){
			System.out.println("t1 is less than t2");
		}

		System.out.print("Enter hours, minutes, and seconds: ");
		hours = input.nextInt();
		mins = input.nextInt();
		secs = input.nextInt();
		
		System.out.println("\nNow setting the time military style");
		t2.setTime(hours, mins, secs);
		t2.printMilitary();
		System.out.println();

	}
}
