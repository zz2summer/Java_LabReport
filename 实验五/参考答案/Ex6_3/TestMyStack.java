package Ex6_3;
import java.util.Scanner;
public class TestMyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入五个字符串：");
		for(int i=0;i<5;i++){
			myStack.add(input.next());
		}
		System.out.println("刚才你输入的五个字符串以逆序的方式显示为：");
		while(myStack.getSize() > 0){
			System.out.print(myStack.pop()+" ");
		}
	}

}
