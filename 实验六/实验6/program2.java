import java.util.*;
public class program2{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] array = new int[100];
    //��[0,100)֮�������ʼ������
    for(int i=0; i<100; i++)
          array[i] = (int)(Math.random() * 100);
    
    try{
         System.out.println("������������±꣺");
         int index = input.nextInt();
         System.out.println("array[" + index +"] : " + array[index]);
    }
    catch(IndexOutOfBoundsException ex){
        System.out.println("out of bounds");
    }

    }//main��������
}//program����