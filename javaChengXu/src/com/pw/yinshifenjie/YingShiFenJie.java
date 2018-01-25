package com.pw.yinshifenjie;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：YingShiFenJie   
* 类描述：   因式分解
* 创建人：小王爷   
* 创建时间：2018年1月9日 下午8:58:36   
* @version        
*/
public class YingShiFenJie {

	public static void main(String[] args) {
		int num=90;
		fenJie(num);
		int[] arr=fenjie1(num);
		System.out.println();
		System.out.print(num+"=");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0){
				System.out.print(arr[i]+" * ");
			}
			
		}
		
		
	}

	private static int[] fenjie1(int num) {
		int[] arr=new int[10];
		int i=2,count=0,n=0;
		
		while(num>=i){
			if(num%i==0){
				arr[0]=i;
				if(count>0){
					n++;
					System.out.print(n+" * ");
				}
				num=num/i;
				arr[n+1]=i;
				count++;
			}else{
				i++;
			}
		}
		return arr;
	}

	private static void fenJie(int num) {
		int i=2,count=0;
		System.out.print(num+"=");
		while(num>=i){
			if(num%i==0){
				if(count>0){
					System.out.print("*");
				}
				num=num/i;
				System.out.print(i);
				count++;
			}else{
				i++;
			}
		}
		if(count==1){
			System.out.print("*1");
		}else if (count<1) {
			System.out.print("1*1");
		}else{
			System.out.println();
		}
		
	}

}
