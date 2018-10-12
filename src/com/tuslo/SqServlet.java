package com.tuslo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;


import javax.servlet.http.*;
public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
//		HttpSession session=req.getSession();
//int k=(int)session.getAttribute("k");
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		PrintWriter out=res.getWriter();
	
		//int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		out.println("the square of the sum is: "+k);
		
	System.out.println("sq called");	
	 
		
	}

}
