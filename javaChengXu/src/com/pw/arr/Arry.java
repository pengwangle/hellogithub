package com.pw.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arry {

	public static void main(String[] args) {
		List<User> list=new ArrayList<>();
		User u=new User();
		for(int i=0;i<5;i++){
			u.setName("pw1"+i);
			u.setAge(5+i);
			list.add(u);
		}
		u.setName("pw1"+89);
		u.setAge(1);
		list.add(u);
		
	}
}
