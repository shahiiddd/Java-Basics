interface sample1{
    void meth1();
    void meth2();
}
interface sample2 extends sample1{   //interface can extend another interface class
    void meth3();
    void meth4();
}
class  sampleClass implements sample2{
    public void meth1(){
        System.out.println("hello meth1");
    }
    public void meth2(){
        System.out.println("hello meth2");
    }
    public void meth3(){
        System.out.println("hello meth3");
    }
    public void meth4(){
        System.out.println("hello meth4");
    }
}
public class inheritanceInterface {
    public static void main(String[] args) {
        sampleClass sc=new sampleClass();
        sc.meth1();sc.meth2();sc.meth3();sc.meth4();
    }
}
