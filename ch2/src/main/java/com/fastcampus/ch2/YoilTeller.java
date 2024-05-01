package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// ������� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller // ���α׷� ���
public class YoilTeller {
//	public static void main(String[] args) {
	@RequestMapping("/getYoil") // http://localhost:8080/ch2/getYoil?year=2024&month=4&day=30
	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1. �Է�
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		// 2. �۾�(ó��)
		 int yyyy = Integer.parseInt(year);
	     int mm = Integer.parseInt(month);
	     int dd = Integer.parseInt(day);

	     Calendar cal = Calendar.getInstance();
	     cal.set(yyyy, mm - 1, dd);

	     int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	     char yoil = " �Ͽ�ȭ�������".charAt(dayOfWeek);   // �Ͽ���:1, ������:2, ... 

	     // 3. ���
	     response.setContentType("text/html"); // ��� ���� ���Ÿ�� ��������� �Ѵ�. = �������� ���� �ؽ�Ʈ�� �������� ���̳ʸ��� �������� �𸣱� ������
	     response.setCharacterEncoding("utf-8"); // ���� ������ �ؽ�Ʈ�� ���ڵ��� �������� �˷���� �������� ����� �ؼ��� �� �ִ�.
	     PrintWriter out = response.getWriter(); // response��ü���� ���������� ��� ��Ʈ���� ��´�.
	     out.println(year + "�� " + month + "�� " + day + "���� ");
	     out.println(yoil + "�����Դϴ�.");

	}

}


