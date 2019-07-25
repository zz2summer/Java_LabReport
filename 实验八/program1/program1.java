import java.util.Scanner;

public class program1 {
     public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
		
	while(continueInput){
	    //输入三角形的三条边
	    System.out.print("请输入三角形的三条边长：");
	    double side1 = input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3 = input.nextDouble();
	   //判断三条边是否构成三角形，能够成则继续，反之则重新输入
	   if((side1+side2>side3) && (side1+side3>side2) && (side2+side3>side1)){
		//输入三角形的颜色
		System.out.print("请输入三角形的颜色：");
		String color = input.next();
		//输入三角形是否填充
		System.out.print("请输入三角形是否被填充（true为1/false为0）：");
		int fill = input.nextInt();
				
		GeometricObject triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
                boolean filled;
                if(fill==0)
                    filled=false;
                else
                    filled=true;
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
				
		continueInput = false;
	   }
	   else
		System.out.println("输入有误，这三条边不能构成一个三角形。\n");
	}//while结束
     }//main方法结束
}//class结束
