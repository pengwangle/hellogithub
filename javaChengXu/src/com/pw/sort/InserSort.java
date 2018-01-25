package com.pw.sort;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：InserSort   
* 类描述：   
* 创建人：小王爷   
* 创建时间：2018年1月17日 下午7:57:37   
* @version        
*/
public class InserSort {
	
	public static void main(String[] args) {
		insertSort();
	}

	private static void insertSort() {
		//构建一个数组
		int[] arr={52,88,22,3,44,66,15,60,8,28};
		System.out.println("初始数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//排序
		System.out.println();
		int[] newarr= baseInsertSort(arr);
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]+" ");
		}
		
	}

	private static int[] baseInsertSort(int[] arr) {
		//从第二个数开始比较
		for(int i=1;i<arr.length;i++){
			//插入的数
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
