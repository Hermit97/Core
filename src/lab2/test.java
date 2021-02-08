import java.util.Arrays;
public class test{
	public static void main(String[] args){
		int[] arr = {1, 3, 5, 11, 3, 44};
		Arrays.sort(arr);

		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
