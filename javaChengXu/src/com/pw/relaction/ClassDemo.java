package com.pw.relaction;

import java.util.Date;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�ClassDemo   
* ��������   ��ȡ��������
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��10�� ����7:11:25   
* @version        
*/
public class ClassDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1=Date.class;
		
		Class c2=Class.forName("java.util.Date");
		
		Date d=new Date();
		Class c3=d.getClass();
		
		System.out.println(c1==c2);
		System.out.println(c3==c2);
		System.out.println(c3==c1);
		System.out.println(c1+" c2 "+c2+" c3 "+c3);
		
	}

}
