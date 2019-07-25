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
	public int getYear(){//获取年份
		return year;
	}
	
	public int getMonth(){//获取月份
		return month;
	}
	
	public int getDay(){//获取天数
		return day;
	}
	
	public String toString(){
		return year+"年"+month+"月"+day+"日";
	}
}
