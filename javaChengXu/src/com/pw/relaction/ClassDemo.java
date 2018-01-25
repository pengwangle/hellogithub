package com.pw.relaction;

import java.util.Date;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：ClassDemo   
* 类描述：   获取反射类名
* 创建人：小王爷   
* 创建时间：2018年1月10日 下午7:11:25   
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
