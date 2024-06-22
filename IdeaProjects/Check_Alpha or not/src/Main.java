import java .util.*;
class check
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number To check if it is even or odd: ");

        String n = s.next();

        if(n >= 'a' && n <= 'z' || n >= 'A' && n <= 'Z' )
        {
            System.out.println("Is Alphabet");
        }
        else
            System.out.println("Not Alphabet");
    }
}