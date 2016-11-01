import java.util.Scanner;

public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = sc.nextLine();
        int wordcount = 1;
        
        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt(i) == ' ')
            {
                wordcount += 1;
            }
        }
        
        System.out.println("your sentence contains " + wordcount + " words");
    }
}
