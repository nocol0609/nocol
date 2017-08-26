package com.nocol.Web.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

@WebServlet("/prodInfor")
public class ProdInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");

		ProductService service = new ProductServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		CategoryDetailService categoryDetailService = new CategoryDetailServiceImpl();

		Product product = service.findProdById(id);

		// 通过产品id查询该产品所属的详细种类
		CategoryDetail categoryDetail = categoryDetailService.findProductDetailById(id);
		// 根据产品详细种类id获取产品种类id
		String category_id = String.valueOf(categoryDetail.getId());
		// 通过种类id查询种类
		Category category = categoryService.findCategoryById(category_id);
		System.out.println("产品种类：" + category);
		categoryDetail.setCategory(category);

		System.out.println("书的详细种类:" + categoryDetail);
		product.setCate_detail(categoryDetail);

		System.out.println("查找到的书籍：" + product);

		if (product != null) {
			request.setAttribute("product", product);
		}

		request.getRequestDispatcher("viewBook.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
