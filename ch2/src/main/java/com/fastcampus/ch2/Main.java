package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		Hello hello = new Hello();
		// hello.main3();//private�̶� Error�߻�, �ܺο��� URL�δ� ���� ���������� Ŭ���� �������� ���������� ��Ģ ����
		
		// �� private�޼��忡 URL�� �ܺο��� ���� ������ ������?
		// = ������ �����ӿ�ũ�� �ڹ��� Reflection API�� ����ؼ� ��ü�� ����� ������ 
		// Reflection API��? = Ŭ���� ������ ��� �ٷ� �� �ִ� ������ ��� ����
		// java.lang.reflect ��Ű���� ����
		// HelloŬ������ Class ��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		// Ŭ���� ����(*.class)�� �޸𸮿� �ö� ��, Ŭ���� ���� ���� Class��ü�� �ϳ��� �����ȴ�.
		Hello hello2 = (Hello)helloClass.newInstance(); // Class��ü�� ���� ������ ��ü ����
		Method main = helloClass.getDeclaredMethod("main3"); // reflect ��Ű�� �ȿ� �ִ� MethodŬ������ �޼��� ������ �� ����Ѵ�.
		main.setAccessible(true); // private�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.
		main.invoke(hello2); // hello2.main() ȣ���� �ǹ�
	}

}
