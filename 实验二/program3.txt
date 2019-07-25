import java.util.Scanner;

public class program3 {

	    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAYSIZE = 10;        //定义数组大小
		int[] array = new int[ARRAYSIZE];
		int number;
		int count=0;        //count表示实际数组不重复数字个数
		System.out.print("输入10个整数: ");
		array[0] = input.nextInt();
		for(int i = 1; i<array.length; i++)
		{
			number = input.nextInt();
			for(int j = 0; j<i; j++)    //判断输入的数字与前面数组中的数字是否相等
			{
				if(array[j]==number)
					break;
				else
				{
					if(j==(i-1))      //输入的数字与前面的数字不同
					{
						count++;  //数组下标加一
						array[count]=number;						
					}
				}
			}
		}
		
		System.out.print("互不相同的数为：");
		for(int i=0; i<=count; i++)
			System.out.print(array[i] + " ");
                System.out.println();
	}
}