class shahid1{
    private int id;
    private String name;

    public shahid1(int x,String p){
        id=x;
        name=p;
    }
    public shahid1(String p){   // over-loading is possible in constructor
        id=55;
        name=p;
    }

    public void setName(String n ){ //here set the value
        name=n;
    }
    public String getName(){ //here set the value
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

}

public class constructor {
    public static void main(String[] args) {
        shahid1 s1=new shahid1(88,"Damon");
        shahid1 s2=new shahid1("Dambar");
//        s1.id=55;
//        s1.name="Shahid";   this will throw error because id and name is private

//        s1.setId(45);
//        s1.setName("Shahid");
        System.out.println(s1.getId());
        System.out.println(s1.getName());

        System.out.println(s2.getId());
        System.out.println(s2.getName());
    }
}
