import org.w3c.dom.ls.LSOutput;

interface bicycle{
    int a=1; // all values in interfaces are final
    void speedup(int increment);
    void applyBrake(int decrement);
}
interface horn{
    void blowHorn(int sound);

}
class avon implements bicycle, horn{
    public void speedup(int decrement){    // interface method must be public
        System.out.println("speedy");
    }
    public void applyBrake(int decrement){
        System.out.println("apply brake");
    }
    public void blowHorn(int sound){
        System.out.println("pop");
    }
}
// imp : cannot modify properties in interfaces
public class interfaces {
    public static void main(String[] args) {
        avon a=new avon();

        a.applyBrake(1);
        a.speedup(1);
        a.blowHorn(1);
        }
    }
