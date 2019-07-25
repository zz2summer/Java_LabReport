public class ComparableCircle extends Circle
      implements Comparable<ComparableCircle> {

     public ComparableCircle(double radius){
        super(radius);
     }

     //实现comparaTo方法
     public int comparaTo(ComparableCircle o){
         if(getArea() > o.getArea())
              return 1;
         else if(getArea() == o.getArea())
              return 0;
         else
              return -1;
     }
   
}//calss结束