package com.pw.arr;

import java.util.Random;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�ArrayDeal   
* �������� 1. ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������Ȼ���������Ԫ�ص����ֵ��
��Сֵ��ƽ��ֵ����ֵ�������������
  
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��1�� ����9:09:34   
* @version        
*/
public class ArrayDeal {
	public static void main(String[] args) {
		playArry();
		
	}

	private static void playArry() {
		//��ʼ������
		int[] arr=initArr();
		//�������
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
