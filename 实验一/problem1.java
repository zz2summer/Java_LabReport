import java.util.Scanner;

public class problem1{

   public static void main(String[] args){
   
   System.out.print("Plese enter a number between 0 and 1000 : "); //提示用户输入范围内数据
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();

     if(number>=0 && number<1000)                //输入数据在范围内计算求和
     {
        int sum = number/100 + number%100/10 + number%10;
	    System.out.println("The sum of the digits is " + sum);     
     }
     else                                       //输入数据超出范围
		 System.out.println("The number is out of scope ."); 

   }

}