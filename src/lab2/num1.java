import java.util.Scanner;
import java.util.Random;
public class num1{
	public static void main(String[] args){
		

	}

	public static void getInt(int a){
		Scanner input = new Scanner(System.in);
		try{
			System.out.pritnln("Enter a integer to test");
			a = input.nextInt();
		}
		catch(Exception e){
			input.next();
		}
	}

	public static int initRand(int list[]){
		Random rand = new Random();

	}
}
