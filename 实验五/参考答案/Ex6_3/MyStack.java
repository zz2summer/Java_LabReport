package Ex6_3;

import java.util.ArrayList;
public class MyStack extends ArrayList<String> {
	public MyStack(){
		super();
	}
	public boolean isEmpty(){
		return super.isEmpty();
	}
	public int getSize(){
		return super.size();
	}
	public String peek(){
		return super.get(getSize()-1);
	}
	public String pop(){
		String s = super.get(getSize()-1);
		super.remove(getSize()-1);
		return s;
	}
	public void push(String s){
		super.add(s);
	}
	public int search(String s){
		return super.lastIndexOf(s);
	}
	public String toString(){
		return "stack: "+super.toString();
	}
	
}
