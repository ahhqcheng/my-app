package com.liuan.staticFactoryEnum;

import com.liuan.staticFactory.Api;

public class Main {

	public static void main(String[] args) {
		Api api = ApiEnum.ImplA.createApi();//�����˴��ε��µĴ���
		api.operation("����ʹ�ü򵥹���(ö��)");
	}

}
