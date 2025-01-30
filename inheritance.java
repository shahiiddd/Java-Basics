import org.w3c.dom.ls.LSOutput;

class base{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println(x);
    }

    public void name(){
        System.out.println("Hello brother");
    }
}

class derive extends base{
    public void method(){
        System.out.println("hello shahid");
    }
}
class second_derive extends derive{
    public void method2(){
        System.out.println("hello mamma");
    }

}

public class inheritance {
    public static void main(String[]args){
        base b1=new base();
        b1.name();
        b1.setX(25);

        derive d1=new derive();
        d1.setX(65);
        d1.name();

        second_derive d2=new second_derive();
        d2.name();
        d2.setX(55);
        d2.method();

    }
}
