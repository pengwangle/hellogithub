package com.pw.demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：PrintStream1   
* 类描述：   输出流
* 创建人：小王爷   
* 创建时间：2018年1月9日 下午9:01:22   
* @version        
*/
public class PrintStream1 {
	
	public static void main(String[] args) {
		PrintStream out=System.out;
		try {
			PrintStream ps=new PrintStream("./src/res/log.txt");
			System.setOut(ps);
			int age=10;
			System.out.println("定义出变量"+age);
			String sex="男";
			System.out.println("定义初变量呵呵！"+sex);
			System.out.println("sdafdsagdsagdasgda");
			System.setOut(out);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
