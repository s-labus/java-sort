//Straxinja 05/2020

import java.util.Random;

public class SelectionSort
{

	public static void section(int[] num){
	
		int i, j, first, temp;
		for(i = num.length-1; i > 0; i--){
			first = 0;
			for(j = 1; j <= i; j++){
			if(num[j] < num[first]){first = j;}		 
		}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}

		for(int n : num){
		System.out.print(n + " ");
		try{Thread.sleep(500);}catch(Exception e){}
		}
	}
	
	public static void main(String[] args){
	Random rnd = new Random();
	int r;
	int[] values = new int[10];

	for(int i = 0; i < values.length; i++){
		values[i] = 1 + rnd.nextInt(51);
	}
	
	System.out.print("Before: ");
	for(int val: values){
		System.out.print(val + " ");
		try{Thread.sleep(500);}
		catch(Exception e){}
	}
	System.out.println();

	System.out.print("After: ");
	section(values);
	System.out.println();
 }
}

