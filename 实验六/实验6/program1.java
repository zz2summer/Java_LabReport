import java.util.*;
public class program1{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
  
    do{
        try{
           //提示输入两个整数
           System.out.println("请输入两个整数：");
	   String x = input.next();
           String y = input.next();

           //输出求和结果
           System.out.println(x + " + " + y + " = " + (Integer.valueOf(x)+Integer.valueOf(y)) );
           continueInput = false;
        }//try结束
        catch(NumberFormatException ex){
          System.out.print("输入错误(NumberFormatException)，");
          input.nextLine();
        }//catch结束
    }while(continueInput);

    }//main方法结束
}//program1结束