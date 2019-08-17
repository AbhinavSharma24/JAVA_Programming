package LAB1;

import java.util.Scanner;
class Greatest
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        System.out.println("Enter three integers : ");
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
        //The greatest number is found using conditional operator and printed
        System.out.println("Greatest : "+((n2>n1&&n2>n3)?n2:((n3>n1&&n3>n2)?n3:n1)));
    }
}
