import java.util.Scanner;

public class program3 {

	    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAYSIZE = 10;        //���������С
		int[] array = new int[ARRAYSIZE];
		int number;
		int count=0;        //count��ʾʵ�����鲻�ظ����ָ���
		System.out.print("����10������: ");
		array[0] = input.nextInt();
		for(int i = 1; i<array.length; i++)
		{
			number = input.nextInt();
			for(int j = 0; j<i; j++)    //�ж������������ǰ�������е������Ƿ����
			{
				if(array[j]==number)
					break;
				else
				{
					if(j==(i-1))      //�����������ǰ������ֲ�ͬ
					{
						count++;  //�����±��һ
						array[count]=number;						
					}
				}
			}
		}
		
		System.out.print("������ͬ����Ϊ��");
		for(int i=0; i<=count; i++)
			System.out.print(array[i] + " ");
                System.out.println();
	}
}