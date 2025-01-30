class MyThread extends Thread{
    public void run(){

            System.out.println("Running Thread 1");

    }
}

class MyThread2 extends Thread{
    public void run(){

        System.out.println("Running Thread 2");

    }
}

public class multiThreading {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();

        t1.start();
        t2.start();

/*        System.out.println(t1.getName());
        System.out.println(t1.threadId());
        System.out.println(t1.isAlive());
*/
    }
}
