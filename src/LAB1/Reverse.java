package LAB1;

import java.util.Scanner;

class Reverse
{
    public static void main(String args[])
    {
        int n,rev=0,rem;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = s.nextInt();
        /**
         *while loop is used to reverse the number.
         *remove the last digit from number and append it
         *to the end of reversed number variable until
         *original number is gone and the *reversed number is complete.
         */
        while(n!=0)
        {
            rem=n%10;
            rev = rev*10 +rem;
            n=n/10;
        }
        System.out.print(rev);
    }
}
