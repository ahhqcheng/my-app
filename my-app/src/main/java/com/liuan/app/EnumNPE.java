package com.liuan.app;

public class EnumNPE {
	public static void main(String[] args) {
		//ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
	  doExport(null);//抛NPE，switch的枚举是根据枚举的排序值匹配的,所以使用之前要判空
		//doExport(LogLevel.FATAL);
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
		default: //这个default是最好要有的，培养良好的编程习惯（防止枚举值增加了，而这个swith没有更新而出现业务异常）
			throw new AssertionError("the param is not one of LogLevel");
			
		}
	}
}
