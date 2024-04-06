package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		Hello hello = new Hello();
		// hello.main3();//private이라서 Error발생, 외부에서 URL로는 접근 가능하지만 클래스 내에서는 접근제어자 규칙 따름
		
		// ★ private메서드에 URL로 외부에서 접근 가능한 이유는?
		// = 스프링 프레임워크가 자바의 Reflection API를 사용해서 객체를 만들기 때문에 
		// Reflection API란? = 클래스 정보를 얻고 다룰 수 있는 강력한 기능 제공
		// java.lang.reflect 패키지를 제공
		// Hello클래스의 Class 객체(클래스의 정보를 담고 있는 객체)를 얻어온다.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		// 클래스 파일(*.class)이 메모리에 올라갈 때, 클래스 파일 마다 Class객체가 하나씩 생성된다.
		Hello hello2 = (Hello)helloClass.newInstance(); // Class객체가 가진 정보로 객체 생성
		Method main = helloClass.getDeclaredMethod("main3"); // reflect 패키지 안에 있는 Method클래스는 메서드 참조할 때 사용한다.
		main.setAccessible(true); // private인 main()을 호출가능하게 한다.
		main.invoke(hello2); // hello2.main() 호출을 의미
	}

}
