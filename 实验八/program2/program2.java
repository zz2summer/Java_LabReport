import java.util.Scanner;

public class program2{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    //输入两个圆的半径
    System.out.print("请输入两个圆的半径：");
    double radius1 = input.nextDouble();
    double radius2 = input.nextDouble();

    //创建两个圆
    ComparableCircle circle1 = new ComparableCircle(radius1);
    ComparableCircle circle2 = new ComparableCircle(radius2);
    int compara = circle1.comparaTo(circle2);

    //比较两个圆的面积大小，输出结果
    if(compara > 0)
        System.out.println("circle1 > circle2");
    else if(compara == 0)
        System.out.println("circle1 = circle2");
    else
        System.out.println("circle1 < circle2");

    }    

}//class结束




