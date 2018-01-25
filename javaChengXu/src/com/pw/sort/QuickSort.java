package com.pw.sort;

public class QuickSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		quicksort1();
		
	}

	public static void quicksort1()  {
		int[] arr={52,88,22,3,44,66,15,60,8,28};
		int left=0,right=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr,left,right);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void sort(int[] arr, int left, int right) {
		int start=left,end=right,key=arr[start];
		while(start<end){
			while(start<end&&arr[end]>=key)
				{end--;}
			if(arr[end]<=key){
				int temp=arr[end];
				arr[end]=arr[start];
				arr[start]=temp;
			}
			while(start<end&&arr[start]<=key)
				{start++;}
			if(arr[start]>=key){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		if(start>left)sort(arr, left, start-1);
		if(end<right)sort(arr, end+1, right);
	}

}
