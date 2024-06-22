import java.util.*;
class fact
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
                System.out.println("Enter the number: ");
        int n = s.nextInt();
        int fact =1;
        for(int i=1;i<=n;++i)
        {
          fact = fact * i;
           // n *= i;
        }

       System.out.println("Factorial Is: "+fact);
    }
}