package Ex5_1;


public class Student extends Person {
	//常量，大一到大四
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	private int grade;//年级
        
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
		return "Student类："+ super.toString()+ "年级为："+getGrade();
	}
	public void displayObject(){
		System.out.println("to "+getName()+": 请按时交实验报告");	
	}
}
