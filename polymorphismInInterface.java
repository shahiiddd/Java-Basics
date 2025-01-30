class phone1{
    public void callNumber(){
        System.out.println("Calling Calling");
    }
    public void pickCall(){
        System.out.println("Picking Calling");
    }
}
interface camera1{
    void takeSnap();
    void takeVideo();
    default void recordVoice(){
        System.out.println("Recording video in 4k ");
    }
}

interface wifi1{
    void connectToNetwork();
    private void connected(){  //we cannot use private class in another class
        System.out.println("connected to wifi....");
    }
    default void greet(){  //here in default method we can call private method and then call in main method
        connected();
    }
}

class smartPhone1 extends phone implements camera1,wifi1 {
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

public class polymorphismInInterface {
    public static void main(String[] args) {
        smartPhone1 s=new smartPhone1();
       camera1 c=new smartPhone1();  //here we are using as camera only
        wifi1 w=new smartPhone1();
       c.takeVideo();
       c.takeSnap();
       c.recordVoice();
//       c.connectToNetwork(); // will show error because c is reference for camera and only camera methods will implement here
    }
}