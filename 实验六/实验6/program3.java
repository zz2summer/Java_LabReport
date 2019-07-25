//编写一个能抛出OutOfMemoryError的程序
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
    System.out.println("(测试用时:" + (endTime - startTime) + "ms)");

    }//main结束
}//program3结束