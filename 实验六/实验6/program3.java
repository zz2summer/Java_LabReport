//��дһ�����׳�OutOfMemoryError�ĳ���
import java.util.*;
public class program3{
    public static void main(String[] args){
    long startTime = System.currentTimeMillis();
    try{
      ArrayList<Object> list = new ArrayList<>();
        while(true)
            list.add(new Object());
    }
    catch(OutOfMemoryError ex){
         System.out.println("Out of memory");
    }

    long endTime = System.currentTimeMillis();
    System.out.println("(������ʱ:" + (endTime - startTime) + "ms)");

    }//main����
}//program3����