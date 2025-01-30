import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // float []marks = {5,4,6,7,5};
        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<5;i++){
//            marks[i]=sc.nextInt();
//        }
//        for (int i=0;i<5;i++){
//            System.out.println(marks[i]);
//        }
//        for (float element : marks){       //for each loop
//            System.out.println(element);
//        }
//        System.out.println(marks.length);
//        marks[5]=55;
//        System.out.println(marks[5]);

        // Multi-Dimensional array
int [][] flats=new int[2][3];

System.out.println("enter the value in index");
  for (int i=0;i<2;i++) {
    for (int j=0;j<3;j++) {
  flats[i][j]=sc.nextInt();
     }
   }
for (int i=0;i<2;i++) {
    for (int j=0;j<3;j++) {
        System.out.print(flats[i][j]);
        System.out.print(" ");
    }
    System.out.println(" ");
}

    }
}
