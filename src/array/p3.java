import java.util.Scanner;
public class p3{
	public static final int SIZE = 31;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] temp = new int[SIZE];
		int numDays;
		double avg;
		int warmest;
		int coldest;

		do{
			System.out.print("How mnay daily temperatures: ");
			numDays = input.nextInt();
			if(numDays < 1 || numDays > SIZE)
				System.out.println("INPUT ERROR!!! Should be 1 - " + SIZE);
		}while(numDays < 1 || numDays > SIZE);

		System.out.print("Now enter " + numDays + " temperatures:  ");
		getTemps(temp, numDays);

		System.out.print("You entered ");
		print(temp, numDays);
		avg = findAvg(temp, numDays);
		warmest = findWarmest(temp, numDays);
		coldest = findColdest(temp, numDays);
		System.out.printf("Average temperature is: %.2f\n", avg);
		System.out.println("Highest temperature is: " + warmest);
		System.out.println("Lowest temperature is: " + coldest);
		
	}

	//Method to input data from the user
	public static void getTemps(int[] list, int size){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < size; i++)
			list[i] = input.nextInt();
	}

	//Method to print the array
	public static void print(int[] list, int size){
		for(int i = 0; i < size; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

	//Method to find average
	public static double findAvg(int[] list, int size){
		double avg;
		int sum = 0;
		for(int i = 0; i < size; i++)
			sum += list[i];
		avg = (double) sum / size;
		return avg;
	}

	//Method to find max
	public static int findWarmest(int[] list, int size){
		int max = list[0];
		for(int i = 1; i < size; i++){
			if(list[i] > max)
				max = list[i];
		}
		return max;
	}

	//Method to find min
	public static int findColdest(int[] list, int size){
		int min = list[0];
		for(int i = 1; i < size; i++){
			if(list[i] < min)
				min = list[i];
		}
		return min;
	}
}
