class base1{
    base1(){
        System.out.println("I am a base class constructor");
    }
    base1(int x){
        System.out.println("I am a base class over-loaded constructor");
    }
}
class derive2 extends base1{  //parent class constructor will be displayed in out even if it has its own constructor

    derive2(){
        System.out.println("i am derive class constructor");
    }

    derive2(int x,int y){
        super(x);   //by default this constructor will run
        System.out.println("I am a derived class over-loaded constructor");
    }
}


public class constructorInInheritance {
    public static void main(String[] args) {
//        base1 b1=new base1(5);
        derive2 d1=new derive2(1,2);  //first base call constructor will run
    }
}
