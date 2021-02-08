public class bubbleSort{
	public static void main(String[] args){
		int[] arr = {5, 3, 44, 2, 13};
		int temp;

		//Bubble sort 
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 1; j < (arr.length - i); j++){
				if(arr[j - 1] > arr[j]){
					temp = arr[j-1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}
			}

		}

		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}
}
