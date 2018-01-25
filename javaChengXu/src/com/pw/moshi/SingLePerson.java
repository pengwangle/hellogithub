package com.pw.moshi;

public class SingLePerson {
	private String name;
	private int age;
	
	private static SingLePerson p=new SingLePerson();
	
	public SingLePerson getIntance(){
		return p;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void hello(){
		System.out.println("这就是单列模式！哈哈！");
	}

}
