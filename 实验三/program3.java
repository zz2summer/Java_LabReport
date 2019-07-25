import java.util.Scanner;
public class program3{
       public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("请输入方程式系数 a b c : ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            //创建方程式
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
            }//main函数结束
}

       //创建QuadraticEquation类
       class QuadraticEquation{
             private double a, b, c;
             //有参构造函数
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
             //求判别式
             double getDiscriminant(){
                    return b*b-4*a*c;
             }
             //求第一个根
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
             //求第二个根
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
       }//类QuadraticEquation结束