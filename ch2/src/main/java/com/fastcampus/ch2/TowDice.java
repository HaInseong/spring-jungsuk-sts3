package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ctrl + shift + o = 자동 import
public class TowDice { // 실행시 마다 결과가 변하므로 동적리소스라 한다.
	@RequestMapping("/rollDice") // 브라우저에서 메서드에 맵핑된 url로 요청을 받으면 메서드의 내용을 반환해주면 된다.
	public void main(HttpServletResponse response) throws IOException{
		int idx1 = (int)(Math.random()*6)+1; 
		int idx2 = (int)(Math.random()*6)+1;
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='resources/img/dice"+idx1+".jpg'>");
		out.println("<img src='resources/img/dice"+idx2+".jpg'>");
		out.println("</body>");
		out.println("</html>");
	}
}
