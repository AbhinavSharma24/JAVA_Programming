package LAB2;

public class StaticClass {

    // static variable
    private static int x = 100;
    private static int y;

    // static block is executed once when class gets loaded
    static {
        System.out.println("Static block initialized.");
        y = x * 8;
    }

    public static void main(String[] args)
    {
        System.out.println("from main");
        System.out.println("Value of a : "+x);
        System.out.println("Value of b : "+y);

        StaticClass staticClass=new StaticClass();
        StaticClass staticClass1=new StaticClass();
        //all objects get same copy of static members
        System.out.println(staticClass.x);
        System.out.println(staticClass1.x);

        //static members can be accessed by class name
        System.out.println(StaticClass.x);

    }
}
