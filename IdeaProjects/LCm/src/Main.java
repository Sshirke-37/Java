import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The 2 Numbers: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        // find GCD between n1 and n2
        // int n1 = 81, n2 = 153;

        // initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}