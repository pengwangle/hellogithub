package com.pw.arr;

import java.sql.Savepoint;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�ArrDeal   
* ��������  Ҫ����һ��int������a=0,����100��Ԫ��=0,����100�������4λ����
* �ٶ���һ��int������b������10��Ԫ�ء�
* ͳ��a�����е�Ԫ�ض�10�������0�ĸ��������浽b[0]�У�
* ��10�������1�ĸ��������浽b[1]�У������������ơ�
  
* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��8�� ����9:11:14   
* @version        
*/
public class ArrDeal {
	public static void main(String[] args) {
		playArr();
		
	}

	private static void playArr() {
		/*��������A*/
		int[] arr=initArr();
		/*��������*/
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
