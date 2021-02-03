import java.util.InputMismatchException;
import java.util.Scanner;
public class numbers{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int userNumber;

		try{

		System.out.println("Enter a two digit number. The two digits should be different. ");
		userNumber = input.nextInt();
		}
		catch(InputMismatchException exception){
			System.out.println("Not an integer! Try again!");
		}

		input.close();

	}
}
