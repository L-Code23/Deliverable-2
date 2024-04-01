import java.util.Random;
import java.util.Scanner;
public class CoinFlipChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int number;
		String yes = "Y";
		String no = "N";
		String heads = "Heads";
		String tails = "Tails";
		String answer;
		Random flip = new Random();
		int counter;
		String wrong = "Wrong!";
		String correct = "Correct!";
		
		int score = 0;
		
		
		
		
		System.out.println("Welcome to the Coin Flip Challenge");
		System.out.println("What is your name?");
		String name = scnr.nextLine();
		System.out.println("Hello " + name + "! Would you like to play the Coin Flip Challenge? Answer Y or N. ");
		answer = scnr.nextLine();
		if (answer.equals("N")) {
			System.out.println("You are a coward " + name + "!");
			System.exit(0);
		}
		for( counter=1; counter<=5; counter++)  {
			System.out.println("Heads or Tails ?");
			answer = scnr.nextLine();
			
			
        	
        	
        	
		number = flip.nextInt(2); 
			System.out.println(number); // This is here to confirm the random number. Remove with final draft.
			
			
			if (answer.equals(heads) && number == 0) { 
				System.out.println(correct);
				score++;
		}
			else if (answer.equals(heads) && number == 1){
				System.out.println(wrong);
				
			}
			else if (answer.equals(tails) && number == 1){
				System.out.println(correct);
				score ++;	
			}
			if (answer.equals(tails) && number == 0){
	
				System.out.println(wrong);
			
			}
			
					
		    		}
		System.out.println( "Thank you "+ name +"! You got a score of " + score + ".");
		System.exit(0);
			
			
			
		
				}
					 
		}		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
	        
			
			
			
			
		
	

			
			
						
	
			
			
			
			
			
			
			
		
			
		
		
		
		
	


