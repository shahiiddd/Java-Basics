class class1{
    int a;
        public int getA(){
//            System.out.println(a);
            return a;
        }

        public void setA(int a){
            this.a=a;
        }

        class1(){
            System.out.println("i am class1 constructor");
        }
        class1(int x){
            System.out.println("hello");
        }
}
class class2 extends class1{
    class2(){
        super(1);
        System.out.println("i am class2 constructor");
    }
}
public class thisSuperKeyword {
    public static void main(String[] args) {
//        class1 c1=new class1();
        class2 c2=new class2();
//        c1.setA(5);
//        System.out.println(c1.getA());
        }
}
