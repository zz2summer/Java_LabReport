//此测试类用于测试Person类、Student类、Employee类
public class TestProgram1{
     public static void main(String[] args){
     //在主函数中创建Person、Student、Employee的对象实例，
     //将它们均声明为Person类对象。将它们分别传入m1、m2和m3
           Person p1 = new Person("Annay", "15269358569");
           Person p2 = new Student("大一", "Boens", "14985685962");
           Person p3 = new Employee("10万/月", new MyDate("2018", "1", "20") , "Concy", "18659856589");
           
           //将对象p1分别传入方法m1、m2、m3中
           m1(p1);
           m2(p1);
           m3(p1);

           //将对象p2分别传入方法m1、m2、m3中
           m1(p2);
           m2(p2);
           m3(p2);

           //将对象p3分别传入方法m1、m2、m3中
           m1(p3);
           m2(p3);
           m3(p3);
         
     }//mian方法结束

     //显示p的姓名
     public static void m1(Person p){
           System.out.println( p.getName() );
     }//m1结束

     //打印p的toString方法返回的字符串
     public static void m2(Person p){
          System.out.println( p.toString() );
     }//m2结束

     //如果p是Student类或者Employee类的实例，分别调用它们的displayObject()
     public static void m3(Person p){
           if(p instanceof Student)
                 ((Student)p).displayObject();
           else if(p instanceof Employee)
                 ((Employee)p).displayObject();
     }//m3结束

}//TestClass结束