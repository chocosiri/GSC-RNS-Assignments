
import java.util.Scanner;

public class input
{
    public static void main(String[] argv)
    {
        String text = "";  
        do
        {
           
            String original, reverse = "";
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter a string to check if it is a palindrome");
            original = in.nextLine();
            text = original; 
            int length = original.length();
       
            for ( int i = length - 1; i >= 0; i-- )
               reverse = reverse + original.charAt(i);
       
            if (original.equals(reverse))
               System.out.println("Entered string is a palindrome.");
            else
               System.out.println("Entered string is not a palindrome.");
       
            
        }
        while (!text.equals("GSCRnsit"));
    }
}
