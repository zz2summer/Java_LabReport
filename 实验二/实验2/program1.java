import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		System.out.print("����1-100֮�������������0������: ");
		
		final int ARRAYSIZE = 100;        //���峣���������С
		
		Scanner input = new Scanner(System.in);
		int[] list = new int[ARRAYSIZE];     //�洢�������ֵ�����
		int number;              //number��1-100������
		int count = 0;           //count���ڼ�¼������ÿ�����ֳ��ֵĴ���
		
		for(int i = 0; i<ARRAYSIZE; i++)
		{
			number = input.nextInt();
			if(number!=0)                //�������ֲ�Ϊ0�������
			{
                             if(number>=0 && number<=100)   //������1-100֮�䣬��������
				 list[i] = number;			
			}
			else
				break;
		}
		
		for(int i = 0; i<ARRAYSIZE+1; i++)         //���1-100�У�������ֵ����ּ����������ѭ����������
		{
			number = i + 1; 
			for(int j = 0; j<ARRAYSIZE; j++)   //��ѭ���������г��ֹ������ֲ�ͳ�������
			{
				if(list[j]!=0)
				{
					if(list[j]==number)
						count++;    //�����ֳ��ִ���
				}
			}
			if(count!=0)                        //���ִ�����Ϊ�㣬��ӡ���
				System.out.print(number + " ���� " + count +"\n");
			count=0;
		}	
	}

}
