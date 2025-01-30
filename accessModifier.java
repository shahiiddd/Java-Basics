package shahid;

class C1{
    public int x=1;
    protected int y=2;
    public int z=3;
    private int a=4;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}

class C2 extends C1{

}
public class accessModifier {
    public static void main(String[] args) {
        C1 c=new C1();
        // In Class
//        c.meth1(); // all modifier are accessible in same class.

        // In Package
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a); //a is private , so it is not accessible in package

        // In SubClass
    }

}
