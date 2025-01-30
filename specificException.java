import java.util.Scanner;

public class specificException {
    public static void main(String[] args) {
        int [] arr=new int[5];
        arr[0]=0;
        arr[1]=5;
        arr[2]=10;
        arr[3]=20;
        arr[4]=17;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the array index :");
        int ind=sc.nextInt();
        System.out.println("Enter the value you want to divide the value with :");
        int number=sc.nextInt();

        try{
            System.out.println("The value at array index entered is "+ arr[ind]);
            System.out.println(arr[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Arithmatic error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("array error");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("input erro");
        }
    }
}
