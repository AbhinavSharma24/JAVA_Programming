package LAB4;

import java.util.Scanner;

public class finallyBlock {
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
            System.out.println("Answer : " + a/b);
        }
        catch(Exception e){
            System.out.println(e);
            throw e;
        }
        finally {
            System.out.println("\nStuff from finally block.\n");
        }
        System.out.println("Outside finally");
    }
}
