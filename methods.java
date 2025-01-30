public class methods {
//    static int logic(int x,int y){  // static methods can be only called
//        int z;
//        if (x>y){
//            z=x+y;
//        }
//        else {
//            z=(x+y)*5;
//        }
//        return z;
//    }
//    static int logic1(int x,int y) {  // static methods can be only called
//        int z;
//        if (x > y) {
//            z = x * y;
//        } else {
//            z = (x * y) * 5;
//        }
//        return z;
//    }
    static void shahid(){
        System.out.println("good morning");
    }
    static void shahid(int x){
        System.out.println("good morning buddy");
    }
    static void shahid(int x,int y){  // x and y are parameter
        System.out.println("good morning buddy!! how u doin");
    }

    public static void main(String[] args) {
//        int a=2;
//        int b=5;
//        int c=logic(a,b);  // way 1 to call method
//        System.out.println(c);
//
//        c=logic1(a,b);
//        System.out.println(c);
//
//        methods obj1=new methods(); // way 2 to call method
//
//        c = obj1.logic(a,b);
//        System.out.println(c);

//        int d = obj1.logic1(a,b);
//        System.out.println(d);

        shahid();
        shahid(5);
        shahid(5,4); //arguments are actual ,5 and 4 ar
    }
}
