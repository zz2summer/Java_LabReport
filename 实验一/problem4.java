import java.util.Scanner;

public class problem4{

	public static void main(String[] args) {

	System.out.println("The numbers between 100 and 200 which can be divisible by 5 or 6 "
			+ "\nand can't be dividible by them at the same time are : "); 

        int count=1;     //���������ƻ���
        for(int i = 100 ; i <= 200 ; i++)
       {
    	 if((i%5==0) ^ (i%6==0))  //ֻ�ܱ�5��6������������ͬʱ��5��6����
    	{
    		if(count%10==0)
    		     System.out.println(i);
    		else
    		     System.out.print(i + " ");

    			count++;
    	}
      }
      System.out.println();
   }

}