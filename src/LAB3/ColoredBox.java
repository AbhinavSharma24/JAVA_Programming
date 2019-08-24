package LAB3;

import java.util.Scanner;

class Box {
    float l,w,h;
    static Scanner s = new Scanner(System.in);
    void get() {
        System.out.println("Enter l,w,h : ");
        l = s.nextFloat();
        w = s.nextFloat();
        h = s.nextFloat();
    }
    void print() {
        System.out.println("Volume : "+l*w*h);
    }
}

public class ColoredBox extends Box{
    static  String color;
    void print() {
        super.print();
        System.out.println("Color entered = " + color);
    }
    public static void main(String[] args) {
        ColoredBox coloredBox = new ColoredBox();
        System.out.println("Enter color : ");
        color = s.next();
        coloredBox.get();
        coloredBox.print();
    }
}
