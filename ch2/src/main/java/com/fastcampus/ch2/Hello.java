package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.���� ȣ�Ⱑ���� ���α׷����� ���
@Controller
public class Hello {
	
	int iv =10;
	static int cv =20;
	
	
	//2.url�� �޼��带 ����
	@RequestMapping("/hello")
	private  void main() {
		
		System.out.println("hello");
		
	}
	
	public static void main2() {
		System.out.println(cv);
//		System.out.println(iv);
	}
}
