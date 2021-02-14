//package Core.src.lab2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class num1{
	public static final int MAX = 100;
	public static final int MIN = 1;

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int option = 1;

		String prompt = "Enter a int";
		System.out.println(prompt);
		int size = getInt(input, prompt);

		int[] list = new int[size];

		System.out.println("The list is ");
		initRand(list, MAX, MIN, size);
		print(list, size);

		while(option != 0){
			option = menu();

			switch(option){
				case 1:
					boolean isEven = isAllEven(list, size);
					if(!isEven)
						System.out.println("Some values are odd.");
					else
						System.out.println("All values are even");
						break;

				case 2:
					boolean unique = isUnique(list, size);
					if(!unique)
						System.out.println("Some values appear multiple times.");
					else
						System.out.println("All values are unique.");
						break;

				case 3:
						System.out.println("The gap is " + minGap(list, size));
						break;

				case 4:
						print(list, size);
						System.out.println(" The mean for this list is " + getMean(list, size));
						break;
				
				case 0:
						System.exit(0);
			}
		}
}

	public static int getInt(Scanner input, String prompt){
			while(!input.hasNextInt()){
			input.next();
			System.out.print("Not an integer! Try again!"); System.out.println(prompt);
			}
			
		return input.nextInt();
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
			if(list[i] % 2 != 0){

				isEven = false;
				break;
			}
		}
		return isEven;
	}

	//Method check for unique numbers
	public static boolean isUnique(int[] list, int size){
		//this is probarbly wrong, gotta come to back to it. 
		boolean duplicates = true;
		for(int i = 0; i < size; i++)
			for(int j = i + 1; j < size; j++)
				if(list[j] == list[i])
					duplicates = false;
		return duplicates;
	}

	public static int minGap(int[] list, int size){
		int gap = list[1] - list[0];
		for(int i = 1; i < size - 1; i++){
			int absDiff = list[i + 1] - list[i];
			if(absDiff < gap){
				gap = absDiff;
			}
		}
		return gap;
	}

	public static int menu(){
		int option;
		String prompt = "Please enter your option: ";
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Your options are: ");
			System.out.println("-------------------");
			System.out.println("1) All even values?");
			System.out.println("2) All unique values?");
			System.out.println("3) Print min gap between values?");
			System.out.println("4) Statistics");
			System.out.println("5) Print 80% percentile");
			System.out.println("0) EXIT");
			System.out.print("Please enter your option: ");

			option = getInt(input, prompt);
		}while(option < 0 || option > 5);
		return option;
		}
	//Bubble sort
	public static void bubbleSort(int[] list, int size){
		
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < size - i - 1; j++){
				if(list[j - 1] > list[j]){
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
	//Copies the array into another array
	public static void copy(int[] list1, int[] newList1, int size){
		for(int i = 0; i < size; i++)
			newList1[i] = list1[i];
	}

	public static void top_20(int[] list, int size){
		int list1[] = new int[size];
//		copy(list, newList, size);
		bubbleSort(list, size);
		System.out.println("The list is sorted");
		for(int i = 0; i < size; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println();
		System.out.println("80%-percentile from this list:");
		int twentryPrecent = size * 20 / 100;
		int count = 0;
		
		for(int i = size - 1; i >= 0; i--){
			if(count < twentryPrecent){

				System.out.print(list[i] + " ");
				count++;
			}else{
				break;
			}
		}
		System.out.println();
	}

	public static double getMean(int[] list, int size){
		int total = 0;
		for(int i = 0; i < list.length; i++){
			total += list[i];
		}
		int avg = total / list.length;

		return avg;
	}

	public static double getVariance(int[] list, int size){
		double sum = 0;

		for(int i = 0; i < size; i++){
			sum += list[i];
		}
			double mean  = (double)sum / (double) size;

		double sqDiff = 0;
		for(int i = 0; i < size; i++)
			sqDiff += (list[i] - mean) * (list[i] - mean);
	return (double)sqDiff / size;
	}

	public static double getDeviation(int[] list, int size){
		return Math.sqrt(getVariance(list, size));
	}
}
