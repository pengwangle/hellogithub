package com.pw.arr;

import java.util.Random;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：ArrayDeal   
* 类描述： 1. 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，
最小值，平均值，和值，并输出出来。
  
* 创建人：小王爷   
* 创建时间：2018年1月1日 下午9:09:34   
* @version        
*/
public class ArrayDeal {
	public static void main(String[] args) {
		playArry();
		
	}

	private static void playArry() {
		//初始化数组
		int[] arr=initArr();
		//数组操作
		playArr(arr);
		
	}

	private static void playArr(int[] arr) {
		int max = arr[0],min=arr[0],sum = 0,avg;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("max=:"+max);
		System.out.println("min=:"+min);
		System.out.println("sum=:"+sum);
		System.out.println("avg=:"+avg);
		
	}

	private static  int[] initArr() {
		Random rand=new Random();
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int) (100*Math.random());
		}
		return arr;
	}

}
