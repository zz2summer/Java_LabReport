import java.util.*;
public class program1{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
  
    do{
        try{
           //��ʾ������������
           System.out.println("����������������");
	   String x = input.next();
           String y = input.next();

           //�����ͽ��
           System.out.println(x + " + " + y + " = " + (Integer.valueOf(x)+Integer.valueOf(y)) );
           continueInput = false;
        }//try����
        catch(NumberFormatException ex){
          System.out.print("�������(NumberFormatException)��");
          input.nextLine();
        }//catch����
    }while(continueInput);

    }//main��������
}//program1����