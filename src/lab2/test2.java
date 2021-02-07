import java.util.Scanner;
import java.util.*;
public class test2{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int user_number;
		int count = 1;
		int dice_number;
		System.out.println("Choose a number between 1 and 6");
		System.out.print("I will tell you after how many rolls it will come up: ");
		user_number = input.nextInt();
		while(user_number < 1 || user_number > 6){
			System.out.print("ERROR! out of range. Reenter: ");
		}
		do{
			dice_number = rand.nextInt(6) + 1;
			System.out.println("Die roll # " + count + " --- Die number: " + dice_number);
			count++;
		}while(dice_number != user_number);
		System.out.println("Your number came up after " + (count - 1) + " die rolls");
		
	}
}
