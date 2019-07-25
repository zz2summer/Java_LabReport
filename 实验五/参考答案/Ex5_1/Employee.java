package Ex5_1;


public class Employee extends Person {
	private double salary;
	private MyDate myDate;

        public Employee(){
             salary = 1000;
             myDate = new MyDate();
           
        }

        public Employee(double salary, MyDate myDate){
             this.salary = salary;
             this.myDate = myDate;
           
        }

        public Employee(String name, String phone,double salary, MyDate myDate){
             super(name,phone);
             this.salary = salary;
             this.myDate = myDate;
           
        }

	public double getSalary(){//获取工资
		return salary;
	}
	public void setSalary(double salary){//设置工资
		this.salary=salary;
	}
	public MyDate getMyDate(){
		return myDate;
	}
	
	
	public String toString(){
		return "Employee类："+ super.toString()+
				"  工资为"+getSalary()+"元/月"+
				"  受聘日期为"+myDate.toString();
	}
	public void displayObject(){
		System.out.println("to"+getName()+":请按时上班");	
	}
}
