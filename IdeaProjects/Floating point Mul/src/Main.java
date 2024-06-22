import java.util.*;
class mul
{
    public static void main(String a[])
    {
        Scanner b = new Scanner(System.in);

        System.out.print("Enter The 2 Numbers: ");

        float n1 = b.nextFloat();
        float n2 = b.nextFloat();

        float m = n1 * n2;

        System.out.print("Multiplication Of The Two Numbers is: "+m);
    }
}