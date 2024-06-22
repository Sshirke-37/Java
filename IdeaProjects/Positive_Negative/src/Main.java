import java .util.*;
class check
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number To check if it is Positive Or Negative: ");

        int n = s.nextInt();

        if(n>0)
        {
            System.out.println("Given Number iS Positive");
        }
        else
            System.out.println("Given Number is Negative");
    }
}