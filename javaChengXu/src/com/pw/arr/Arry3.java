package com.pw.arr;

import java.util.Arrays;
import java.util.Random;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�Arry3   
* ��������   3. ����һ��int�͵�һά���飬����40��Ԫ�أ������洢ÿ��ѧԱ
* 			�ĳɼ���ѭ������40��0~100֮�����������������Ǵ洢��һά�����У�
*           Ȼ��ͳ�Ƴɼ�����ƽ���ֵ�ѧԱ�������������������
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��1�� ����9:57:16   
* @version        
*/
public class Arry3 {
	public static void main(String[] args) {
		playArry();
		
	}

	private static void playArry() {
		//��ʼ������
		int[] arr=initArr();
		//�������
		playArr(arr);
		//����40���ɼ����մӸߵ��͵�˳�����������
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
		System.out.println("С��ƽ���ֵ��ǣ�");
		for(int i=0;i<arr.length;i++){
			if(avg>arr[i]){
				n++;
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println("С��ƽ���ֵ������ǣ�"+n);
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
