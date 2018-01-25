package com.pw.arr;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：Arr4   
* 类描述：   定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；这5门课
   按存储顺序依次为：core C++，coreJava，Servlet，JSP和EJB。
   （1）循环给二维数组的每一个元素赋0~100之间的随机整数。
   （2）按照列表的方式输出这些学员的每门课程的成绩。
   （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。

* 创建人：小王爷   
* 创建时间：2018年1月2日 下午9:41:29   
* @version        
*/
public class Arr4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		playArr();
		
		
	}

	private static void playArr() {
		//初始化数组
		int[][] arr= initArr();
		int[] sumarr=sumArr(arr);
		for (int i = 0; i < sumarr.length; i++) {
			System.out.print(sumarr[i]+"*");
		}
		
	}

	private static int[] sumArr(int[][] arr) {
		int[] suna=new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < 5; j++) {
				sum+=arr[i][j];
			}
			suna[i]=sum;
		}
		return suna;
	}

	private static int[][] initArr() {
		int[][] arr=new int[20][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j]=(int) (Math.random()*100);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return arr;
	}

}
