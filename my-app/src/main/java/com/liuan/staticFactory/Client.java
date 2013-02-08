package com.liuan.staticFactory;

/**
 * 使用Api的客户端
 * */
public class Client {
	public static void main(String[] args) {
		Api api = ApiFactory.createApi(1);
		api.operation("正在使用简单工厂");
	}

}
