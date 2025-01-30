package shahid;

class shahid1 extends Thread{
        shahid1(String name){
        super(name);
        }
public void run(){

        for (int i=0;i<100;i++){
            System.out.println(getName());
            System.out.println(getName());

            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

                  }
        }
        }

public class thread_method {
    public static void main(String[] args) {
        shahid1 s=new shahid1("shahid");
        shahid1 s1=new shahid1("hello");


        s.start();

//        try{
//            s.join();  // only shahid will run ,once s object is over then s1 will run
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        s1.start();

    }
}
