class phone{
    public void callNumber(){
        System.out.println("Calling Calling");
    }
    public void pickCall(){
        System.out.println("Picking Calling");
    }
}
interface camera{
     void takeSnap();
     void takeVideo();
     default void recordVoice(){
         System.out.println("Recording video in 4k ");
    }
}

interface wifi{
     void connectToNetwork();
     private void connected(){  //we cannot use private class in another class
         System.out.println("connected to wifi....");
     }
     default void greet(){  //here in default method we can call private method and then call in main method
         connected();
     }
}

class smartPhone extends phone implements camera,wifi {
    public void takeSnap(){
        System.out.println("Take a snap");
    }
    public void takeVideo(){
        System.out.println("Video shooting started");
    }
    public void connectToNetwork(){
        System.out.println("Smartphone is connected to 5G network");
    }
}

public class multipleInterface {
    public static void main(String[] args) {
        smartPhone s=new smartPhone();
        s.connectToNetwork();
        s.takeSnap();
        s.takeVideo();
        s.callNumber();
        s.pickCall();
        s.recordVoice();
        s.greet();
//        s.connected(); //throes an error because "connected" is private method
    }
}
