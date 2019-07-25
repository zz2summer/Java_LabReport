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

	public double getSalary(){//��ȡ����
		return salary;
	}
	public void setSalary(double salary){//���ù���
		this.salary=salary;
	}
	public MyDate getMyDate(){
		return myDate;
	}
	
	
	public String toString(){
		return "Employee�ࣺ"+ super.toString()+
				"  ����Ϊ"+getSalary()+"Ԫ/��"+
				"  ��Ƹ����Ϊ"+myDate.toString();
	}
	public void displayObject(){
		System.out.println("to"+getName()+":�밴ʱ�ϰ�");	
	}
}
