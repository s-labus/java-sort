//Straxinja 05/2020

import java.util.Scanner;
public class PokeTrader2
{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int choice;

		String[] pokemons = {"Pikachu", "Charmeleon", "Geodude", "Gyarados", "Butterfree", "Mankey"};
		String previous = "";
		do{
			System.out.println("Exchange pokemon\n");
			for(int i = 0; i < pokemons.length; i++){
				System.out.println("\t" + i + " " + pokemons[i]);
			}
			System.out.println();
			System.out.println("Choose a pokemon (or -1 to quit). => ");

			choice = scan.nextInt();
			if(choice == -1){break;}
			previous = pokemons[choice];			
			System.out.println("Choose a pokemon to exchange with " + previous + " => ");
			
			choice = scan.nextInt();
	
			System.out.println("Exchanging " + previous.toUpperCase() + " with "+ pokemons[choice].toUpperCase() + ".");
			System.out.println();

		}while(choice > 0);	
	}

}

