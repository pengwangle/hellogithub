package com.pw.diedai;

public class FeiBoLaQie {
	
	
	public static void main(String[] args) {
		int num=feibolaqie(8);
		System.out.println(num+"*****");
	}

	/**1  1  2  3  5  8  13  21  34쳲�������ʵ��
	 * @param i
	 * @return
	 */
	private static int feibolaqie(int i) {
		int f1=1 ,f2=1;
		int fn=0,n=2;
		
		if(i<0){
			System.out.println("������������֣����ֲ����Ϲ淶��");
		}
		if(i==1||i==2){
			return 1;
		}else {
			while(n<i){
			fn=f1+f2;
			f1=f2;
			f2=fn;
			n++;	
			}
			return fn;
		}
		
		
	}

}
