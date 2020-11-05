//Straxinja 05/2020
import java.util.Random;

public class BubbleSort
{
	public static int[] arr(){
		int[] values = new int[10];

		Random rnd = new Random();	

		for(int i = 0; i < values.length; i++){
			values[i] = 1 + rnd.nextInt(100);
		}
		return values;
	}

	public static void bbSort(int[] n){
		int j, temp;
		boolean flag = true;	
	
		while(flag){
		 flag = false;
		 for(j = 0; j < n.length-1; j++){
			if(n[j] > n[j+1]){
			temp = n[j];
			n[j] = n[j+1];
			n[j+1] = temp;
			flag = true;
			 }
			}
		}
	for(int s: n){System.out.print(s + " ");}	
	}

	public static void main(String[] args){

	int[] main = arr();

	System.out.print("Before: ");
		
	for(int m : main){System.out.print(m + " ");}
	System.out.println();	

	System.out.print("After: ");
	bbSort(main);
	System.out.println();
 }
}

