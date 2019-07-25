package Ex5_2;

public class Course {
	  private String courseName;
	  private java.util.ArrayList<String> students=new java.util.ArrayList<String>();

	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
	    students.add(student);
	  }
	  
	  public String[] getStudents() {
		  String[] stu=new String[100]; 
		  for(int i=0;i<students.size();i++){
			  stu[i]=students.get(i);
		  }
		  return stu;
	  }

	  public int getNumberOfStudents() {
	    return students.size();
	  }  

	  public String getCourseName() {
	    return courseName;
	  }  
	  
	  public void dropStudent(String student) {
	     students.remove(student);
	  }
	}

