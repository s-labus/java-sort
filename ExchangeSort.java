//Straxinja 05/2020
import java.util.Random;
import java.util.Arrays;

public class ExchangeSort
{
	public static void exhcangeArr(int[] arr){
		
		int i,j, temp;

		for(i = 0; i < arr.length; i++){
		 for(j = 0; j < arr.length; j++){
			if(arr[i] < arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		 }
		}
	
		for(int val : arr){
			System.out.print(val + " ");
		}
	}

	public static void main(String[] args){

	Random rnd = new Random();
	
	int[] arr = new int[10];

	System.out.print("Before: ");
	
	for(int i = 0; i < arr.length; i++){
		arr[i] = 1 + rnd.nextInt(100);
		System.out.print(arr[i] + " ");
	}

	System.out.println();
	
	System.out.print("After: ");
	exhcangeArr(arr);
	System.out.println();
	
 }
}

