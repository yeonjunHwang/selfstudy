package com.fastcampus.ch2;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//������� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller
public class YoilTellermvc {
	@RequestMapping("/getyoilmvc")
	// public void main(HttpServletRequest request,HttpServletResponse response)
	// throws Exception{
	public ModelAndView main(int year, int month, int day, Model model) throws Exception {

		// �Է�

		/*
		 * String year =request.getParameter("year") ; String month
		 * =request.getParameter("month") ; String day = request.getParameter("day") ;
		 */

		/*
		 * int yyyy = Integer.parseInt(year); int mm = Integer.parseInt(month); int dd =
		 * Integer.parseInt(day);
		 */

		// �۾�

		// 1. ��ȿ�� �˻�
//		if (!isValid(year, month, day))
//			return "yoilError";
		ModelAndView mv = new ModelAndView();
		
		// 2���� ��� 
		char yoil = getYoil(year, month, day);
		mv.addObject("year",year);
		mv.addObject("month",month);
		mv.addObject("day",day);
		mv.addObject("yoil",yoil);
		
		System.out.println("yoil " + yoil);
		
		mv.setViewName("yoil");
		return mv;
		
		//return "yoil"; // web-inf/views/yoil.jsp

		// ���
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter out =  response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println(year + "��" + month + "��" + day + "����");
//		out.println(yoil + "�����Դϴ�");
//		out.println("</body>");
//		out.println("</html>");

	}

	private boolean isValid(int year, int month, int day) {
		
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);

		int dayoffweek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = " �Ͽ��ϼ������".charAt(dayoffweek); // 1:�Ͽ���, 2:������ ...
		return yoil;
	}

}
