package shahid;

class Circle{
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public double circleRadius(){
        return radius;
    }
}

class Square{
    private int side;
    Square(int side){
        this.side=side;
    }
    public double squareSide(){
        return side;
    }
}

class Cube{
    private int side;
    Cube(int side){
        this.side=side;
    }
    public double cubeSide(){
        return side ;
    }
}

class AreaCalculator{
    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.circleRadius(), 2);
    }

    public double calculateArea(Square square) {
        return Math.pow(square.squareSide(), 2);
    }

    public double calculateArea(Cube cube) {
        return 6 * Math.pow(cube.cubeSide(), 2);
    }
}



public class que2 {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Square square=new Square(5);
        Cube cube=new Cube(5);

        AreaCalculator area=new AreaCalculator();
        System.out.println(area.calculateArea(circle));
        System.out.println(area.calculateArea(square));
        System.out.println(area.calculateArea(cube));


    }
}