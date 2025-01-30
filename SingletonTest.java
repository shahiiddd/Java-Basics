package shahid2;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton firstSingleton;
        Singleton secondSingleton;

        firstSingleton = Singleton.getInstance();
        secondSingleton = Singleton.getInstance1();

        if (firstSingleton==secondSingleton){
            System.err.println("firstSingleton and secondSingleton"+"refer to the same Singleton object");
        }
    }
}
