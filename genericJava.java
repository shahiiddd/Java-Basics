import java.util.ArrayList;

class myGeneric<T,t1>{
    t1 val;
    private T t1;
    myGeneric(t1 val,T t1){
        this.val=val;
        this.t1=t1;
    }

    public t1 getVal() {
        return val;
    }

    public void setVal(t1 val) {
        this.val = val;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }
}

public class genericJava {
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList=new ArrayList();
//        arrayList.add("shahid");
        arrayList.add(55);
        arrayList.add(65);
        arrayList.add(12);

        int a =(int) (arrayList.get(0));
//        System.out.println(a);

        myGeneric<String,Integer> m=new myGeneric("shahid",45);
        System.out.println(m.getT1());
        System.out.println(m.getVal());
    }
}

