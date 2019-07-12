package com.atguigu.day17.java3;



/*
 	String,StringBuffer,StringBuilder的效率测试：
 	
 	StringBuilder(效率最高) > StringBuffer > String(效率最低)
 */
public class TimeTest {

	public static void main(String[] args) {
		long startTime = 0L;
		long endTime = 0L;
		
		
		String text = "";
		StringBuffer buffer = new StringBuffer("");
		StringBuilder builder = new StringBuilder("");
		
		
		// 开始对比
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			buffer.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String的执行时间：" + (endTime - startTime));

	}
}
