package com.pw.arr;

import java.util.Arrays;
import java.util.Random;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：Arry3   
* 类描述：   3. 定义一个int型的一维数组，包含40个元素，用来存储每个学员
* 			的成绩，循环产生40个0~100之间的随机整数，将它们存储到一维数组中，
*           然后统计成绩低于平均分的学员的人数，并输出出来。
* 创建人：小王爷   
* 创建时间：2018年1月1日 下午9:57:16   
* @version        
*/
public class Arry3 {
	public static void main(String[] args) {
		playArry();
		
	}

	private static void playArry() {
		//初始化数组
		int[] arr=initArr();
		//数组操作
		playArr(arr);
		//将这40个成绩按照从高到低的顺序输出出来。
		sortArr(arr);
		
	}
	
	private static void sortArr(int[] arr) {
		
		 Arrays.sort(arr);
		 System.out.println("sort:");
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		 System.out.println();
		 for (int i = arr.length-1; i >=0 ; i--) {
				System.out.print(arr[i]+" ");
			}
		
	}

	private static void playArr(int[] arr) {
		int avg ,sum=0,n=0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("小于平均分的是：");
		for(int i=0;i<arr.length;i++){
			if(avg>arr[i]){
				n++;
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println("小于平均分的人数是："+n);
	}

	private static  int[] initArr() {
		Random rand=new Random();
		int[] arr=new int[40];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int) (100*Math.random());
		}
		return arr;
	}
}
