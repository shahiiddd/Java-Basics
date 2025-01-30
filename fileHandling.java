import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        File file = new File("shahid.txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Unable to create file");
        }

        try {
            FileWriter fileWriter = new FileWriter("shahid.txt");
            fileWriter.write("This is our first file from this java course");
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        File myFile = new File("shahid.txt");
        try {
            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
