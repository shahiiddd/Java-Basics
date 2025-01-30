class a{
    public int shahid(){
        System.out.println("shahid method");
        return 1;
    }
    public void meth2(){
        System.out.println("method 2 of class a");
    }
}

class b extends a{
    public void meth2(){
        System.out.println("method 2 of class b");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        a a1=new b();
        b b1=new b();
        a a2=new b(); // dynamic method dispatch : object is of "b" but the reference is a
        a2.shahid(); // b extends a so even if object is of "b" then also "a" class method will run
        a2.meth2();
//        b1.meth2();
    }
}
