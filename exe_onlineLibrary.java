import java.lang.reflect.Array;

/*
You have to implement a library using Java Class Library
Methods    :issueBook,returnBook,showAvailableBooks,addBook
Properties : Array to store the available books ,
             Array to store the issue book
*/
class onlineLibrary{
    String[] books;
    int no_of_books;
    onlineLibrary(){
        this.books=new String[10];
        this.no_of_books=0;
    }
    // Add Book Method
     public void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
//         System.out.println(book+" book has been added");
    }

    // Available Book Method
    public void showAvailableBook(){
        System.out.println("Available books are :");
        for (String book:this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+book+"*");
        }
    }

    // Issue Book Method
    public void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("book issued");
                this.books[i]=null;
                return;
            }
            System.out.println(book);
        }
        System.out.println("book not available");
    }


    // Return Book Method
    public void returnBook(String book){
//        for (int i=0;i<this.books.length;i++){
//            if (this.books[i].equals(book)){
//                System.out.println("book returned");
//                this.books[i]=null;
//                return;
//            }
        System.out.println("book returned");
        addBook(book);
    }



}

public class exe_onlineLibrary {
    public static void main(String[] args) {
        onlineLibrary l=new onlineLibrary();
        l.addBook("Game of Throne");
        l.addBook("Twilight");
        l.addBook("Vampire Dairies");
//        l.addBook("Vincenzo");
//        l.addBook("Anne Frank");
//        l.addBook("Algorithm");
//        l.addBook("Think and Grow Rich");
        l.showAvailableBook();
        l.issueBook("Game of Throne");
        l.showAvailableBook();
        l.returnBook("Game of  throne");
        l.showAvailableBook();
    }








}
