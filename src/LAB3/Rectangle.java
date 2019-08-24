package LAB3;

import java.util.Scanner;

class Shape
{
    double d1,d2;
    Scanner input=new Scanner(System.in);

    void get()
    {
        d1=input.nextInt();
        d2=input.nextInt();
    }
    void print()
    {

    }
}
class Rectangle extends Shape
{
    @Override
    void print()
    {
        System.out.println("Length = "+d1);
        System.out.println("Breadth = "+d2);
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();

        System.out.println("Enter length and breadth of rectangle :-");

        rectangle.get();
        rectangle.print();
    }

}
