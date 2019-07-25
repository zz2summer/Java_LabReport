package Ex5_1;


public class Student extends Person {
	//��������һ������
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	private int grade;//�꼶
        
        public Student(){
            grade = FRESHMAN;
        }
        
         public Student(int grade){
            this.grade = grade;
        }
        
        public Student(String name, String phone, int grade){
            super(name,phone);
            this.grade = grade;
        }
	
        public void setGrade(int grade){
	    this.grade = grade;
	}
	public String getGrade(){
		return grade;
	}
	public String toString(){
		return "Student�ࣺ"+ super.toString()+ "�꼶Ϊ��"+getGrade();
	}
	public void displayObject(){
		System.out.println("to "+getName()+": �밴ʱ��ʵ�鱨��");	
	}
}
