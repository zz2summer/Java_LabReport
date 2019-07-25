import java.io.*;
import java.util.*;

public class program2{
    public static void main(String[] args) throws Exception{
       //�ļ����������˳�
       if(args.length!= 1){
            System.out.println("File " + args[0] + " does not exists");
            System.exit(1);
       }

       //�ļ�����
       File file = new File(args[0]);
       int numberOfCh = 0;
       int numberOfWords = 0;
       int numberOfLines = 0;

       try(
             Scanner input = new Scanner(file);
       ){
         while(input.hasNext()){
             //��ȡtest�е�һ��
             String ch = input.nextLine();
             //��ÿһ�����Կո�ָ�ɵ���
             String[] words = ch.split(" ");
             //ͳ�Ƶ�����
             numberOfWords += words.length;
             //ͳ���ַ���
             numberOfCh += ch.length();
             //ͳ������
             numberOfLines++;
         }//while����
       //����ļ��е��ַ�����������������
       System.out.println("File " + args[0] +" has\n" + numberOfCh + " characters\n"
                           + numberOfWords + " words\n" + numberOfLines + " lines");
       }
    }//main����
}//class����