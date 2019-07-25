public class program2{
      public static void main(String[] args){
           Circle2D c1 = new Circle2D(2, 2, 5.5);
           System.out.println("c1(2, 2, 5.5)   area: " + c1.getArea() + "\tperimeter: " + c1.getPerimeter()
                               + "\nc1.contains(3,3): " + c1.contains(3,3) 
                               + "\nc1.contains(new Circle2D(4, 5, 10.5)): "  + c1.contains(new Circle2D(4, 5, 10.5))
                               + "\nc1.overlaps(new Circle2D(3, 5,  2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)) );
      }//main��������
}//program2����

      //����Circle2D��
      class Circle2D{
          double x, y, radius;
          final double PI = 3.14;

          //�޲ι��캯��
          Circle2D(){
               x = 0;
               y = 0;
               radius = 1.0;
          }
     
          //�вι��캯��
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
 
          //�������
          double getArea(){
                return PI * radius * radius;
          }

          //�����ܳ�
          double getPerimeter(){
                return PI * radius * 2;       
          }

          //�жϸ����㣨x��y���Ƿ���Բ��
          boolean contains(double x,double y){
                //���õ����Բ�ķ��̣���С�ڰ뾶��ƽ������Բ�ڣ���֮����
                return ( ((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)) < this.radius*this.radius ) ? true : false;
          }

          //�жϸ�����Բ�Ƿ���Բ��
          boolean contains(Circle2D circle){
               //�Ƚϸ���Բ�İ뾶���Ѷ��İ뾶��������Բ�İ뾶����϶������Ѷ�Բ�ڣ���֮�����ж�
               if(this.radius > circle.getRadius()){
                     double m = this.radius - circle.getRadius();  //�뾶��
                     double n = Math.sqrt((circle.getX()-this.x)*(circle.getX()-this.x)+(circle.getY()-this.y)*(circle.getY()-this.y));  //Բ�ľ�
                     //Բ�ľ������0-�뾶��֮�䣬�����Բ���Ѷ�Բ�ڣ���֮����
                     return (n>=0 && n<m) ? true : false;
               }
               else
                    return false;
          }
 
          //�ж�����Բ�Ƿ��ص�
          boolean overlaps(Circle2D circle){
               double n = Math.sqrt((circle.getX()-this.x)*(circle.getX()-this.x)+(circle.getY()-this.y)*(circle.getY()-this.y));  //Բ�ľ�
               double m = (this.radius > circle.getRadius()) ? this.radius-circle.getRadius() : circle.getRadius()-this.radius;  //�뾶��
               //���Բ�ľ��ڰ뾶����뾶��֮�䣬���ص�����֮���ص�
               return (n>m && n<(this.radius+circle.getRadius())) ? true : false;
          }
      }//Circle2D�����








