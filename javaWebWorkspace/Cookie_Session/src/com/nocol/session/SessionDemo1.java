package com.nocol.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SessionDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ªÒ»°Session
		HttpSession session = request.getSession();
		
		session.setAttribute("name", "nocol");
		
	}

}
