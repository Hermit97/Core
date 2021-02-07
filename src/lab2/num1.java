//package Core.src.lab2;
import java.util.Scanner;
import java.util.Random;
public class num1{
	public static final int MAX = 100;
	public static final int MIN = 1;
	public static void main(String[] args){
		

	}

	public static void getInt(int[] list, int size){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < size; i++)
			list[i] = input.nextInt();
		input.close();
	}

	public static void initRand(int list[], int size, int max, int min){
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
		for(int i = 0; i < size; i++){
			if(list[i] % 2 == 0)
				return true;
			else
				return false;
		}
		return true;
		
	}

	//Method check for unique numbers
	public static boolean isUnique(int[] list, int size){
		boolean duplicates = false;
		for(int i = 0; i < list.length; i++)
			for(int j = i + 1; j < list.length; j++)
				if(j != i && list[j] == list[i])
					duplicates = true;
		return duplicates;
	}

	public static int minGap(int[] list, int size){
		for(int i = 0; i < size; i++){
			for(int j = 0; j < list[i]; j += 2)
				//logic

		}

	}
}
