package com.pw.demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�PrintStream1   
* ��������   �����
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��9�� ����9:01:22   
* @version        
*/
public class PrintStream1 {
	
	public static void main(String[] args) {
		PrintStream out=System.out;
		try {
			PrintStream ps=new PrintStream("./src/res/log.txt");
			System.setOut(ps);
			int age=10;
			System.out.println("���������"+age);
			String sex="��";
			System.out.println("����������Ǻǣ�"+sex);
			System.out.println("sdafdsagdsagdasgda");
			System.setOut(out);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
