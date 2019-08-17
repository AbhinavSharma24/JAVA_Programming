package LAB1;

import java.util.Scanner;

public class Factorial {
    //main function is entry point of program
    public static void main(String args[])
    {
        /*
         *s is object of Scanner class to read input
         *System.in refers to keyboard
         */
        Scanner s = new Scanner(System.in);
        //Function used to display output
        System.out.println("Enter any number : ");
        //nextInt used to get integer value from keyboard
        int num = s.nextInt();
        long factorial = 1;
        //loop calculates factorial of number
        for(int i=1;i<=num;i++)
        {
            factorial *= i;
        }
        System.out.println(num+"! = "+factorial);
    }
}
