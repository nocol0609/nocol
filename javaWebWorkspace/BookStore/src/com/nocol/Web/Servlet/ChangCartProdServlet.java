package com.nocol.Web.Servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.Bean.Product;
import com.nocol.Service.ProductService;
import com.nocol.Service.Impl.ProductServiceImpl;

@WebServlet("/changCartProd")
public class ChangCartProdServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String prod_id = request.getParameter("id");
		String buyNnum = request.getParameter("buyNum");
		System.out.println("修改的商品id：" + prod_id + "---" + "修改的商品数量：" + buyNnum);

		Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");
		ProductService service = new ProductServiceImpl();
		Product product = service.findProdById(prod_id);
		System.out.println("输入框修改数量的产品:"+product);
		//修改商品数量
		cartmap.put(product, Integer.parseInt(buyNnum));
		
		System.out.println("修改数量后cartmap:"+"------------"+cartmap);
		
		//重定向购物车页面
		response.sendRedirect("shopCart.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
