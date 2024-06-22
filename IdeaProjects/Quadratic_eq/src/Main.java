import java.util.*;
class q
{
    public static void main (String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Three Numbers: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        System.out.println("Z: "+z);

        int n1 = y * y - 4 * x * z;
        System.out.println("Discriminant: "+n1);

        int n2 = -b + sqrt(n1)/2*x;
        System.out.println("Final Ans: "+n2);
    }
}