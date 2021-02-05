import java.util.Arrays;
import java.util.Scanner;
public class p1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int key, index;
		int[] a = {59, 3, 30, 12, 91};
		int[] b = new int[a.length];
		b[0] = a[0];
		for(int i = 1; i < a.length; i++){
			b[i] = a[i - 1] + a[i];
		}

		System.out.println("Array a is: " + Arrays.toString(a));
		System.out.println("Array b is: " + Arrays.toString(b));
		System.out.println("\nCalling binarySearch for array b.");
		System.out.print("Enter search key: ");
		key = input.nextInt();
		index = Arrays.binarySearch(b, key);
		if(index < 0)
			System.out.println("Key not found");
		else
			System.out.println("Key found in the elemnt with index " + index);
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("The sorted array a is " + Arrays.toString(a));
		System.out.println("The sorted array b is " + Arrays.toString(b));

	}
}
