package com.pw.sort;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�InserSort   
* ��������   
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��17�� ����7:57:37   
* @version        
*/
public class InserSort {
	
	public static void main(String[] args) {
		insertSort();
	}

	private static void insertSort() {
		//����һ������
		int[] arr={52,88,22,3,44,66,15,60,8,28};
		System.out.println("��ʼ���飺");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//����
		System.out.println();
		int[] newarr= baseInsertSort(arr);
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]+" ");
		}
		
	}

	private static int[] baseInsertSort(int[] arr) {
		//�ӵڶ�������ʼ�Ƚ�
		for(int i=1;i<arr.length;i++){
			//�������
			int temp=arr[i];
			int j=i-1;
			for(;j>=0&&arr[j]>temp;j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		return arr;
	}

}
