//�˲��������ڲ���Person�ࡢStudent�ࡢEmployee��
public class TestProgram1{
     public static void main(String[] args){
     //���������д���Person��Student��Employee�Ķ���ʵ����
     //�����Ǿ�����ΪPerson����󡣽����Ƿֱ���m1��m2��m3
           Person p1 = new Person("Annay", "15269358569");
           Person p2 = new Student("��һ", "Boens", "14985685962");
           Person p3 = new Employee("10��/��", new MyDate("2018", "1", "20") , "Concy", "18659856589");
           
           //������p1�ֱ��뷽��m1��m2��m3��
           m1(p1);
           m2(p1);
           m3(p1);

           //������p2�ֱ��뷽��m1��m2��m3��
           m1(p2);
           m2(p2);
           m3(p2);

           //������p3�ֱ��뷽��m1��m2��m3��
           m1(p3);
           m2(p3);
           m3(p3);
         
     }//mian��������

     //��ʾp������
     public static void m1(Person p){
           System.out.println( p.getName() );
     }//m1����

     //��ӡp��toString�������ص��ַ���
     public static void m2(Person p){
          System.out.println( p.toString() );
     }//m2����

     //���p��Student�����Employee���ʵ�����ֱ�������ǵ�displayObject()
     public static void m3(Person p){
           if(p instanceof Student)
                 ((Student)p).displayObject();
           else if(p instanceof Employee)
                 ((Employee)p).displayObject();
     }//m3����

}//TestClass����