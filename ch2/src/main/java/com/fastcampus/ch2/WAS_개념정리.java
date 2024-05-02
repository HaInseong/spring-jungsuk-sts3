package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * WAS란?
 * Web Server는 웹 서비스를 제공하고, Web Application Server는 웹 프로그램 서비스를 제공한다.
 * 즉, 프로그램(클래스+메서드)을 잘 사용할 수 있도록 도와준다.
 * ★ 대표적으로 톰캣이 있는데, 톰캣 서버 안에 Service가 있고, 그 서비스를 처리하는게 Engine인데, Engine안에는 호스트가 n개 이상 있을 수 있고, 호스트(요청 URL) 안에는 여러 개의 컨텍스트가 있을 수 있고, 컨텍스트 안에는 서블릿들이 있다.
 * @author Levi
 *
 */

/**
 * 서블릿이란?
 * 작은 서버 프로그램
 * 작은 단위의 서버에서 실행되는 프로그램 ex) 각각 Request 맵핑된 메서드들
 * @author Levi
 *
 */

/**
 * 컨텍스트란?
 * 한 단위의 프로젝트 ex) /ch2
 * 서블릿은 컨텍스트보다 작은 단위의 서버 프로그램
 * @author Levi
 *
 */
//@Controller
//public class WAS_개념정리 {
//	@RequestMapping("/hello")
//	public String main() {
//		return "hello";
//	}
//
//}
