public class method2 {
     static int sum1(int x,int y){
        return x+y;
    }
     static void sum2(int x,int y,int z){
        int a=6;
        int b=5;

        System.out.println( sum1(a,b));
    }

    static int sum3(int ...arr){ //array in methods
         int result=0;
        for (int a:arr) {
            result+=a;
        }
        return result;
    }
    public static void main(String []args){
         // only static methods can be called in static block
        System.out.println(sum1(3 ,5));
        sum2(2,5,6 );

        System.out.println( sum3(2,1,5,1,6,1,3)); // array can be called in method
    }
}
