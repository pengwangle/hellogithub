package com.pw.arr;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�Arry2   
* �������� ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�ֵΪ1~10�� Ȼ�������е�Ԫ�ض���ǰ��һ��λ�ã�
����a[0]=a[1],a[1]=a[2],�����һ��Ԫ�ص�ֵ��ԭ����һ��Ԫ�ص�ֵ��Ȼ�����������顣
  
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��1�� ����9:30:32   
* @version        
*/
public class Arry2 {
	public static void main(String[] args) {
		playArryMove();
	}

	private static void playArryMove() {
		//��ʼ������
		int[] arr=initArr();
		System.out.println();
		//��������
		moveArr(arr);
		
	}

	private static void moveArr(int[] arr) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
			if((i+1)==arr.length-1){
				arr[arr.length-1]=temp;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] initArr() {
		int[] arr =new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
			System.out.print(arr[i]+" ");
		}
		return arr;
	}

}
