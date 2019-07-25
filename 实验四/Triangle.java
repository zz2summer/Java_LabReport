    //����Triangle��
    public class Triangle extends GeometricObject{
         double side1, side2, side3;

         //�����޲ι��췽��        
         public Triangle(){
              side1 = 1.0;
              side2 = 1.0;
              side3 = 1.0;
         }
         //�����вι��췽��
         public Triangle(double side1, double side2, double side3){
               this.side1 = side1;
               this.side2 = side2;
               this.side3 = side3;
         }
   
         double getSide1(){
              return side1;
         }
         double getSide2(){
              return side1;
         }
         double getSide3(){
              return side1;
         }

         double getArea(){
                //ƽ���߳�s
                double s = ( side1 + side2 + side3 ) / 2.0;
                //�������
                return Math.sqrt( s * (s-side1) * (s-side2) * (s-side3) );
         }//getArea����
         
         double getPerimeter(){
              return side1+side2+side3;
         }
         
         public String toString(){
              return "side1: " + side1 + "\tside2: " + side2 + "\tside3: " + 
                     side3 + "\nperimeter: " + getPerimeter() + "\tarea: " + getArea()
                     + "\ncolor: " + getColor() + "\tfilled: " + isFilled();
         }
    }//Triangle��Ĵ�������