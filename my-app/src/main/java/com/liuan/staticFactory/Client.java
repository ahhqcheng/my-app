package com.liuan.staticFactory;

/**
 * ʹ��Api�Ŀͻ���
 * */
public class Client {
	public static void main(String[] args) {
		Api api = ApiFactory.createApi(1);
		api.operation("����ʹ�ü򵥹���");
	}

}
