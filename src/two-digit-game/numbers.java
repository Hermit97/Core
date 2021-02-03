import java.util.InputMismatchException;
import java.util.Scanner;
public class numbers{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int userNumber = 0;

		while(true){
			try{

				System.out.println("Enter a two digit number. The two digits should be different. ");
				userNumber = input.nextInt();
			}
			catch(InputMismatchException exception){
				System.out.println("Not an integer! Try again!");
			}

			if(userNumber >= 10 && userNumber <= 99){ 
				System.out.println("Not good for your game!"); 
			}else{
				System.out.println("Not good for your game!");
			}

//		input.close();

		}
	}
}
