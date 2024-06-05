import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {   
        int randNumber= (int)(Math.random()* (20) + 1);
        String [] messages = {"It is certain"," It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", " As I see it, yes", "Most likely", "Outlook good", "Yes", " Signs point to yes","Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", " My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
        System.out.println("MUAHAHAHAHAHA Ask the evil 8 ball a question if you DARE!..... it will decide your fate!!!!");
         Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals("Quit")){
            System.exit(0);
        }
        else{
        System.out.println(messages[randNumber]);
        }
        }
    }
