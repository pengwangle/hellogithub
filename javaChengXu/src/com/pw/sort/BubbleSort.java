package com.pw.sort;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：BubbleSort   
* 类描述：   冒泡排序
* 比较相邻的元素。如果第一个比第二个大，就交换他们两个。  
* 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。  
* 针对所有的元素重复以上的步骤，除了最后一个。
* 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。 
* 创建人：小王爷   
* 创建时间：2018年1月2日 下午12:52:25   
* @version        
*/
public class BubbleSort {
	public static void main(String[] args) {
		bubbSort();
	}

	private static void bubbSort() {
		//初始化数组
		int[] arr=initArr();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//排序操作
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
