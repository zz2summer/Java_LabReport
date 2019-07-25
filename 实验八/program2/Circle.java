public class Circle{
    public static final double PI = 3.14159;
    private double radius;

    public Circle(){
        radius=1.0;
    }

    public Circle(double radius){
         this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
       return PI*radius*2;
    }
}//class½áÊø