package Ex5_1;

public class TestPerson{
	//��ʾP������
	public static void m1(Person p){
		System.out.println(p.getName());
	}
	//����P��toString����
	public static void m2(Person p){
		System.out.println(p.toString());
	}
	//����displayObject����
	public static void m3(Person p){
		if(p instanceof Student)
			((Student) p).displayObject();
		if(p instanceof Employee)
			((Employee) p).displayObject();
	}
	public static void main(String[] args){
		//����Person���ʵ��a
		Person a=new Person("����","15012345678");
				
		//����Student���ʵ��b
		Person b=new Student("����","17012345678",Student.SENIOR);
				
		//����Employee��ʵ��c
		Person c=new Employee("����","13012345678",8700,new MyDate(2015,6,1));
				
		m1(a);
                m1(b);
                m1(c);
               
                m2(a);
                m2(b);
                m2(c);
 
                m3(a);
                m3(b);
                m3(c);
		
	}
}
