package LAB1;

public class Fibonacci {
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);
        /**
         *The loop finds fibonacci numbers .It finds
         *the next term by finding sum of previous
         *two terms
         */
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
