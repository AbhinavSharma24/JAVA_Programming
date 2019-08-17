package LAB1;

/**
 *Scanner is a class in java.util package used for
 *obtaining the input of the primitive types like
 *int, double, etc. and strings.
 */
import java.util.Scanner;

/**
 *The Pattern class is used to display following
 *            1
 *      1    2   1
 *   1   2  3  2  1
 */
class Pattern
{
    //main function is entry point of program
    public static void main(String args[])
    {
        int rows;
//Function used to display output
        System.out.println("Enter the height");
/**
 *input is object of Scanner class to read input
 *System.in refers to keyboard
 */
        Scanner input=new Scanner(System.in);
        //nextInt used to get integer value from keyboard
        rows=input.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}