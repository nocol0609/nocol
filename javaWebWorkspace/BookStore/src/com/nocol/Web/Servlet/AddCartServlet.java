package com.nocol.Web.Servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.Bean.Category;
import com.nocol.Bean.CategoryDetail;
import com.nocol.Bean.IShopCart;
import com.nocol.Bean.OrderLine;
import com.nocol.Bean.Product;
import com.nocol.Service.CategoryDetailService;
import com.nocol.Service.CategoryService;
import com.nocol.Service.ProductService;
import com.nocol.Service.Impl.CategoryDetailServiceImpl;
import com.nocol.Service.Impl.CategoryServiceImpl;
import com.nocol.Service.Impl.ProductServiceImpl;

@WebServlet("/addCart")
public class AddCartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取购买商品的id
		String prod_id = request.getParameter("id");
		// 购买的数量
		String number = request.getParameter("number");
		
/*		//购买的产品的详细种类名称
		String categoryDetail=request.getParameter("categoryDetail");
		
		//购买的产品的种类名城
		String category=request.getParameter("category");
		System.out.println("添加到购物车的产品种类名称："+category+"详细分类名称："+categoryDetail);

		System.out.println("产品id:" + prod_id+"-----"+"购买数量:"+number);*/
		
		Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");
			
		ProductService service = new ProductServiceImpl();
		Product product = service.findProdById(prod_id);
		
/*		CategoryDetailService categoryDetailService=new CategoryDetailServiceImpl();
		//通过产品id查询该产品所属的详细种类
		CategoryDetail categoryDetail=categoryDetailService.findProductDetailById(prod_id);
		//根据产品详细种类id获取产品种类id
		String category_id = String.valueOf(categoryDetail.getId());
		//通过种类id查询种类
		CategoryService categoryService=new CategoryServiceImpl();
		Category category=categoryService.findCategoryById(category_id);
		categoryDetail.setCategory(category);
				
		product.setCate_detail(categoryDetail);*/
				
		System.out.println("添加到购物车的产品："+product);
		
		if (product != null) {
			// 判断map是否已经包含该product
			if (cartmap.containsKey(product)) {// 之前添加过购物车,数量加
				cartmap.put(product, cartmap.get(product) + Integer.parseInt(number));
			} else {// 之前未添加过购物车,数量为加入购物车时传过来的数量
				cartmap.put(product, Integer.parseInt(number));
			}
			
			System.out.println("cartmap:-----------"+cartmap);
			
			// 重定向购物车页面
			response.sendRedirect("shopCart.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
