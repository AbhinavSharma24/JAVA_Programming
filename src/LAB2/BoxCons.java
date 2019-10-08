package LAB2;

import java.util.Scanner;

public class BoxCons {
    private int width,height,depth;
    private BoxCons(){
        width=0;height=0;depth=0;
    }
    private void volume(){
        System.out.println("Volume : "+width*height*depth);
    }
    public static void main(String[] args) {

        BoxCons b1 = new BoxCons();
        Scanner s  = new Scanner(System.in);
        System.out.println("Volume of non parametrised constructor :: ");
        b1.volume();
        System.out.println("Enter the width, height and depth of Box 1 :: ");
        b1.width=s.nextInt();
        b1.height=s.nextInt();
        b1.depth=s.nextInt();
        b1.volume();

    }
}
