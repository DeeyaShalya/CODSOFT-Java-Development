package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	static void GuessNum(){
	    int minRange = 10;
	    int maxRange = 50;
	    int maxLimit = 3;
	    Random random = new Random();
	    int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	    System.out.println("Random number within the range: " + randomNumber);
	    
	    for(int i=1; i<=maxLimit; i++) {
	    	Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the guess number: ");
		    int GuessNum = sc.nextInt(); 
		    if(GuessNum==randomNumber) {
		    	System.out.println("The user has guessed the number correctly.");
		    	System.out.println();
		    	if(GuessNum==randomNumber) {
			    	break;
			    }
		    }
		    else if(GuessNum>randomNumber) {
		    	System.out.println("The guess is higher than the random number.");
		    	System.out.println();
		    }
		    else if(GuessNum<randomNumber) {
		    	System.out.println("The guess is lower than the random number.");
		    	System.out.println();
		    }
		    else{
		    	System.out.println("Invalid number.");
		    }
		    if(i==maxLimit) {
		    	System.out.println("You have reached the maximum limit, you cannot guess further.");
		    	System.out.println();
		    }
	    }
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to the Number Game!");
			System.out.println("Each user will get 5 rounds to play and each round will have 3 guesses.");
			System.out.println("Play accordingly.");
			System.out.println();
			GuessNum();
			
			for(int i=1; i<6; i++) {
				System.out.println("Play Again?");
				System.out.println("Press 1 for yes 2 for no");
				int choice = sc.nextInt();
				
				if(choice==1) {
					System.out.println();
					GuessNum();
				}
				else if(choice==2) {
					System.out.println("Thank you for playing!");
					break;
				}
			}
		}
	}

}
