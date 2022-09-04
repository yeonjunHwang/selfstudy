package com.fastcampus.ch2;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//������� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller
public class YoilTeller {
@RequestMapping("/getyoil")
	public  void main(HttpServletRequest request,HttpServletResponse response) throws Exception{

		// �Է�

		String year =request.getParameter("year") ;
		String month =request.getParameter("month")  ;
		String day = request.getParameter("day") ;

		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		// �۾�

		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm - 1, dd);

		int dayoffweek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = " �Ͽ��ϼ������".charAt(dayoffweek); // 1:�Ͽ���, 2:������ ...
		System.out.println("yoil " + yoil);

		// ���
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =  response.getWriter();
		
		out.println(year + "��" + month + "��" + day + "����");
		out.println(yoil + "�����Դϴ�");

	}

}
