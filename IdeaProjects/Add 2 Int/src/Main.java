import java.util.*;
class add
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter The 2 Numbers: ");

        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int add = n1 + n2;

        System.out.print("Addition Of The Two Numbers is: "+add);
    }
}