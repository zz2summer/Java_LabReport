package Ex5_1;

public class Person {
	private String name;
	private String phoneNumber;

        public Person(){
            name = "default";
            phoneNumber = "88888888";
        }
        
        public Person(String name, String phoneNumber){
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
	
        public String getName(){//获取姓名
		return name;
	}
	public void setName(String name){//修改姓名
		this.name=name;
	}
	public String getPhoneNumber(){//获取电话号码
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber){//设置电话号码
		this.phoneNumber=phoneNumber;
	}
	public String toString(){
		return "Person类：姓名为"+getName()+"  "+"电话为"+getPhoneNumber();
	}
}
