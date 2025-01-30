package shahid2;

public final class Singleton {

    private static final Singleton s = new Singleton();

    private Singleton(){
        System.out.println("Singleton object created");
    }

    public static Singleton getInstance(){
        System.out.println("method of instance");
        return s;
    }
    public static Singleton getInstance1(){
        System.out.println("method of instance 1");
        return s;
    }

}
