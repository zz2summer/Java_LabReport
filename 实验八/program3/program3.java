public class program3{
    public static void main(String[] args){
        //创建有五个GeometricObject对象的数组
        GeometricObject[] geometricObject = {new Circle(), new Square(),
                         new Rectangle(), new Square(), new Triangle()};
        //判断每个对象是否可着色，可以着色则调用howToColor方法
        for(int i=0; i<geometricObject.length; i++){
            if(geometricObject[i] instanceof Colorable){
                System.out.print("geometricObject " + (i+1) + " : ");
               ((Colorable)geometricObject[i]).howToColor();
            }
        }
    }//main结束
}//class结束

class Circle extends GeometricObject{
    private double radius;
 
    //无参构造方法
    public Circle(){

    }
}

class Triangle extends GeometricObject{
     private double side1, side2, side3;

     //无参构造方法
     public Triangle(){
         
     }
}

class Rectangle extends GeometricObject{
     private double width, height;

     //无参构造方法
     public Rectangle(){
         
     }
}