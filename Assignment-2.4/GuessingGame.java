import java.util.Scanner;
class GuessingGame{
        public static void main(){
        Scanner scan=new Scanner(System.in);
        int randomnum=(int)(Math.random()*100)+1;
        System.out.println("I've picked a number between 1 and 100. Try to guess");
        int guess=0;
        while(guess!=randomnum){
            System.out.println("What is your guess?");
            guess=scan.nextInt();
            if(guess==randomnum) System.out.println("You've guessed my number! WOW!");
            else if(guess<randomnum) System.out.println("Too low...");
            else if(guess>randomnum) System.out.println("Too high...");
        }
    }
}