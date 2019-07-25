import java.io.*;
import java.util.*;

public class program2{
    public static void main(String[] args) throws Exception{
       //文件不存在则退出
       if(args.length!= 1){
            System.out.println("File " + args[0] + " does not exists");
            System.exit(1);
       }

       //文件存在
       File file = new File(args[0]);
       int numberOfCh = 0;
       int numberOfWords = 0;
       int numberOfLines = 0;

       try(
             Scanner input = new Scanner(file);
       ){
         while(input.hasNext()){
             //读取test中的一行
             String ch = input.nextLine();
             //将每一行中以空格分割成单词
             String[] words = ch.split(" ");
             //统计单词数
             numberOfWords += words.length;
             //统计字符数
             numberOfCh += ch.length();
             //统计行数
             numberOfLines++;
         }//while结束
       //输出文件中的字符数、单词数、行数
       System.out.println("File " + args[0] +" has\n" + numberOfCh + " characters\n"
                           + numberOfWords + " words\n" + numberOfLines + " lines");
       }
    }//main结束
}//class结束