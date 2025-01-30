public class tryCatch {
    public static void main(String[] args) {
        int a=3;
        int b=0;

        try {
            int c = a / b;
            System.out.println("The result is :"+c);
        }catch(Exception e){
            System.out.println("We failed, as always");  // this program is throwing run time exception which is handled by try-catch block
            System.out.println(e);
        }
        System.out.println("Program end");

    }
}
