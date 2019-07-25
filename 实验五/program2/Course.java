import java.util.ArrayList;

public class Course {
  private String courseName;
  private ArrayList<String> students = new ArrayList<>();
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  //添加学生
  public void addStudent(String student) {
    students.add(student);
  }
  
  //输出学生姓名
  public String[] getStudents() {
    int size = students.size();
    String[] st = new String[size];
    for(int i=0; i<students.size(); i++)
         st[i] = students.get(i);
    return st;
  }

  //返回数组大小
  public int getNumberOfStudents() {
    return students.size();
  }  

  //返回课程名称
  public String getCourseName() {
    return courseName;
  }  
  
  //删除学生
  public void dropStudent(String student) {
    students.remove(student);
  }
}
