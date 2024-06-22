import java.util.*;
class swap
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The 2 nos. to swap: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("X is: "+ x);
        System.out.println("Y is: "+ y);
    }
}