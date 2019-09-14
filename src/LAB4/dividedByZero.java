package LAB4;

import java.util.Scanner;
public class dividedByZero {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c;
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("enter value of A : ");
            a = s.nextInt();
            System.out.println("Enter value of B : ");
            b = s.nextInt();
            System.out.println("Result : " + a/b);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
