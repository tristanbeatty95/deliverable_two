
import java.util.Scanner;
public class CoinFlip {
	public static void main(String[] args) {
		
		int correctCount = 0;
		
		
       
		Scanner guessingGame = new Scanner(System.in);
		
		System.out.println("Guess heads or tails!");
		String headsOrTailsGuess = guessingGame.next();
		
		
		System.out.println("How many times should I flip the coin?");
		int numberOfFlips = guessingGame.nextInt();		
		 for (int i=0; i < numberOfFlips; i++) {
		 
			
		        int randomNum = (int)(Math.random() * 2);
		if (randomNum == 0) {
		
			System.out.println("Heads");
			if(headsOrTailsGuess.matches("heads")) {
				correctCount++;
			}
			
		}
		else if (randomNum == 1) {
		
			System.out.println("Tails");
			if(headsOrTailsGuess.matches("tails")) {
				correctCount++;
			}
		}
		 }	
			guessingGame.close();
			
		
			
		if (headsOrTailsGuess.equals("heads")) {
			System.out.println("You guessed heads! The coin landed on heads " + correctCount + " times."
					+ " The coin landed on heads " + ((correctCount / (double) numberOfFlips) * 100) + "% of the time");
		} else if (headsOrTailsGuess.equals("tails")) {
			System.out.println("You guessed tails! The coin landed on tails " + correctCount + " times."
					+ " The coin landed on tails " + ((correctCount / (double) numberOfFlips) * 100) + "% of the time");
			}	
		
	}

}

