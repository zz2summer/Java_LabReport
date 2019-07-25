public class TestCourse {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    //输入coures1,course2的学生名字
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    //输出course1的名称
    System.out.println("course1: " + course1.getCourseName());

    //输出course1的学生数量
    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());

    //输出course1的学生名字
    String[] st1 = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(st1[i] + ", ");
    
    System.out.println();
    System.out.println();

    System.out.println("After coures1 removes \"Peter Jones\" ");

    //删除courese1中的“Peter Jones”
    course1.dropStudent("Peter Jones");

    //输出删除后course1的学生数量
    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());

    //输出删除后course1的学生名字
    String[] st3 = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(st3[i] + ", ");

    System.out.println();
    System.out.println();

    //输出course2的名称
    System.out.println("course2: " + course2.getCourseName());

    //输出course2的学生数量    
    System.out.println("Number of students in course2: "
      + course2.getNumberOfStudents());

    //输出course2的学生名字
    String[] st2 = course2.getStudents();
    for (int i = 0; i < course2.getNumberOfStudents(); i++)
      System.out.print(st2[i] + ", ");

    System.out.println();
    System.out.println();
 
    System.out.println("After coures2 removes \"Steve Smith\" ");

    //删除courese2中的“Steve Smith”
    course2.dropStudent("Steve Smith");

    //输出删除后course2的学生数量
    System.out.println("Number of students in course2: "
      + course2.getNumberOfStudents());

    //输出删除后course2的学生名字
    String[] st4 = course2.getStudents();
    for (int i = 0; i < course2.getNumberOfStudents(); i++)
      System.out.print(st4[i] + ", ");

    System.out.println();
  }
}
