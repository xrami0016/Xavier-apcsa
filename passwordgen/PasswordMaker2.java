
public class PasswordMaker2
{
    public static void main(String[] args)
    {

        
    }
    private static void passwordMaker(int length, int nums, int symbols, int capital)
    {
        String password = "";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String characters = "!@#$%^&*";
        for (int i = 0; i < 10; i++)
            {
                int x = (int)(Math.random()*4);
                if (x == 0) 
                {
                    x = (int)(Math.random()*26 + 1);
                    password = password + (letters.substring((x-1),x)).toUpperCase();
                }
                else if (x == 1) 
                {
                    x = (int)(Math.random()*7 + 1);
                    password = password + characters.substring((x-1),x);
                }
                else if (x == 2)
                {
                    password = password + (int)(Math.random()*10);
                }
                else
                {
                    x = (int)(Math.random()*26 + 1);
                    password = password + letters.substring((x-1),x);
                }
                
            }
        System.out.println(password);
        
    }
}