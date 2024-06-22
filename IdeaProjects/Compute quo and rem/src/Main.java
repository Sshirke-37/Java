import java.util.*;
class compute
{
    public static void main(String z[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter The 2 Numbers: ");

        int a = s.nextInt();
        int b = s.nextInt();

        int q = a / b;
        int r = a % b;

        System.out.println("Quotient is: "+q);
        System.out.println("Remainder is: "+r);
    }
}