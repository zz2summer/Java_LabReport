import java.util.Scanner;

public class program2{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    //��������Բ�İ뾶
    System.out.print("����������Բ�İ뾶��");
    double radius1 = input.nextDouble();
    double radius2 = input.nextDouble();

    //��������Բ
    ComparableCircle circle1 = new ComparableCircle(radius1);
    ComparableCircle circle2 = new ComparableCircle(radius2);
    int compara = circle1.comparaTo(circle2);

    //�Ƚ�����Բ�������С��������
    if(compara > 0)
        System.out.println("circle1 > circle2");
    else if(compara == 0)
        System.out.println("circle1 = circle2");
    else
        System.out.println("circle1 < circle2");

    }    

}//class����




