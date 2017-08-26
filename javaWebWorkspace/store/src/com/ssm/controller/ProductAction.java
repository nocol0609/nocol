package com.ssm.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.Category;
import com.ssm.bean.CategoryDetail;
import com.ssm.bean.Product;
import com.ssm.service.CategoryDetailService;
import com.ssm.service.CategoryService;
import com.ssm.service.ProductService;

/**
 * 产品控制器
 * 
 * @author Nocol
 *product/images/logo.png
 *
 *product/aideyishu1.jpg
 *
 */
@Controller
@RequestMapping("/product")
public class ProductAction {
	@Autowired
	private CategoryDetailService categoryDetailService;
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;

	/**
	 * list.jsp页面产品
	 */
	@RequestMapping("/prodList")
	public void fingAllPro(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String categoryName = req.getParameter("categoryName");
		String categoryId = req.getParameter("categoryId");
		String categoryDetailName = req.getParameter("categoryDetailName");
		System.out.println(
				"种类id:" + categoryId + "---" + "种类名称:" + categoryName + "---" + "详细种类名称:" + categoryDetailName);

		// 根据种类id查询所有详细分类
		List<CategoryDetail> allCatDetailList = categoryDetailService.findProductDetail();
		Map<CategoryDetail, List<Product>> map = new LinkedHashMap<CategoryDetail, List<Product>>();

		// 遍历详细分类下的所有书籍
		for (CategoryDetail categoryDetail : allCatDetailList) {
			// 根据详细分类id查询该分类下的所有产品
			List<Product> list = productService.findProdByCatDetailId(categoryDetail.getId());
			map.put(categoryDetail, list);
		}
		req.setAttribute("map", map);

		// 根据种类id查询该种类下的所有产品
		List<Product> cateProdList = new ArrayList<Product>();
		cateProdList = productService.findProdByCatId(categoryId);

		for (Product product : cateProdList) {

			
//			 //通过产品id查询该产品所属的详细种类 CategoryDetail
//			  categoryDetail=categoryDetailService.findProductDetailById(String
//			  .valueOf(product.getId())); //根据产品详细种类id获取产品种类id String
//			  category_id = String.valueOf(categoryDetail.getId());
//			  //通过种类id查询种类 CategoryService categoryService=new
//			  CategoryServiceImpl(); Category
//			  category=categoryService.findCategoryById(category_id);
//			  categoryDetail.setCategory(category);
//			  
//			  product.setCate_detail(categoryDetail);
			 

			System.out.println("该分类下的所有产品:" + product);
		}
		req.setAttribute("cateProdList", cateProdList);
		req.setAttribute("categoryName", categoryName);
		req.setAttribute("categoryDetailName", categoryDetailName);
		req.getRequestDispatcher("/store/list.jsp").forward(req, resp);
	}

	/**
	 * 产品添加进购物车
	 */
	@RequestMapping("/addCart")
	public void addCart(String prod_id, String number, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");

		Product product = productService.findProdById(prod_id);
		System.out.println("添加到购物车的产品：" + product);

		if (product != null) {
			// 判断map是否已经包含该product
			if (cartmap.containsKey(product)) {// 之前添加过购物车,数量加
				cartmap.put(product, cartmap.get(product) + Integer.parseInt(number));
			} else {// 之前未添加过购物车,数量为加入购物车时传过来的数量
				cartmap.put(product, Integer.parseInt(number));
			}

			System.out.println("cartmap:-----------" + cartmap);

			// 重定向购物车页面
			response.sendRedirect("shopCart.jsp");
		}
	}

	/**
	 * 修改购物车产品数量
	 */
	@RequestMapping("/changCartProd")
	public void ChangCartProd(String prod_id, String buyNnum, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("修改的商品id：" + prod_id + "---" + "修改的商品数量：" + buyNnum);

		Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");
		Product product = productService.findProdById(prod_id);
		System.out.println("输入框修改数量的产品:" + product);
		// 修改商品数量
		cartmap.put(product, Integer.parseInt(buyNnum));

		System.out.println("修改数量后cartmap:" + "------------" + cartmap);

		// 重定向购物车页面
		response.sendRedirect("shopCart.jsp");
	}
	
	/**
	 * 删除购物车产品
	 */
	@RequestMapping("/delCartProd")
	public void delCartProd(String id,HttpServletRequest req,HttpServletResponse resp) throws Exception{
		
		System.out.println("要删除的商品id:"+id);
		Product product = productService.findProdById(id);
		
		System.out.println("要删除的产品："+product);
		
		Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
		cartmap.remove(product);
		
		//重定向购物车
		resp.sendRedirect("shopCart.jsp");
	}
	
	/**
	 * viewBook.jsp页面
	 */
	@RequestMapping("/prodInfor")
	public String  ProdInfo(String id,HttpServletResponse response,HttpServletRequest request) throws Exception{

	/*	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		productService=(ProductService) applicationContext.getBean("ProductService");
		categoryDetailService=(CategoryDetailService) applicationContext.getBean("CategoryDetailService");
		categoryService=(CategoryService) applicationContext.getBean("CategoryService");*/
		
		Product product = productService.findProdById(id);

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
		//request.getRequestDispatcher("/viewBook.jsp").forward(request, response);
		return "viewBook";
	}
}
