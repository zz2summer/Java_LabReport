import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//数组1--大小及数据输入
		System.out.print("输入list1: ");
		int arraysize1 = input.nextInt();    //数组1大小
		int[] list1 = new int[arraysize1];
		for(int i=0; i<list1.length; i++)    //数组1数据输入
			list1[i] = input.nextInt();
		//数组2--大小及数据输入
		System.out.print("输入list2: ");
		int arraysize2 = input.nextInt();   //数组2大小
		int[] list2 = new int[arraysize2];
		for(int i=0; i<list2.length; i++)   //数组2数据输入
			list2[i] = input.nextInt();
		if(equal(list1, list2))             //调用函数判断两个数组是否相同
			System.out.println("这两个数列是相同的");
		else
			System.out.println("这两个数列是不同的");
	}
	
	public static boolean equal(int[] list1, int[] list2)
	{
                if(list1.length!=list2.length)      //数组长度不等，直接返回false
                {
                    return false;     
                 }
		else                                //数组长度相等，比较具体数据
                {
                    boolean compare = false;
		    for(int i=0; i<list1.length; i++)
		   {
			if(list1[i]==list2[i])       //数组数据相等，布尔变量为真
				compare = true;
			else                         //数组数据不相等，布尔变量为假，同时跳出循环判断
			{
				compare = false;   
                                break;
                        }
		    }
          	    return compare;
                 }
	}
}
