class employee{  //only one public class is
    int id;
    String name;
    int salary;
    public void detail(){
        System.out.println("id is :"+id);
        System.out.println("name is :"+name);
    }

    public void getSalary(){
        System.out.println("the salary is :"+salary);
    }
}
public class lecture1_customClass {
    public static void main(String[] args) {
    employee obj1=new employee(); //instantiating class
    employee obj2=new employee(); //instantiating class

//object 1
    obj1.id=1564;
    obj1.name="Shahid";
    obj1.salary=1000000;

        obj1.detail();
        obj1.getSalary();

//object 2
    obj2.id=4645;
    obj2.name="Sheikh";
    obj2.salary=40000;

        obj2.detail();
        obj2.getSalary();
    //        System.out.println(obj1.id);
//        System.out.println(obj1.name);


    }
}
