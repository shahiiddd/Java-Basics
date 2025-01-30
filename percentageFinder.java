import java.util.Scanner;

public class percentageFinder {
    public static void main(String[] args) {
        System.out.println("Enter the marks of 5 subject");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 1st subject :");
        float a=sc.nextFloat();
        System.out.println("Enter the marks of 2nd subject :");
        float b=sc.nextFloat();
        System.out.println("Enter the marks of 3rd subject :");
        float c=sc.nextFloat();
        System.out.println("Enter the marks of 4th subject :");
        float d=sc.nextFloat();
        System.out.println("Enter the marks of 5th subject :");
        float e=sc.nextFloat();

        float sum=a+b+c+d+e;
        System.out.println("Total marks scored :"+sum);
//        System.out.println("Total marks scored out off :");
        float outOff=500;

        float percent=sum*100/outOff;
        System.out.println("Percentage scored is :"+percent+"%");
    }
}
