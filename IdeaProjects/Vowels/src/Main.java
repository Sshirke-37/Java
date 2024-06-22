import java .util.*;
class check
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number To check if it is Vowel Or Consonant: ");

        char n = s.next();

        if(n =='a' || n =='e'|| n =='i'|| n =='o'|| n =='u')

            System.out.println("Given Char is Even");
        else
            System.out.println("Given Char is Consonant");
    }
}