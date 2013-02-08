package com.liuan.staticFactoryEnum;

import com.liuan.staticFactory.Api;

public class Main {

	public static void main(String[] args) {
		Api api = ApiEnum.ImplA.createApi();//避免了传参导致的错误
		api.operation("正在使用简单工厂(枚举)");
	}

}
