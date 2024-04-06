package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	//2. URL�� ���α׷�(�޼���)�� ����
	@RequestMapping("/hello")
	public void main() { //static�� ���� �ν��Ͻ� �޼����ε��� ȣ���� �ȴ�? = ��Ĺ�� ��ü�� �������ش�.
		System.out.println("Hello - public");
		System.out.println(cv);
		System.out.println(iv);
	}
	
	@RequestMapping("/hello2")
	public static void main2() { //static�޼��� - cv�� ��� ���� / static�̾ ��Ĺ�� ��ü�� �����Ѵ�.
		System.out.println("Hello2 - static");
		System.out.println(cv);
		//System.out.println(iv); //��ü�� �������� �ʰ� �ν��Ͻ� ������ ����ϸ� Error �߻�
	}
	
	@RequestMapping("/hello3")
	private static void main3() { 
	//private�̾ ȣ�� ���� = RequestMapping�Ͽ� URL�� ������״ٴ� �ǹ̴� �� �޼��带 �ܺο��� ȣ�� �����ϰԲ� �ϰڴٴ� ��.
	//�׷��� ���������� ������� ȣ�Ⱑ���ϰ� �Ǿ��ִ�.
	//�׷��� Ŭ���� ���ο����� private�̴�.
		System.out.println("Hello3 - private");
		System.out.println(cv);
	}
}
