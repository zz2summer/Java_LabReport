public class TestCourse {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    //����coures1,course2��ѧ������
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    //���course1������
    System.out.println("course1: " + course1.getCourseName());

    //���course1��ѧ������
    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());

    //���course1��ѧ������
    String[] st1 = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(st1[i] + ", ");
    
    System.out.println();
    System.out.println();

    System.out.println("After coures1 removes \"Peter Jones\" ");

    //ɾ��courese1�еġ�Peter Jones��
    course1.dropStudent("Peter Jones");

    //���ɾ����course1��ѧ������
    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());

    //���ɾ����course1��ѧ������
    String[] st3 = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(st3[i] + ", ");

    System.out.println();
    System.out.println();

    //���course2������
    System.out.println("course2: " + course2.getCourseName());

    //���course2��ѧ������    
    System.out.println("Number of students in course2: "
      + course2.getNumberOfStudents());

    //���course2��ѧ������
    String[] st2 = course2.getStudents();
    for (int i = 0; i < course2.getNumberOfStudents(); i++)
      System.out.print(st2[i] + ", ");

    System.out.println();
    System.out.println();
 
    System.out.println("After coures2 removes \"Steve Smith\" ");

    //ɾ��courese2�еġ�Steve Smith��
    course2.dropStudent("Steve Smith");

    //���ɾ����course2��ѧ������
    System.out.println("Number of students in course2: "
      + course2.getNumberOfStudents());

    //���ɾ����course2��ѧ������
    String[] st4 = course2.getStudents();
    for (int i = 0; i < course2.getNumberOfStudents(); i++)
      System.out.print(st4[i] + ", ");

    System.out.println();
  }
}
