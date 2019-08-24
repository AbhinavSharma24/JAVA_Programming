package LAB3;

//Abstract class
abstract class Employee {
    String name;   // Instance variable
    int salary,grosssal;  // Instance variable

    //Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Gross-salary : " + this.grosssal);
    }
    //Abstract method
    abstract void calculate_gross_salary();
    abstract void annual_increment();
}
class EmployeeManager extends Employee {
    String hra; //Instance variable

    //Constructor
    public EmployeeManager(String name, int salary) {
        super(name, salary);  //Constructor call of Superclass
    }
    //Over-ridden method
    @Override
    void calculate_gross_salary() {
        this.grosssal =  this.salary + 1000;
        System.out.println("Over-ridden calculate_gross_salary() method by EmployeeManager class");

    }
    //Over-ridden method
    @Override
    void annual_increment() {
        this.salary += 5000;
        System.out.println("Over-ridden annual_increment() method by EmployeeManager class");
    }
}
class SalesManager extends EmployeeManager {
    String commission;  //Instance variable

    //Constructor
    public SalesManager(String name, int salary) {
        super(name, salary);  //Constructor call of Superclass
    }
    //Over-ridden method
    @Override
    void calculate_gross_salary() {
        this.grosssal =  this.salary + 2000;
        System.out.println("Over-ridden calculate_gross_salary() method by SalesManager class");
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager("Tom", 10000); //Instance creation
        //Method call by manager object
        manager.calculate_gross_salary();
        manager.annual_increment();
        System.out.println();
        manager.print();

        SalesManager sales = new SalesManager("Jerry", 15000);  //Instance creation
        //Method call by sales object
        sales.calculate_gross_salary();
        System.out.println();
        sales.print();
    }
}
