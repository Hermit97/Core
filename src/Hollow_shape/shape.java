import java.util.Scanner;
public class shape{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int howMany = 0;
	char userChar;
	char startGame;

	System.out.println("Do you want to start(Y/N)");
	startGame = input.next().charAt(0); 
	while(startGame == 'y' || startGame == 'Y'){
		try{
			
			System.out.println("How many chars/last row?");
			howMany = input.nextInt();
			
			if(howMany < 5 || howMany > 21)
				System.out.println("Error! Valid range 5 - 21.");
		}
		catch(Exception e){
			System.out.print("Not an integer! Try again!");
			input.next();
			}

		System.out.println("What characher?");
		userChar = input.next().charAt(0);

		for(int i = 0; i <= howMany; i++){
			System.out.print(userChar);
			}
		System.out.println();
		}
			

		
		}
	}

