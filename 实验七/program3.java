import java.io.*;
import java.util.*;

public class program3{
   public static void main(String[] args) throws Exception{
        File file = new File("Exercise9_19.txt");
        if(file.exists()){
           System.out.println("File Exercise9_19.txt already exists");  
        }

        //����10������������ļ�
        PrintWriter output = new PrintWriter(file);
        for(int i=0; i<10; i++){
            if(i==9)
                 output.print( (int)(Math.random()*100) );
            else
                 output.print( (int)(Math.random()*100) + " ");
        }   
        output.close();
     
        //���ļ���ȡ���ݲ���������
        Scanner input = new Scanner(file);
        ArrayList<Integer> a = new ArrayList<>();
        while(input.hasNext()){
             int number = input.nextInt();
             a.add(number);
        }
        input.close();

        //����������������
        Collections.sort(a);
        for(int e: a)
             System.out.print(e + " ");
        System.out.println();
   }//main����
}//class����