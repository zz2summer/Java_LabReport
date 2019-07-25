import java.util.*;
public class program1{
     public static void main(String[] args){
     //输入密码
     Scanner input = new Scanner(System.in);
     System.out.println("密码要求如下："
                        + "\n1.密码必须至少有8个字符。"
                        + "\n2.密码只能包括数字和字母。"
                        + "\n3.密码必须至少有2个数字。"
                        + "\n请输入一个密码：");
     String password = input.nextLine();
     //检测密码的合法性
     if(CheckPassword(password))
         System.out.println("Valid Password");
     else
         System.out.println("Invalid Password");

     }//main函数结束

    //检测密码合法性方法
    public static boolean CheckPassword(String password){
        int countNumber = 0;
        //对每个字符进行对应处理
        for(int i=0; i<password.length(); i++){
           //判断是否为字母
           if(Character.isLetter(password.charAt(i)) )
                continue;
           //判断是否为数字
           else if(Character.isDigit(password.charAt(i)) )
                countNumber++;
           else
                return false;
        }
       if(countNumber>=2 && password.length()>=8)
           return true;
       else
          return false;
   }//方法CheckPassword结束 

}//class结束