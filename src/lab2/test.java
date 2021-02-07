import java.util.Scanner;
public class test{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int userElements;
		boolean keepGoing = true;
		
		while(keepGoing){

		

		try{
			System.out.print("How many  elements: ");
			userElements = input.nextInt();
		}
		catch(Exception e){
			input.next();
			System.out.print("Not an integer! Try again!");

			}
		keepGoing = false;
			System.out.println("JIO");
	}

	System.out.println("KEEEP GOING");
	

	}
}
			

