abstract class parent2{
    public parent2(){   // abstract class cannot make object in main method
        System.out.println("parent2 ka constructor hu");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class child extends parent2{

    @Override
    public void greet(){

        System.out.println("good morning");
    }
}
 class child2 extends parent2{  // make class child 2 abstract or form same abstract method
    public void greet(){
        System.out.println("hello");
    }
}

public class abstractMethod {
    public static void main(String[] args) {
//        parent2 p1=new parent2();      throws error
//        child2 c=new child2();     throws error  : abstract class object cannot be made
           child c2=new child();
           c2.sayhello();
           c2.greet();
           c2.greet();
    }
}
