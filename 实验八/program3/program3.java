public class program3{
    public static void main(String[] args){
        //���������GeometricObject���������
        GeometricObject[] geometricObject = {new Circle(), new Square(),
                         new Rectangle(), new Square(), new Triangle()};
        //�ж�ÿ�������Ƿ����ɫ��������ɫ�����howToColor����
        for(int i=0; i<geometricObject.length; i++){
            if(geometricObject[i] instanceof Colorable){
                System.out.print("geometricObject " + (i+1) + " : ");
               ((Colorable)geometricObject[i]).howToColor();
            }
        }
    }//main����
}//class����

class Circle extends GeometricObject{
    private double radius;
 
    //�޲ι��췽��
    public Circle(){

    }
}

class Triangle extends GeometricObject{
     private double side1, side2, side3;

     //�޲ι��췽��
     public Triangle(){
         
     }
}

class Rectangle extends GeometricObject{
     private double width, height;

     //�޲ι��췽��
     public Rectangle(){
         
     }
}