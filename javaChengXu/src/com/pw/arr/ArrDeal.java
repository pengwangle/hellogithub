package com.pw.arr;

import java.sql.Savepoint;

/**   
*    
* 项目名称：javaChengXu   
* 类名称：ArrDeal   
* 类描述：  要求定义一个int型数组a=0,包含100个元素=0,保存100个随机的4位数。
* 再定义一个int型数组b，包含10个元素。
* 统计a数组中的元素对10求余等于0的个数，保存到b[0]中；
* 对10求余等于1的个数，保存到b[1]中，……依此类推。
  
* 创建人：小王爷   
* 创建时间：2018年1月8日 下午9:11:14   
* @version        
*/
public class ArrDeal {
	public static void main(String[] args) {
		playArr();
		
	}

	private static void playArr() {
		/*定义数组A*/
		int[] arr=initArr();
		/*操作数组*/
		int[] b=saveArrB(arr);
		int[] b1=saveArrB1(arr);
	}

	private static int[] saveArrB1(int[] arr) {
		int[] b=new int[10];
		int k ,sum ;
		int j;
		for (int i = 0; i < b.length; i++) {
			for ( j = 0,sum=0; j < arr.length; j++) {
				if((arr[j]%10)==i)
					sum++;	
			}
			b[i]=sum;
			System.out.printf(b[i]+" ");
		}
		System.out.println();
		return b;
	}

	private static int[] saveArrB(int[] arr) {
		int[] b=new int[10];
		int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%10==0){
				n0++;
			}
			else if(arr[i]%10==1){
				n1++;
			}
			else if(arr[i]%10==2){
				n2++;
			}
			else if(arr[i]%10==3){
				n3++;
			}
			else if(arr[i]%10==4){
				n4++;
			}
			else if(arr[i]%10==5){
				n5++;
			}
			else if(arr[i]%10==6){
				n6++;
			}
			else if(arr[i]%10==7){
				n7++;
			}
			else if(arr[i]%10==8){
				n8++;
			}
			else{
				n9++;
			}
		}
		b[0]=n0;b[1]=n1;b[2]=n2;b[3]=n3;b[4]=n4;
		b[5]=n5;b[6]=n6;b[7]=n7;b[8]=n8;b[9]=n9;
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			sum+=b[i];
		}
		System.out.println("sum: "+sum);
		return b;
	}

	private static int[] initArr() {
		int[] a=new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i]=(int) (Math.random()*1000);
		}
		return a;
	}

}
