package shahid;

class myCons extends Thread{
   public myCons(String name){
       super(name);
//       System.out.println(name);
   }
   public void run(){
//       for (int i=1;i<10;i++){
//           System.out.println("i am shahid");
//       }
   }
}
//ThreadGroup
public class construtor {
    public static void main(String[] args) {
        myCons m=new myCons("shahid");
        myCons m1=new myCons("shaddy");
        m.start();
        System.out.println(m.getId());
        System.out.println(m.getName());

        m1.start();
        System.out.println(m1.getId());
        System.out.println(m1.getName());
    }
}