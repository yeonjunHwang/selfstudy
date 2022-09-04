package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {

		Hello hello2 = new Hello();
		/*
		 * hello.main(); // private �̶� �ܺ� ȣ�� �Ұ�
		 */
		
		// reflection api�� ��� Ŭ���� ������ ��� �ٷ�� �ִ� ������ ��� ����
		// java.lang.reflect ��Ű�� ����
		
		Class helloClass =Class.forName("com.fastcampus.ch2.Hello");
		
		Hello hello = (Hello)helloClass.newInstance(); // Class��ü�� ���� ������ ��ü ����
		Method main =helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�
		
	
		main.invoke(hello);  //hello.main()
		
	}

}
