public class ComparableCircle extends Circle
      implements Comparable<ComparableCircle> {

     public ComparableCircle(double radius){
        super(radius);
     }

     //ʵ��comparaTo����
     public int comparaTo(ComparableCircle o){
         if(getArea() > o.getArea())
              return 1;
         else if(getArea() == o.getArea())
              return 0;
         else
              return -1;
     }
   
}//calss����