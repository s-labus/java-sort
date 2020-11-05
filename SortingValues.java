//Straxinja 05/2020
import java.util.Random;
import java.util.Arrays;

public class SortingValues
{
	public static void main(String[] args){
	
	int[] values = new int[10];
	
	Random rnd = new Random();

	System.out.print("before: ");
	for(int i = 0; i < values.length; i++){
		values[i] = 1 + rnd.nextInt(100);
		System.out.print(values[i] + " ");
	}
	
		System.out.println();
	Arrays.sort(values);

	System.out.print("after: ");

	for(int val : values){
		System.out.print(val + " ");
	}
		System.out.println();
	}

}

