public class program2{
      public static void main(String[] args){
           Circle2D c1 = new Circle2D(2, 2, 5.5);
           System.out.println("c1(2, 2, 5.5)   area: " + c1.getArea() + "\tperimeter: " + c1.getPerimeter()
                               + "\nc1.contains(3,3): " + c1.contains(3,3) 
                               + "\nc1.contains(new Circle2D(4, 5, 10.5)): "  + c1.contains(new Circle2D(4, 5, 10.5))
                               + "\nc1.overlaps(new Circle2D(3, 5,  2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)) );
      }//main函数结束
}//program2结束

      //创建Circle2D类
      class Circle2D{
          double x, y, radius;
          final double PI = 3.14;

          //无参构造函数
          Circle2D(){
               x = 0;
               y = 0;
               radius = 1.0;
          }
     
          //有参构造函数
          Circle2D(double x, double y, double radius){
               this.x = x;
               this.y = y;
               this.radius = radius;
          }

          double getX(){
               return x;
          }

          double getY(){
                return y;
          }

          double getRadius(){
                return radius;
          }
 
          //计算面积
          double getArea(){
                return PI * radius * radius;
          }

          //计算周长
          double getPerimeter(){
                return PI * radius * 2;       
          }

          //判断给定点（x，y）是否在圆内
          boolean contains(double x,double y){
                //将该点代入圆的方程，若小于半径的平方则在圆内，反之则不在
                return ( ((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)) < this.radius*this.radius ) ? true : false;
          }

          //判断给定的圆是否在圆内
          boolean contains(Circle2D circle){
               //比较给定圆的半径与已定的半径，若给定圆的半径大则肯定不在已定圆内，反之继续判断
               if(this.radius > circle.getRadius()){
                     double m = this.radius - circle.getRadius();  //半径差
                     double n = Math.sqrt((circle.getX()-this.x)*(circle.getX()-this.x)+(circle.getY()-this.y)*(circle.getY()-this.y));  //圆心距
                     //圆心距如果在0-半径差之间，则给定圆在已定圆内，反之不在
                     return (n>=0 && n<m) ? true : false;
               }
               else
                    return false;
          }
 
          //判断两个圆是否重叠
          boolean overlaps(Circle2D circle){
               double n = Math.sqrt((circle.getX()-this.x)*(circle.getX()-this.x)+(circle.getY()-this.y)*(circle.getY()-this.y));  //圆心距
               double m = (this.radius > circle.getRadius()) ? this.radius-circle.getRadius() : circle.getRadius()-this.radius;  //半径差
               //如果圆心距在半径差与半径和之间，则重叠，反之不重叠
               return (n>m && n<(this.radius+circle.getRadius())) ? true : false;
          }
      }//Circle2D类结束








