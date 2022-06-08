package com.learners.studentservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		
		/* Get the data from Request parameter*/
		
		String firstName=(String) request.getParameter("firstName");
		String lastName=(String) request.getParameter("lastName");
		String mobileNo=(String) request.getParameter("mobileNo");
		String password=(String) request.getParameter("password");
		
		System.out.println("First Name - "+firstName);
		System.out.println("Last Name - "+lastName);
		System.out.println("mobileNo - "+mobileNo);
		System.out.println("Password - "+password);
		
		/*2. Save the data in to table*/
		
		/*3.Response back the same data to the User*/
		 response.setContentType("text/html");
	     PrintWriter printWriter = response.getWriter();
	        printWriter.print("<html>");
	        printWriter.print("<body>");
	        printWriter.print("<h1>Learners Academy Registration Form Data</h1>");
	        printWriter.print("<h2>Form submited Successfylly</h2>");
	        printWriter.print("<p> First Name :: " + firstName + "</p>");
	        printWriter.print("<p> Last Name :: " + lastName + "</p>");
	        printWriter.print("<p> mobileNo :: " + mobileNo + "</p>");
	        printWriter.print("<p> Password :: " + password + "</p>");
	        printWriter.print("</body>");
	        printWriter.print("</html>");
	        printWriter.close();
		
		
	        
	
	}
}