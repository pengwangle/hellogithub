package com.pw.sort;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�BubbleSort   
* ��������   ð������
* �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������  
* ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������  
* ������е�Ԫ���ظ����ϵĲ��裬�������һ����
* ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ� 
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��2�� ����12:52:25   
* @version        
*/
public class BubbleSort {
	public static void main(String[] args) {
		bubbSort();
	}

	private static void bubbSort() {
		//��ʼ������
		int[] arr=initArr();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//�������
		sortArr(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void sortArr(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	private static int[] initArr() {
		int[] arr =new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int) (Math.random()*100);
		}
		return arr;
	}

}
