package com.pw.arr;

/**   
*    
* ��Ŀ���ƣ�javaChengXu   
* �����ƣ�Arr4   
* ��������   ����һ��20*5�Ķ�ά���飬�����洢ĳ�༶20λѧԱ��5�ſεĳɼ�����5�ſ�
   ���洢˳������Ϊ��core C++��coreJava��Servlet��JSP��EJB��
   ��1��ѭ������ά�����ÿһ��Ԫ�ظ�0~100֮������������
   ��2�������б�ķ�ʽ�����ЩѧԱ��ÿ�ſγ̵ĳɼ���
   ��3��Ҫ���д������ÿ��ѧԱ���ܷ֣����䱣��������һ��һά�����С�

* �����ˣ�С��ү   
* ����ʱ�䣺2018��1��2�� ����9:41:29   
* @version        
*/
public class Arr4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		playArr();
		
		
	}

	private static void playArr() {
		//��ʼ������
		int[][] arr= initArr();
		int[] sumarr=sumArr(arr);
		for (int i = 0; i < sumarr.length; i++) {
			System.out.print(sumarr[i]+"*");
		}
		
	}

	private static int[] sumArr(int[][] arr) {
		int[] suna=new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < 5; j++) {
				sum+=arr[i][j];
			}
			suna[i]=sum;
		}
		return suna;
	}

	private static int[][] initArr() {
		int[][] arr=new int[20][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j]=(int) (Math.random()*100);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return arr;
	}

}
