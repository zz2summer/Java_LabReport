import java.util.Scanner;

public class program1 {
     public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	boolean continueInput = true;
		
	while(continueInput){
	    //���������ε�������
	    System.out.print("�����������ε������߳���");
	    double side1 = input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3 = input.nextDouble();
	   //�ж��������Ƿ񹹳������Σ��ܹ������������֮����������
	   if((side1+side2>side3) && (side1+side3>side2) && (side2+side3>side1)){
		//���������ε���ɫ
		System.out.print("�����������ε���ɫ��");
		String color = input.next();
		//�����������Ƿ����
		System.out.print("�������������Ƿ���䣨trueΪ1/falseΪ0����");
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
		System.out.println("���������������߲��ܹ���һ�������Ρ�\n");
	}//while����
     }//main��������
}//class����
