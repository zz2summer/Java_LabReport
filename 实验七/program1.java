import java.util.*;
public class program1{
     public static void main(String[] args){
     //��������
     Scanner input = new Scanner(System.in);
     System.out.println("����Ҫ�����£�"
                        + "\n1.�������������8���ַ���"
                        + "\n2.����ֻ�ܰ������ֺ���ĸ��"
                        + "\n3.�������������2�����֡�"
                        + "\n������һ�����룺");
     String password = input.nextLine();
     //�������ĺϷ���
     if(CheckPassword(password))
         System.out.println("Valid Password");
     else
         System.out.println("Invalid Password");

     }//main��������

    //�������Ϸ��Է���
    public static boolean CheckPassword(String password){
        int countNumber = 0;
        //��ÿ���ַ����ж�Ӧ����
        for(int i=0; i<password.length(); i++){
           //�ж��Ƿ�Ϊ��ĸ
           if(Character.isLetter(password.charAt(i)) )
                continue;
           //�ж��Ƿ�Ϊ����
           else if(Character.isDigit(password.charAt(i)) )
                countNumber++;
           else
                return false;
        }
       if(countNumber>=2 && password.length()>=8)
           return true;
       else
          return false;
   }//����CheckPassword���� 

}//class����