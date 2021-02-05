import java.util.InputMismatchException;
import java.util.Scanner;
public class numbers{
    public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	int userNumber = 1;
	boolean repeat = true;

	//while(userNumber != 0){
	while(repeat){ 
		try{
		    System.out.println("Enter a two digit number. The two digits should be different. ");
		    userNumber = input.nextInt();

		    if(userNumber >= 10 && userNumber <= 99){ 
			System.out.println("Good for your game!"); 

		    }else if(userNumber == 0){
			System.out.println("Exiting program");
			System.exit(0);

		    }else{
			System.out.println("Not good for your game!");
		    }
		}
		catch(InputMismatchException exception){
		    System.out.println("Not an integer! Try again!");
		    input.next();
		    repeat = true;
		}

		//input.close();

		}
	}
}
