//Straxinja 05/2020

import java.util.Scanner;
public class PokeTrader
{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int choice;
		String[] pokemons = {"Pikachu", "Charmeleon", "Geodude", "Gyarados", "Butterfree", "Mankey"};
		String previous = "";
		do{
			System.out.println("Exchange pokemon\n");
			for(int i = 0; i < pokemons.length; i++){
				System.out.println(i + " " + pokemons[i]);
			}
			System.out.println();
			System.out.println("Choose a pokemon to exchange with " + pokemons[0] + " (Or enter 0 to quit.)");
			choice = scan.nextInt();
			previous = pokemons[0];
			pokemons[0] = pokemons[choice];
			pokemons[choice] = previous;	
		}while(choice > 0);	
	}

}

