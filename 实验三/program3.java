import java.util.Scanner;
public class program3{
       public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("�����뷽��ʽϵ�� a b c : ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            //��������ʽ
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            double m = quadraticEquation.getDiscriminant();
            System.out.println("Discriminant : " + m); 
            if(m>0)
                 System.out.println("Root1: " + quadraticEquation.getRoot1() +
                                     " Root2: " + quadraticEquation.getRoot2() );
            else if(m==0)
                 System.out.println("Root: " + quadraticEquation.getRoot1() );
            else
                 System.out.println("The equation has no roots");
            }//main��������
}

       //����QuadraticEquation��
       class QuadraticEquation{
             private double a, b, c;
             //�вι��캯��
             QuadraticEquation(double a, double b, double c){
                    this.a = a;
                    this.b = b;
                    this.c = c;
             }
             double getA(){
                    return a;
             }
             double getB(){
                    return b;
             }
             double getC(){
                    return c;
             }
             //���б�ʽ
             double getDiscriminant(){
                    return b*b-4*a*c;
             }
             //���һ����
             double getRoot1(){
                  double m = getDiscriminant();
                  if(m>=0){
                        double r1;
                        r1 = ( -b + Math.sqrt(m) ) / ( 2 * a );
                        return r1;
                  }
                  else
                        return 0;
             }
             //��ڶ�����
             double getRoot2(){
                  double n = getDiscriminant();
                  if(n>=0){
                        double r2;
                        r2 = ( -b - Math.sqrt(n) ) / ( 2 * a );
                        return r2;
                  }
                  else
                        return 0;
             }
       }//��QuadraticEquation����