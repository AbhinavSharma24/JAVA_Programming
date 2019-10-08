package LAB2;

import java.util.Scanner;

public class This {
    private int width,height,depth;
    
    private This(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    private void volume(){
        System.out.println("Volume : "+width*height*depth);
    }
    public static void main(String[] args) {

        This b1 = new This(2,4,6);
        Scanner s  = new Scanner(System.in);
        System.out.println("Volume of parametrised constructor : ");
        b1.volume();

        System.out.println("Enter the width, height and depth of Box  : ");
        b1.width=s.nextInt();
        b1.height=s.nextInt();
        b1.depth=s.nextInt();
        b1.volume();
    }
}
