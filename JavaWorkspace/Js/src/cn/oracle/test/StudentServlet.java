package cn.oracle.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

/**
 * 控制器
 * @author Nocol
 *
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			req.setCharacterEncoding("utf-8");
			//获取客户端（datagrid）传的页号
			String pageNo = req.getParameter("page");
			System.out.println("传过来的页号："+pageNo);
			if( pageNo==null||pageNo.trim().length()==0){
				pageNo="1";
			}
			int currPageNo=Integer.parseInt(pageNo);
			
			//调用Service
			StudentService service=new StudentService();
			Page page = service.show(currPageNo);
			
			//创建map集合
			Map<String, Object> map=new LinkedHashMap<String,Object>();
			map.put("total", page.getAllRecordNO());//存放总记录数
			map.put("rows", page.getList());//存放每页的内容
			
			//使用第三方将map转成json数据
			JSONArray array=JSONArray.fromObject(map);
			String jsonJava = array.toString();
			//去掉两边空格
			jsonJava=jsonJava.substring(1, jsonJava.length()-1);
			
			System.out.println(jsonJava);
			
			//以流方式传客户端
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();
			pw.write(jsonJava);
			pw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
