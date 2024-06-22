import java .util.*;
class large
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the 3 Number: ");

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

       if (x>y && x>z)
           System.out.println(x);
       else if(y>x && y>z)
           System.out.println(y);
       else
           System.out.println(z);
    }
}