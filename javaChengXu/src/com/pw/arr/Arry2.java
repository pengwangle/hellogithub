package com.pw.arr;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：Arry2   
* 类描述： 定义一个int型的一维数组，包含10个元素，分别赋值为1~10， 然后将数组中的元素都向前移一个位置，
即，a[0]=a[1],a[1]=a[2],…最后一个元素的值是原来第一个元素的值，然后输出这个数组。
  
* 创建人：小王爷   
* 创建时间：2018年1月1日 下午9:30:32   
* @version        
*/
public class Arry2 {
	public static void main(String[] args) {
		playArryMove();
	}

	private static void playArryMove() {
		//初始化数组
		int[] arr=initArr();
		System.out.println();
		//操作数组
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
