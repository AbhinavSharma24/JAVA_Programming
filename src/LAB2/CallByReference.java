package LAB2;

class TestDemo
{
    int a,b;
    TestDemo(int i,int j)
    {
        a=i;
        b=j;
    }
    void meth(TestDemo o)
    {
        int temp;
        temp=o.a;
        o.a=o.b;
        o.b=temp;
    }
}
public class CallByReference {
    public static void main(String[] args) {
        TestDemo ob=new TestDemo(25,50);
        System.out.println("ob,a and ob.b before call: "+ob.a +" "+ob.b);
        ob.meth(ob);
        System.out.println("ob,a and ob.b after call: "+ob.a +" "+ob.b);
    }
}
