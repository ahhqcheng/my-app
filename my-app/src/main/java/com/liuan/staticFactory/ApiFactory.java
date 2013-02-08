package com.liuan.staticFactory;

public class ApiFactory {
	/**
	 * ���崴��Api����ķ���
	 * @param condition ���ⲿ�����ѡ������
	 * @return Api  �����õ�Api����
	 * */
	
	public static Api createApi(int condition){ //�򵥹���һ�㶼����Ϊһ��������ʹ�õ�
		Api api = null;
		
		if(condition==1){
			api = new ImplA();
		}else if(condition==2){
			api = new ImplB();
		}
		
		return api;
	}

}
