package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	//2. URL과 프로그램(메서드)을 연결
	@RequestMapping("/hello")
	public void main() { //static이 없는 인스턴스 메서드인데도 호출이 된다? = 톰캣이 객체를 생성해준다.
		System.out.println("Hello - public");
		System.out.println(cv);
		System.out.println(iv);
	}
	
	@RequestMapping("/hello2")
	public static void main2() { //static메서드 - cv만 사용 가능 / static이어도 톰캣이 객체는 생성한다.
		System.out.println("Hello2 - static");
		System.out.println(cv);
		//System.out.println(iv); //객체를 생성하지 않고 인스턴스 변수를 사용하면 Error 발생
	}
	
	@RequestMapping("/hello3")
	private static void main3() { 
	//private이어도 호출 가능 = RequestMapping하여 URL과 연결시켰다는 의미는 이 메서드를 외부에서 호출 가능하게끔 하겠다는 것.
	//그래서 접근제어자 상관없이 호출가능하게 되어있다.
	//그러나 클래스 내부에서는 private이다.
		System.out.println("Hello3 - private");
		System.out.println(cv);
	}
}
