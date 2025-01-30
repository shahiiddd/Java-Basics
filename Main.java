import java.util.Scanner;

public class Main{

    public static void insertionSort(int []arr){
        for (int i = 0;i<arr.length;i++){
            int min = arr[i];
            for (int j=i;j<arr.length;j++){

            }
            if (min>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Main ob = new Main();
        System.out.println("Enter the number of element in array : ");
        int n = sc.nextInt();
        int [] arr=new int [n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System .out.println("Using Insertion Sort");
        insertionSort(arr);
    }
}
