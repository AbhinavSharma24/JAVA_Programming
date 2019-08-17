package LAB2;

import java.util.Scanner;

public class BoxReturn {
    int width,height,depth;
    int volume(){
        return(width*height*depth);
    }
    public static void main(String[] args) {
        int vol;
        BoxReturn b1 = new BoxReturn();
        BoxReturn b2 = new BoxReturn();
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the width,height and depth of Box 1 : ");
        b1.width=s.nextInt();
        b1.height=s.nextInt();
        b1.depth=s.nextInt();
        vol = b1.volume();
        System.out.println("Volume : "+vol);

        System.out.println("Enter the width,height and depth of Box 2 : ");
        b2.width=s.nextInt();
        b2.height=s.nextInt();
        b2.depth=s.nextInt();
        vol = b2.volume();
        System.out.println("Volume : "+vol);
    }
}