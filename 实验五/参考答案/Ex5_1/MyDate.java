package Ex5_1;

public class MyDate {
	private int year;
	private int month;
	private int day;

        public MyDate(){
		this.year = 2016;
		this.month = 5;
		this.day = 12;
	}

	public MyDate(int y,int m,int d){
		this.year = y;
		this.month = m;
		this.day = d;
	}
	public int getYear(){//��ȡ���
		return year;
	}
	
	public int getMonth(){//��ȡ�·�
		return month;
	}
	
	public int getDay(){//��ȡ����
		return day;
	}
	
	public String toString(){
		return year+"��"+month+"��"+day+"��";
	}
}
