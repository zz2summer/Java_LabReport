import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("4 ��ָvisa��\n" + "5 ��ָmaster��\n" + "37��ָAmerican Express��\n" + 
				"6 ��ָDiscovery��\n" + "���������ÿ���(13-16λ��):");
		long cardNumber = input.nextLong();
		if(isValid(cardNumber))
			System.out.println("���� " + cardNumber +" �ǺϷ���");
		else
			System.out.println("���� " + cardNumber + " �ǲ��Ϸ���");
	}
	
	/*Return true if the card number is valid*/
	public static boolean isValid(long number)
	{
		boolean valid = false;
    	if(number<1E13 || number>=1E17)
    		return valid;
    	else
    	{
    		if(prefixMatched(number, 37) || prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6))
    		{  			
    			if( (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number) ) % 10 == 0 )
        			valid = true;
        		else
        			valid = false;
    		}
    	}   	
    	return valid;
	}

	/*Get the result from step 2*/
	public static int sumOfDoubleEvenPlace(long number)
	{
		int sumOfEven = 0;
		int digit;
		for(int i = 2; i<=getSize(number); i += 2 )  //i��ʾ���ұߵڶ�λ��ʼ����
		{
			digit = (int)getPrefix(number, i);
			sumOfEven += getDigit(digit); 
		}	
		return sumOfEven;
	}

	/*Return this number if it is a single digit, otherwise return the sum of the two digits*/
	public static int getDigit(int number)
	{
		int temp = number * 2;
		if( temp > 9 )
			number = temp/10 + temp%10;
		else
			number = temp;
		return number;
	}

	/*Return sum of odd place digits in number*/
	public static int sumOfOddPlace(long number)
	{
		int sumOfOdd = 0;
		for(int i = 1; i<=getSize(number); i += 2 )  //i��ʾ���ұߵ�һλ��ʼ����
			sumOfOdd += (int)getPrefix(number, i);
		return sumOfOdd;		
	}

	/*Return true if the digit d is a prefix for number*/
	public static boolean prefixMatched(long number, int d) //d��ʾ��׼ǰ׺
	{
	   	boolean prefixMatched = false;
	   	int prefix = (int)(number / (Math.pow((int)10, (int)( getSize(number)-getSize(d) ))));		   	    		
		if(d==prefix) 
		    prefixMatched = true;	   		
	    return prefixMatched;
	}

	/*Return the number of digits in d*/
	public static int getSize(long d)
	{
		int a = 1;
    	long sh = 10;   //����number��������һλһλ���ƶ�			
   	    while(d/sh!=0)  //�ж�number�Ƿ񵽴�����߽���
   	    {
   	    	a++;
	    	sh *= 10;   	    	
   	    }
   	    return a;
	}

	/*Return the first k number of digits from number. If the number of digits in number is less than k, return number*/
	public static long getPrefix(long number, int k)    
	{
		long prefix;
		if(k<=getSize(number))
			prefix = (int)( ( number % (Math.pow((int)10, (int)k)) ) / ( Math.pow((int)10, (int)k-1) ));
		else
			prefix = number;
		return prefix;
	}

}
