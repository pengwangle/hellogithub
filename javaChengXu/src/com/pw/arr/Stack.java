package com.pw.arr;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�Stack   
* ��������   
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��19�� ����10:46:37   
* @version        
*/
public class Stack {
	Object[] data;
	int thesize;
	private static int DEFUAL_SIZE=10;
	public Stack() {
		this.thesize=0;
		//����һ������
		initArr(DEFUAL_SIZE);
	}
	//��ʼ������
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
		//����洢�����ݴ���Ĭ������ �ǾͿ�ʼ����
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
