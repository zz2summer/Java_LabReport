import java.util.Scanner;

public class problem1{

   public static void main(String[] args){
   
   System.out.print("Plese enter a number between 0 and 1000 : "); //��ʾ�û����뷶Χ������
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();

     if(number>=0 && number<1000)                //���������ڷ�Χ�ڼ������
     {
        int sum = number/100 + number%100/10 + number%10;
	    System.out.println("The sum of the digits is " + sum);     
     }
     else                                       //�������ݳ�����Χ
		 System.out.println("The number is out of scope ."); 

   }

}