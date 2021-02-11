import java.util.*;
public class TimeClient2{
	public static final int SIZE = 3;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Time[] t = new Time[SIZE];
		Time start = new Time();
		Time end = new Time(9, 15, 9);
		int hours, minutes, seconds;
		int i;

		System.out.print("Initial time end (alternate constructor invovked) - military format: ");
		end.printTimeStandard();
		System.out.println();
		System.out.print("Initial time end (alternate constructor invoked) - standard format: ");
		end.printTimeStandard();
		System.out.println();

		System.out.print("Initial time start (default construcor invoked) - military format: ");
		start.printTimeStandard();
		System.out.println();

		start.setTime(9, 45, 35);
		System.out.print("start after call to setTime - military format: ");
		start.printTimeMilitary();
		System.out.println();
		System.out.print("start after call to setTime - standard format: ");
		start.printTimeStandard();
		System.out.println();

		if(start.equals(end))
			System.out.println("After call to equals: times are equal. ");
		else
			System.out.println("After call to equals: times are NOT equal. ");

		if(start.lessThan(end))
			System.out.println("After call to lessThan: start end time. ");
		else
			System.out.println("After call to lessThan: start time is NOT less than end time. ");

		//print times
		System.out.println("The times entered are (standard format): ");
		for(i = 0; i <= 10; i++){
			start.printTimeStandard();
			System.out.println();
			start.increment();
		}

	}
}
