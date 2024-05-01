package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 년월일을 입력하면 요일을 알려주는 프로그램
@Controller // 프로그램 등록
public class YoilTeller {
//	public static void main(String[] args) {
	@RequestMapping("/getYoil") // http://localhost:8080/ch2/getYoil?year=2024&month=4&day=30
	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1. 입력
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		// 2. 작업(처리)
		 int yyyy = Integer.parseInt(year);
	     int mm = Integer.parseInt(month);
	     int dd = Integer.parseInt(day);

	     Calendar cal = Calendar.getInstance();
	     cal.set(yyyy, mm - 1, dd);

	     int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	     char yoil = " 일월화수목금토".charAt(dayOfWeek);   // 일요일:1, 월요일:2, ... 

	     // 3. 출력
	     response.setContentType("text/html"); // 출력 전에 출력타입 지정해줘야 한다. = 브라우저는 내가 텍스트를 보내는지 바이너리르 보내는지 모르기 때문에
	     response.setCharacterEncoding("utf-8"); // 내가 보내는 텍스트의 인코딩이 무엇인지 알려줘야 브라우저가 제대로 해석할 수 있다.
	     PrintWriter out = response.getWriter(); // response객체에서 브라우저로의 출력 스트림을 얻는다.
	     out.println(year + "년 " + month + "월 " + day + "일은 ");
	     out.println(yoil + "요일입니다.");

	}

}


