package com.liuan.app;



public class EnumNPE {
	//private static Logger LOGGER = LoggerFactory.getLogger(EnumNPE.class);
	public static void main(String[] args) {
		//ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
	  //doExport(null);//��NPE��switch��ö���Ǹ���ö�ٵ�����ֵƥ���,����ʹ��֮ǰҪ�п�
	  doExport(LogLevel.FATAL);
	}

	public static void doExport(LogLevel logLevel){
		switch (logLevel) {//logLevel.ordinal()
		case DEBUG: //logLevel.DEBUG.ordinal()
			System.out.print("debug");
			break;
		case INFO:
			System.out.print("INFO");
			break;
		case WARN:
			System.out.print("WARN");
			break;
		case ERROR:
			System.out.print("ERROR");
			break;
		default: //���default�����Ҫ�еģ��������õı��ϰ�ߣ���ֹö��ֵ�����ˣ������swithû�и��¶�����ҵ���쳣��
			//if(LOGGER.isInfoEnabled()){
			//LOGGER.info(new AssertionError("the param"+logLevel+" is not one of LogLevel").getMessage());
			//}
		}
	}
}
