public class Square extends GeometricObject 
      implements Colorable{
      private double sideLength;
      //�޲ι��췽��
      public Square(){
            sideLength=1.0;
      }
      //���ι��췽��
      public Square(double sideLength){
           this.sideLength = sideLength;
      }

      public void howToColor(){
          System.out.println("�����е������߳���ɫ");
      }

      public double getSideLength(){
          return sideLength;
      }

      public void setSideLength(double sideLength){
          this.sideLength = sideLength;
      }

}//class����