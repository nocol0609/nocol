package com.nocol.Web.Servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.Bean.Category;
import com.nocol.Bean.CategoryDetail;
import com.nocol.Bean.Product;
import com.nocol.Service.CategoryDetailService;
import com.nocol.Service.CategoryService;
import com.nocol.Service.ProductService;
import com.nocol.Service.Impl.CategoryDetailServiceImpl;
import com.nocol.Service.Impl.CategoryServiceImpl;
import com.nocol.Service.Impl.ProductServiceImpl;

@WebServlet("/delCartProd")
public class DelCartProdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		System.out.println("要删除的商品id:"+id);
		
		ProductService service=new ProductServiceImpl();
		Product product = service.findProdById(id);
		
/*		CategoryDetailService categoryDetailService=new CategoryDetailServiceImpl();
		//通过产品id查询该产品所属的详细种类
		CategoryDetail categoryDetail=categoryDetailService.findProductDetailById(id);
		//根据产品详细种类id获取产品种类id
		String category_id = String.valueOf(categoryDetail.getId());
		//通过种类id查询种类
		CategoryService categoryService=new CategoryServiceImpl();
		Category category=categoryService.findCategoryById(category_id);
		categoryDetail.setCategory(category);
				
		product.setCate_detail(categoryDetail);*/
		
		System.out.println("要删除的产品："+product);
		
		Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
		cartmap.remove(product);
		
		//重定向购物车
		resp.sendRedirect("shopCart.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}

