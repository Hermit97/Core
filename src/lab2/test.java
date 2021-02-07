import java.util.Scanner;
import java.util.Random;
public class test{
	//public static final int SIZE = 5;
	public static final int MIN = 0;
	public static final int MAX = 100;


	public static void menu(int[] list, int min, int max, int size){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		//int size;
		boolean needInt = true;
		
		while(needInt){

		try{
			System.out.print("How many  elements: ");
			size = input.nextInt();
		}
		catch(Exception e){
			input.next();
			System.out.print("Not an integer! Try again!");
			}

			//add random numbers to array
			for(int i = 0; i < size; i++){
				list[i] = rand.nextInt(MAX - MIN + 1) + MIN;
			}

			System.out.println("The list is: ");
			//print the array
			for(int i = 0; i < list.length; i++){
				System.out.print(list[i] + " " );
			}
		}

		}
	
	public static void main(String[] args){
		int SIZE;

		int[] a = new int[SIZE];

		menu(a, a.length, MIN, MAX);

	}
}
			

