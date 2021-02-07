//package Core.src.lab2;
import java.util.Scanner;
import java.util.Random;
public class num1{
	public static final int MAX = 100;
	public static final int MIN = 1;
	public static void main(String[] args){
		

	}

	public static void getInt(int[] list){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		input.close();
	}

	public static void initRand(int list[], int max, int min){
		Random rand = new Random();
		for(int i = 0; i < list.length; i++)
			list[i] = rand.nextInt(max - min + 1) + min;
	}

	//Method prints elements in array
	public static void print(int[] list){
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

	//Method checks for even numbers
	public static boolean isAllEven(int[] list){
		for(int i = 0; i < list.length; i++){
			if(list[i] % 2 == 0)
				return true;
			else
				return false;
		}
		return true;
		
	}

	//Method check for unique numbers
	public static boolean isUnique(int[] list){
		boolean duplicates = false;
		for(int i = 0; i < list.length; i++)
			for(int j = i + 1; j < list.length; j++)
				if(j != i && list[j] == list[i])
					duplicates = true;
		return duplicates;
	}

	public static int minGap(int[] list){
		int gap = list[1] - list[0];
		for(int i = 0; i < list.length; i++){
			int absDiff = Math.abs(list[i] - list[i - 1]);
			if(gap > absDiff){
				gap = absDiff;
			}

		}
		return gap;

	}

	public static void menu(){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int size;
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
}
