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
	
        public String getName(){//��ȡ����
		return name;
	}
	public void setName(String name){//�޸�����
		this.name=name;
	}
	public String getPhoneNumber(){//��ȡ�绰����
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber){//���õ绰����
		this.phoneNumber=phoneNumber;
	}
	public String toString(){
		return "Person�ࣺ����Ϊ"+getName()+"  "+"�绰Ϊ"+getPhoneNumber();
	}
}
