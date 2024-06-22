import java .util.*;
class check
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number To check if it is even or odd: ");

        int n = s.nextInt();

        if(n%2==0)
        {
            System.out.println("Given Number iS Even");
        }
        else
            System.out.println("Given Number is Odd");
    }
}