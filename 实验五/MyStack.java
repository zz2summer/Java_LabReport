import java.util.Scanner;   
public class MyStack extends java.util.ArrayList{
      public MyStack(){

      }

      //实现获取栈的最后一个元素
      public Object peek(){
           return this.get(this.size()-1);
      }
     
      //创建栈的实例并把栈的最后一个元素传给实例对象，然后删除这个元素
      public Object pop(){
          Object o = this.get(this.size()-1);
          this.remove(this.size() - 1);
          return o;
      }

     //将这个实例对象放入一个新的栈中
     public void push(Object o){
        this.add(o);
     }
     
     //测试程序
     @SuppressWarnings("unchecked")
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入5个字符串:  ");
        MyStack mystack = new MyStack();
        for(int i = 0; i < 5; i++) {
           String st = input.next();
           mystack.push(st);
        }

        System.out.println("逆序输出为: ");
        for(int i=0; i<5; i++)
            System.out.print(mystack.pop() + " ");

        System.out.println();
        }//main方法结束

}//MyStack类结束