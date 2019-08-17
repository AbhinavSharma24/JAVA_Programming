package LAB2;

import java.util.Scanner;

public class Area {
    void area(int s){
        System.out.println("Area of square : "+s*s);
    }
    void area(int l,int b){
        System.out.println("Area of Rectangle : "+l*b);
    }
    void area(int b,float h){
        System.out.println("Area of Triangle : "+0.5*b*h);
    }
    public static void main(String[] args) {
        int side,length,breadth,base;
        float height;
        Area a = new Area();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        side = s.nextInt();
        a.area(side);
        System.out.println("Enter the length and breadth of rectangle : ");
        length = s.nextInt();
        breadth = s.nextInt();
        a.area(length,breadth);
        System.out.println("Enter the base and heigth of triangle : ");
        base = s.nextInt();
        height = s.nextFloat();
        a.area(base,height);
    }
}

