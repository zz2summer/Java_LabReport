import java.util.Scanner;

public class program2 {

	    
	public static void main(String[] args) {
		final int ARRAYSIZE = 10;         //定义数组大小
	    double[] array = new double[ARRAYSIZE];
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please entere ten numbers :");
	    for(int i=0; i<ARRAYSIZE; i++)    //输入数组的各个元素
	    	array[i] = input.nextDouble();
	    int index = indexofSmallestElement(array);     //调用函数，返回数组最小值下标
	    
	    System.out.println("The index of the min number is : " + index);
	    
	}
	    
	    public static int indexofSmallestElement(double[] array){
	    	int indexOfMin = 0;      //最小数下标
	    	double min = array[0];   //数组中的最小数
	    	for(int i = 1; i<array.length; i++)
	    	{
	    		if(array[i]<min)
	    		{
	    			min = array[i];
	    			indexOfMin = i;
	    		}
	    	}
	    	return indexOfMin;
	    }
}