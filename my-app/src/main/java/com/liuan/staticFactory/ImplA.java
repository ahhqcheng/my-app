package com.liuan.staticFactory;

public class ImplA implements Api{

	@Override
	public void operation(String s) {
		System.out.println("ImplA s== "+s);
		
	}

}
