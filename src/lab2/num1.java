//package Core.src.lab2;
import java.util.Scanner;
import java.util.Random;
public class num1{
	public static final int MAX = 100;
	public static final int MIN = 1;
//Add size to all methods
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
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
		}	
	}

	public static void getInt(int[] list, int size){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < size; i++)
			list[i] = input.nextInt();
		input.close();
	}

	public static void initRand(int list[], int max, int min, int size){
		Random rand = new Random();
		for(int i = 0; i < size; i++)
			list[i] = rand.nextInt(max - min + 1) + min;
	}

	//Method prints elements in array
	public static void print(int[] list, int size){
		for(int i = 0; i < size; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

	//Method checks for even numbers
	public static boolean isAllEven(int[] list, int size){
		boolean isEven = true;
		for(int i = 0; i < size; i++){
			if(list[i] % 2 == 0)
				isEven = true;
			else
				isEven = false;
		}
		return isEven;
		
	}

	//Method check for unique numbers
	public static boolean isUnique(int[] list, int size){
		//this is probarbly wrong, gotta come to back to it. 
		boolean duplicates = false;
		for(int i = 0; i < list.length; i++)
			for(int j = i + 1; j < list.length; j++)
				if(j != i && list[j] == list[i])
					duplicates = true;
		return duplicates;
	}

	public static int minGap(int[] list, int size){
		int gap = list[1] - list[0];
		for(int i = 0; i < size; i++){
			int absDiff = Math.abs(list[i] - list[i - 1]);
			if(gap > absDiff){
				gap = absDiff;
			}

		}
		return gap;

	}

	public static int menu(){
		int option;
		do{
			System.out.println("Your options are: ");
			System.out.println("-------------------");
			System.out.prinlnt("2) All unique values?");
			System.out.prinlnt("3) Print min gap between values?");
			System.out.prinlnt("4) Statiscits");
			System.out.prinlnt("5) Print 80% percentile");
			System.out.prinlnt("0) EXIT");
			System.out.print("Please enter your option: ");
			option = input.nextInt();
		}while(option >= 0 && option <= 5);
		
		return option;

		}




}
