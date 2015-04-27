/**
 * Name:陳信邦
 * ID: U10316009
 * Ex: 15.10
 */

import java.util.ArrayList;

public class Test{
	public static void main(String[] args){
		MyStack MS1 = new MyStack();
		
		MS1.push("0");
		MS1.push("00");
		MS1.push("000");

		MyStack MS2 = (MyStack)MS1.clone();

		MS2.push("1");
		MS2.push("11");
		MS2.push("111");

		System.out.println(MS1.getSize());
		System.out.println(MS2.getSize());
		
	}
}

class MyStack implements Cloneable{
	private ArrayList<Object> list = new ArrayList<Object>();
	//判斷陣列是不是空的
	public boolean isEmpty(){
		return list.isEmpty();
	}
	//判斷陣列是不是空的
	public int getSize(){
		return list.size();
	}
	//回傳堆疊最上面的值
	public Object peek(){
		return list.get(getSize()-1);
	}
	//取出然後刪除
	public Object pop(){
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	public void push(Object o){
		list.add( o );
	}
	
	@Override
	public String toString(){
		return "stack:" + list.toString();
	}

	public Object clone(){
		try{
			//ahallow copy
			MyStack MyStack1 = (MyStack)super.clone();
			//Deep copy
			MyStack1.list = (ArrayList<Object>)list.clone();
			return MyStack1;
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
	}
}
