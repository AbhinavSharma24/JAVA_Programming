package LAB1;

import java.util.Scanner;

class PercentageGrades
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Percentage : ");
        int percent = s.nextInt();
        if(percent <= 50)
        {
            System.out.println("Equivalent grade to "+percent+" percentage is F");
        }
        else
        {
            if((percent<=60))
            {
                System.out.println("Equivalent grade to "+percent+" percentage is E");
            }
            else
            {
                if(percent<=70)
                {
                    System.out.println("Equivalent grade to "+percent+" percentage is D");
                }
                else
                {
                    if(percent<=80)
                    {
                        System.out.println("Equivalent grade to "+percent+" percentage is C");
                    }
                    else
                    {
                        if(percent<=90)
                        {
                            System.out.println("Equivalent grade to "+percent+" percentage is B");
                        }
                        else
                        {
                            System.out.println("Equivalent grade to "+percent+" percentage is A");
                        }
                    }
                }
            }
        }
    }
}