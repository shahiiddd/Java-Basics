class myThread extends Thread{
    public myThread(String name){
        super(name);
    }
    public void run(){

        while(true){
            System.out.println("I am thread");
        }
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        myThread m=new myThread("Shahid");
        m.start();

    }
}
