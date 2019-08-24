package LAB3;

//Abstract class
abstract class Interfaces {
    String name = "Abhinav";  //Instance variable
    int salary = 100000;     //Instance variable
    abstract void increment();  //Abstract method
    //Method to calculate salary
    void calcsal() {
        this.salary +=1000;
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }
}
//Interface
interface Interface1 {
    void f1();  //Abstract & public method
}
//Interface
interface Interface2 {
    void f2(); //Abstract & public method
}
//Interface
interface Interface3 extends Interface1, Interface2 {
    void f3();   //Abstract & public method
}

class Emp extends Interfaces implements Interface3 {
    String hra = "Manager";
    //over-ridden methods
    @Override
    void increment() {
        this.salary += 103000;
        System.out.println("Incremented salary : " + this.salary);
    }

    @Override
    public void f1() {
        System.out.println("f1() method");
    }

    @Override
    public void f2() {
        System.out.println("f2() method");
    }

    @Override
    public void f3() {
        System.out.println("f3() method");
    }

    public static void main(String[] args) {
        Emp ob = new Emp(); //Instance creation
        ob.calcsal();
        System.out.println();
        ob.increment();
        ob.f1();
        ob.f2();
        ob.f3();
    }
}
