package LAB4;

import java.util.Scanner;

public class Distance {
    float dis1,dis2;

    void addDistance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first distance :- ");
        dis1 = scan.nextFloat();
        System.out.println("Enter second distance :- ");
        dis2 = scan.nextFloat();

        float distance = dis1 + dis2;
        System.out.println("\nResultant distance obtained = " + distance + " meters.");
    }

    public static void main(String[] args) {
        Distance D = new Distance();
        D.addDistance();
    }
}
