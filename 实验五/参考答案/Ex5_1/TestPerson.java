package Ex5_1;

public class TestPerson{
	//显示P的姓名
	public static void m1(Person p){
		System.out.println(p.getName());
	}
	//调用P的toString方法
	public static void m2(Person p){
		System.out.println(p.toString());
	}
	//调用displayObject方法
	public static void m3(Person p){
		if(p instanceof Student)
			((Student) p).displayObject();
		if(p instanceof Employee)
			((Employee) p).displayObject();
	}
	public static void main(String[] args){
		//创建Person类的实例a
		Person a=new Person("张三","15012345678");
				
		//创建Student类的实例b
		Person b=new Student("李四","17012345678",Student.SENIOR);
				
		//创建Employee的实例c
		Person c=new Employee("王五","13012345678",8700,new MyDate(2015,6,1));
				
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
