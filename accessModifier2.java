package shahid;

public class accessModifier2 {
    public int x=1;
    protected int y=2;
    int z=3;  //default
    private int a=4;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
    public static void main(String[] args) {
        C1 c=new C1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a); // a is private ,so it will throw error because private modifier are not accessible in throughout package
    }
}
