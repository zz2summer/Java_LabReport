import java.util.Scanner;   
public class MyStack extends java.util.ArrayList{
      public MyStack(){

      }

      //ʵ�ֻ�ȡջ�����һ��Ԫ��
      public Object peek(){
           return this.get(this.size()-1);
      }
     
      //����ջ��ʵ������ջ�����һ��Ԫ�ش���ʵ������Ȼ��ɾ�����Ԫ��
      public Object pop(){
          Object o = this.get(this.size()-1);
          this.remove(this.size() - 1);
          return o;
      }

     //�����ʵ���������һ���µ�ջ��
     public void push(Object o){
        this.add(o);
     }
     
     //���Գ���
     @SuppressWarnings("unchecked")
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("������5���ַ���:  ");
        MyStack mystack = new MyStack();
        for(int i = 0; i < 5; i++) {
           String st = input.next();
           mystack.push(st);
        }

        System.out.println("�������Ϊ: ");
        for(int i=0; i<5; i++)
            System.out.print(mystack.pop() + " ");

        System.out.println();
        }//main��������

}//MyStack�����