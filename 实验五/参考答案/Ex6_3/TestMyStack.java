package Ex6_3;
import java.util.Scanner;
public class TestMyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		Scanner input=new Scanner(System.in);
		System.out.println("����������ַ�����");
		for(int i=0;i<5;i++){
			myStack.add(input.next());
		}
		System.out.println("�ղ������������ַ���������ķ�ʽ��ʾΪ��");
		while(myStack.getSize() > 0){
			System.out.print(myStack.pop()+" ");
		}
	}

}
