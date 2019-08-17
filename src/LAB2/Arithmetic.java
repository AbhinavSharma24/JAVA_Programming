package LAB2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int n1,n2,ch;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        n1 = s.nextInt();
        n2 = s.nextInt();
        System.out.println("\nChoose one from :- ");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        System.out.println("Enter your choice : ");
        ch  = s.nextInt();
        switch (ch){
            case 1 :
                System.out.println("Sum : "+(n1+n2));break;
            case 2:
                System.out.println("Difference : "+(n1-n2));break;
            case 3:
                System.out.println("Product : "+(n1*n2));break;
            case 4:
                System.out.println("Quotient : "+(n1/n2));break;
            default:
                System.out.println("Wrong Choice!!");
        }
    }
}
