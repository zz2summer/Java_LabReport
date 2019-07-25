public class Square extends GeometricObject 
      implements Colorable{
      private double sideLength;
      //无参构造方法
      public Square(){
            sideLength=1.0;
      }
      //含参构造方法
      public Square(double sideLength){
           this.sideLength = sideLength;
      }

      public void howToColor(){
          System.out.println("给所有的四条边长着色");
      }

      public double getSideLength(){
          return sideLength;
      }

      public void setSideLength(double sideLength){
          this.sideLength = sideLength;
      }

}//class结束