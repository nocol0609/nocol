package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.creatjson.CreatJson;
import com.utils.JsonTools;

public class JsonServlet extends HttpServlet {
	
	CreatJson creatJson=new CreatJson();
	
	private static final long serialVersionUID = 1L;
   
    public JsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		PrintWriter out=response.getWriter();
		String jsonString="";
		String action_flag=request.getParameter("action_flag");
		if(action_flag.equals("Person")){
			jsonString=JsonTools.getJsonString( "Person", creatJson.getPerson());
		}else if(action_flag.equals("Persons")){
			jsonString=JsonTools.getJsonString("Persons", creatJson.getPersonList());
		}else if(action_flag.equals("StringList")){
			jsonString=JsonTools.getJsonString("StringList", creatJson.getStringList());
		}else if(action_flag.equals("ListMap")){
			jsonString=JsonTools.getJsonString("ListMap", creatJson.getListMap());
		}
		out.println(jsonString);
		out.flush();
		out.close();
	}
	
//	 public void init() throws ServletException{
//		 
//		 creatJson=new CreatJson();  
//	 }
}
