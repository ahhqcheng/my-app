package com.liuan.staticFactory;

public class ApiFactory {
	/**
	 * 具体创建Api对象的方法
	 * @param condition 从外部传入的选择条件
	 * @return Api  创建好的Api对象
	 * */
	
	public static Api createApi(int condition){ //简单工厂一般都是作为一个工具类使用的
		Api api = null;
		
		if(condition==1){
			api = new ImplA();
		}else if(condition==2){
			api = new ImplB();
		}
		
		return api;
	}

}
