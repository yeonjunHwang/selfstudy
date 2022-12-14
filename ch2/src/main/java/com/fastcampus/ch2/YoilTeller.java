package com.fastcampus.ch2;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//년월일을 입력하면 요일을 알려주는 프로그램
@Controller
public class YoilTeller {
@RequestMapping("/getyoil")
	public  void main(HttpServletRequest request,HttpServletResponse response) throws Exception{

		// 입력

		String year =request.getParameter("year") ;
		String month =request.getParameter("month")  ;
		String day = request.getParameter("day") ;

		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		// 작업

		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);

		int dayoffweek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = " 일월하수목금토".charAt(dayoffweek); // 1:일요일, 2:월요일 ...
		System.out.println("yoil " + yoil);

		// 출력
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =  response.getWriter();
		
		out.println(year + "년" + month + "월" + day + "일은");
		out.println(yoil + "요일입니다");

	}

}
