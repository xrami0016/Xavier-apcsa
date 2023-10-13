import java.util.Scanner;
public class Main
{ 
    public static void main(String[] args)
    {
                    
        int compNum = (int)(Math.random()* (100) + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number between 1 and 100!");
        int userNum = scanner.nextInt();
        int guesses = 0;
        while(compNum != userNum){
           
            if(userNum < compNum){
                System.out.println("Higher");
                guesses += 1;
            }
            else if(compNum < userNum){
                System.out.println("Lower");
                guesses += 1;
            }
            System.out.println("Enter a Number between 1 and 100!");
            userNum = scanner.nextInt();
             
            if(compNum == userNum){
                guesses += 1;
                System.out.println("You guessed right!");
                System.out.println("It took you " + guesses + " tries!");
            }
        }
        
    }
}