package com.pw.demo;
interface A{
	int n=0;
	
}
class B{
	 int x=1;
}

public class C extends B implements A{
	
	public void px(){
		System.out.println(x);
		System.out.println(n);
	}
	public static void main(String[] args) {
		new C().px();
	}

}
