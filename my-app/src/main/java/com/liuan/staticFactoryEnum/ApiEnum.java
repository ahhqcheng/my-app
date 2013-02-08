package com.liuan.staticFactoryEnum;

import com.liuan.staticFactory.Api;
import com.liuan.staticFactory.ImplB;


enum ApiEnum{
//	ImplA,ImplB;
//	public Api createApi(){
//		switch(this){
//		case ImplA:
//			return  new com.liuan.staticFactory.ImplA();
//		case ImplB:
//			return new  com.liuan.staticFactory.ImplB();
//			default:
//				throw new AssertionError("无效参数");
//		}
//	}
	ImplA{
		public Api createApi(){
			return  new com.liuan.staticFactory.ImplA();
		}
	},
	ImplB{
		public Api createApi(){
			return  new com.liuan.staticFactory.ImplB();
		}
	};
	
	public abstract Api createApi();
}
