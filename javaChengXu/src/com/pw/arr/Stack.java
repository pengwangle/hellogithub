package com.pw.arr;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：Stack   
* 类描述：   
* 创建人：小王爷   
* 创建时间：2018年1月19日 上午10:46:37   
* @version        
*/
public class Stack {
	Object[] data;
	int thesize;
	private static int DEFUAL_SIZE=10;
	public Stack() {
		this.thesize=0;
		//构造一个数组
		initArr(DEFUAL_SIZE);
	}
	//初始化数组
	private void initArr(int defualt_size) {
		if(defualt_size<thesize){
			return;
		}
		Object[] oldArr=data;
		data=new Object[defualt_size];
		for (int i = 0; i < size(); i++) {
			data[i]=oldArr[i];
		}
	}
	public void push(Object val){
		//如果存储的数据大于默认数据 那就开始扩容
		if(data.length==size()){
			System.out.println(data.length+"********");
			initArr(size()*2);
		}
		data[thesize++]=val;
	}
	public Object pop() {
		if(isEmpty()){
			return null;
		}
		Object val=data[thesize-1];
		data[thesize--]=null;
	return val;	
	}
	
	/**
	 * @return
	 */
	private boolean isEmpty() {
		
		return thesize==0;
	}
	private int size() {
		
		return thesize;
	}
	
	
	
	

}
