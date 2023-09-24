package Task;

import java.util.Scanner;

public class NumberGame {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int min=1;
		int max=100;
		int attempts=5;
		int totalscore=0;
		
		boolean play= true;
		
		System.out.println("Number Guessing Game!");
		
		while(play) {
			                                            //(100-1)+1
			int systemnumber = (int) Math.round(Math.random()*(max-min))+min;
			System.out.println("System has Generated a number between "+min+" and "+max);
			System.out.println("you have "+attempts+" attemps to guess number");
			
			int attempt=0;
			boolean guess=false;
			
			while (attempt<attempts) {
				System.out.println("Enter your number");
				int usernumber = scanner.nextInt();
				attempt++;
				
				
				if(usernumber ==systemnumber ) {
					System.out.println("Congrats You are correct");
					totalscore++;
					guess=true;
					break;
				}
				else if (usernumber<systemnumber) {
					System.out.println("Your guess is low and Attept left "+(attempts-attempt));
				}
				else {
					System.out.println("Your guess is high and Attept left "+(attempts-attempt));
				}
				
			}
			
			if(guess == false) {
				System.out.println("Sorry you have used all attemps the correct number is "+systemnumber);
			}
			
			System.out.println("Your score: "+totalscore);
			System.out.print("want to play again?  yes/no : ");
			String responseString = scanner.next();
			play=responseString.equalsIgnoreCase("yes");
			
		}
		
		System.out.print("Thank you for playing");
		
	}

}
