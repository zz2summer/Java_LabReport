import java.util.Scanner;

public class problem2{

   public static void main(String[] args){
   
   	System.out.print("Enter three points for a triangle : "); 
    Scanner input = new Scanner(System.in);
    //���������������
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();
    
    //�������߱߳����м���s
    double s1 = Math.sqrt( Math.pow(x1-x2 , 2) + Math.pow(y1-y2 , 2));
    double s2 = Math.sqrt( Math.pow(x1-x3 , 2) + Math.pow(y1-y3 , 2));
    double s3 = Math.sqrt( Math.pow(x2-x3 , 2) + Math.pow(y2-y3 , 2));
    double s = (s1 + s2 + s3 ) / 2.0;
    
    //�ж������Ƿ񹹳�������
    if((s1+s2>s3) && (s1+s3>s2) && (s2+s3>s1))
    {
    	//���������ε����
    	double area = Math.sqrt( s * (s-s1) * (s-s2) * (s-s3) );
        System.out.println("The area of the triangle is " + (int)area*1000/1000.0);
    }
    else
    	System.out.println("The three points can't make a triangle . ");

   }

}