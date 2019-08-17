package LAB2;

import java.util.Scanner;

public class BoxConsOver {
    int width,height,depth;
    BoxConsOver(){
        width=0;height=0;depth=0;
    }
    BoxConsOver(int w,int h,int d){
        width=w;
        height=h;
        depth=d;
    }
    void volume(){
        System.out.println("Volume : "+width*height*depth);
    }
    public static void main(String[] args) {

        BoxConsOver b1 = new BoxConsOver();
        BoxConsOver b2 = new BoxConsOver(2,4,6);
        Scanner s  = new Scanner(System.in);
        System.out.println("Volume of non parametrised constructor : ");
        b1.volume();
        System.out.println("Volume of parametrised constructor : ");
        b2.volume();

        System.out.println("\nEnter the width,height and depth of Box 1 : ");
        b1.width=s.nextInt();
        b1.height=s.nextInt();
        b1.depth=s.nextInt();
        b1.volume();

    }
}