package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class twoDice {
	
	@RequestMapping("/rollDice")
	public void main(HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src ='/resources/img/dice1.jpg'>");
		out.println("<img src ='/resources/img/dice2.jpg'>");
		out.println("<img src ='/resources/img/dice3.jpg'>");
		out.println("<img src ='/resources/img/dice4.jpg'>");
		out.println("<img src ='/resources/img/dice5.jpg'>");
		out.println("<img src ='/resources/img/dice6.jpg'>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
