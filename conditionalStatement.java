import java.util.*;
public class conditionalStatement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        byte a=sc.nextByte();
//        if (18<a){
//            System.out.println("you can drive");
//        }
//        else if (a<18){
//            System.out.println("ok");
//        }
//        else {
//            System.out.println("you cant drive");
//        }
        switch (a) { //enhanced switch
            case 18 -> {
                System.out.println("you can drive");
                System.out.println("hello");
            }
            case 22 -> System.out.println("job krni hai");
            case 28 -> System.out.println("maze karo");
            default -> System.out.println("do anything");
        }


    }
}
