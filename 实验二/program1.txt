import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		System.out.print("输入1-100之间的整数（输入0结束）: ");
		
		final int ARRAYSIZE = 100;        //定义常量表数组大小
		
		Scanner input = new Scanner(System.in);
		int[] list = new int[ARRAYSIZE];     //存储输入数字的数组
		int number;              //number表1-100的数字
		int count = 0;           //count用于记录数组中每个数字出现的次数
		
		for(int i = 0; i<ARRAYSIZE; i++)
		{
			number = input.nextInt();
			if(number!=0)                //输入数字不为0程序继续
			{
                             if(number>=0 && number<=100)   //数字在1-100之间，存入数组
				 list[i] = number;			
			}
			else
				break;
		}
		
		for(int i = 0; i<ARRAYSIZE+1; i++)         //输出1-100中，数组出现的数字及其次数，此循环控制数字
		{
			number = i + 1; 
			for(int j = 0; j<ARRAYSIZE; j++)   //此循环表数组中出现过的数字并统计其次数
			{
				if(list[j]!=0)
				{
					if(list[j]==number)
						count++;    //该数字出现次数
				}
			}
			if(count!=0)                        //出现次数不为零，打印结果
				System.out.print(number + " 出现 " + count +"\n");
			count=0;
		}	
	}

}
