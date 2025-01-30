/*
create a class game ,which allows a user to play "Guess the Number" game once
 Game should have the following :
 1. constructor to generate the random number
 2. takeUserInput() to take a user input of number
 3. isCorrectNumber() to detect whether the number entered by the user is true
 4. getter and setters for noOfGuesses()
 */


import java.util.Random;
import java.util.Scanner;

class Game1{
    private int counter=1;
    private int compNum;
    private int userNum;

    public Game1(){
        Random rc=new Random();
        compNum=rc.nextInt(0,100);
//        System.out.println(compNum);
    }
    public void setter(int n) {
        userNum=n;
    }

    public int isCorrect(){
        if (compNum==userNum){
            return 0;
        }
        else if (compNum>userNum){
            return 1;
        }
        else {
            return -1;
        }
    }
    public void setter(){
        counter++;
    }
    public void getter(){
        System.out.println("number of guesses requires are :"+counter);
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        setter(a);

    }
}

public class exe3 {
    public static void main(String[] args) {
        System.out.println("Welcome,Guesser's.");
        Scanner sc=new Scanner(System.in);
        Game1 g1=new Game1();
        System.out.println("enter the number :");
        while(true){

            int a=sc.nextInt();
            g1.setter(a);


            if (g1.isCorrect()==0){
                System.out.println("you won");
                g1.getter();
            } else if (g1.isCorrect()==1) {
                System.out.println("enter the greater number");
                g1.setter();
            }
            else {
                System.out.println("enter the smaller number");
                g1.setter();
            }


        }


    }
}
