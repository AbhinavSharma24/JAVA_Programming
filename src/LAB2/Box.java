package LAB2;

import java.util.Scanner;

public class Box {
    int width,height,depth;
    void volume(){
        System.out.println("Volume : "+width*height*depth);
    }
    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box();
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the width,height and depth of Box 1 : ");
        b1.width=s.nextInt();
        b1.height=s.nextInt();
        b1.depth=s.nextInt();
        b1.volume();

        System.out.println("Enter the width,height and depth of Box 2 : ");
        b2.width=s.nextInt();
        b2.height=s.nextInt();
        b2.depth=s.nextInt();
        b2.volume();
    }
}
