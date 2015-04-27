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
