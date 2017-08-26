package com.nocol.Web.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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

@WebServlet("/prodList")
public class ProdListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String categoryName = req.getParameter("categoryName");
		String categoryId = req.getParameter("categoryId");
		String categoryDetailName = req.getParameter("categoryDetailName");
		System.out.println("种类id:"+categoryId+"---"+"种类名称:"+categoryName+"---"+"详细种类名称:"+categoryDetailName);
		
		CategoryDetailService categoryDetailService=new CategoryDetailServiceImpl();
		ProductService productService=new ProductServiceImpl();
		
		//根据种类id查询所有详细分类
		List<CategoryDetail> allCatDetailList=categoryDetailService.findProductDetail();
		Map<CategoryDetail, List<Product>> map=new LinkedHashMap<CategoryDetail,List<Product>>();
		
		//遍历详细分类下的所有书籍
		for (CategoryDetail categoryDetail : allCatDetailList) {
			//根据详细分类id查询该分类下的所有产品
			List<Product> list=productService.findProdByCatDetailId(categoryDetail.getId());
			map.put(categoryDetail, list);
		}		
		req.setAttribute("map", map);
		
		//根据种类id查询该种类下的所有产品
		List<Product> cateProdList=new ArrayList<Product>(); 
		cateProdList = productService.findProdByCatId(categoryId);
	for (Product product : cateProdList) {
			
/*			//通过产品id查询该产品所属的详细种类
			CategoryDetail categoryDetail=categoryDetailService.findProductDetailById(String.valueOf(product.getId()));
			//根据产品详细种类id获取产品种类id
			String category_id = String.valueOf(categoryDetail.getId());
			//通过种类id查询种类
			CategoryService categoryService=new CategoryServiceImpl();
			Category category=categoryService.findCategoryById(category_id);
			categoryDetail.setCategory(category);
					
			product.setCate_detail(categoryDetail);*/
					
			System.out.println("该分类下的所有产品:"+product);
		}
		req.setAttribute("cateProdList", cateProdList);
		
		 
		req.setAttribute("categoryName", categoryName);
		req.setAttribute("categoryDetailName", categoryDetailName);
		req.getRequestDispatcher("/list.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
