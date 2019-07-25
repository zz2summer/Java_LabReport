import java.util.ArrayList;

public class Course {
  private String courseName;
  private ArrayList<String> students = new ArrayList<>();
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  //���ѧ��
  public void addStudent(String student) {
    students.add(student);
  }
  
  //���ѧ������
  public String[] getStudents() {
    int size = students.size();
    String[] st = new String[size];
    for(int i=0; i<students.size(); i++)
         st[i] = students.get(i);
    return st;
  }

  //���������С
  public int getNumberOfStudents() {
    return students.size();
  }  

  //���ؿγ�����
  public String getCourseName() {
    return courseName;
  }  
  
  //ɾ��ѧ��
  public void dropStudent(String student) {
    students.remove(student);
  }
}
