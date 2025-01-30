package shahid;
class shahid extends Thread{
    shahid(String name){
        super(name);
    }
    public void run(){
        int i=30;
        while(true) {
            System.out.println(getName());
        }
        }
}
public class threadPriorities {
    public static void main(String[] args) {
        shahid s1 = new shahid("shahid");
        shahid s2=new shahid("aryan");
        shahid s3=new shahid("jaspreet");
        shahid s4=new shahid("shreyash");
        shahid s5=new shahid("important");
        s5.setPriority(Thread.MIN_PRIORITY);
        s5.setPriority(Thread.MAX_PRIORITY); //threads does not follow priority

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
    }
}
