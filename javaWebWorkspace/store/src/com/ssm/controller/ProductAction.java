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
 * ��Ʒ������
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
	 * list.jspҳ���Ʒ
	 */
	@RequestMapping("/prodList")
	public void fingAllPro(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String categoryName = req.getParameter("categoryName");
		String categoryId = req.getParameter("categoryId");
		String categoryDetailName = req.getParameter("categoryDetailName");
		System.out.println(
				"����id:" + categoryId + "---" + "��������:" + categoryName + "---" + "��ϸ��������:" + categoryDetailName);

		// ��������id��ѯ������ϸ����
		List<CategoryDetail> allCatDetailList = categoryDetailService.findProductDetail();
		Map<CategoryDetail, List<Product>> map = new LinkedHashMap<CategoryDetail, List<Product>>();

		// ������ϸ�����µ������鼮
		for (CategoryDetail categoryDetail : allCatDetailList) {
			// ������ϸ����id��ѯ�÷����µ����в�Ʒ
			List<Product> list = productService.findProdByCatDetailId(categoryDetail.getId());
			map.put(categoryDetail, list);
		}
		req.setAttribute("map", map);

		// ��������id��ѯ�������µ����в�Ʒ
		List<Product> cateProdList = new ArrayList<Product>();
		cateProdList = productService.findProdByCatId(categoryId);

		for (Product product : cateProdList) {

			
//			 //ͨ����Ʒid��ѯ�ò�Ʒ��������ϸ���� CategoryDetail
//			  categoryDetail=categoryDetailService.findProductDetailById(String
//			  .valueOf(product.getId())); //���ݲ�Ʒ��ϸ����id��ȡ��Ʒ����id String
//			  category_id = String.valueOf(categoryDetail.getId());
//			  //ͨ������id��ѯ���� CategoryService categoryService=new
//			  CategoryServiceImpl(); Category
//			  category=categoryService.findCategoryById(category_id);
//			  categoryDetail.setCategory(category);
//			  
//			  product.setCate_detail(categoryDetail);
			 

			System.out.println("�÷����µ����в�Ʒ:" + product);
		}
		req.setAttribute("cateProdList", cateProdList);
		req.setAttribute("categoryName", categoryName);
		req.setAttribute("categoryDetailName", categoryDetailName);
		req.getRequestDispatcher("/store/list.jsp").forward(req, resp);
	}

	/**
	 * ��Ʒ��ӽ����ﳵ
	 */
	@RequestMapping("/addCart")
	public void addCart(String prod_id, String number, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");

		Product product = productService.findProdById(prod_id);
		System.out.println("��ӵ����ﳵ�Ĳ�Ʒ��" + product);

		if (product != null) {
			// �ж�map�Ƿ��Ѿ�������product
			if (cartmap.containsKey(product)) {// ֮ǰ��ӹ����ﳵ,������
				cartmap.put(product, cartmap.get(product) + Integer.parseInt(number));
			} else {// ֮ǰδ��ӹ����ﳵ,����Ϊ���빺�ﳵʱ������������
				cartmap.put(product, Integer.parseInt(number));
			}

			System.out.println("cartmap:-----------" + cartmap);

			// �ض����ﳵҳ��
			response.sendRedirect("shopCart.jsp");
		}
	}

	/**
	 * �޸Ĺ��ﳵ��Ʒ����
	 */
	@RequestMapping("/changCartProd")
	public void ChangCartProd(String prod_id, String buyNnum, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("�޸ĵ���Ʒid��" + prod_id + "---" + "�޸ĵ���Ʒ������" + buyNnum);

		Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");
		Product product = productService.findProdById(prod_id);
		System.out.println("������޸������Ĳ�Ʒ:" + product);
		// �޸���Ʒ����
		cartmap.put(product, Integer.parseInt(buyNnum));

		System.out.println("�޸�������cartmap:" + "------------" + cartmap);

		// �ض����ﳵҳ��
		response.sendRedirect("shopCart.jsp");
	}
	
	/**
	 * ɾ�����ﳵ��Ʒ
	 */
	@RequestMapping("/delCartProd")
	public void delCartProd(String id,HttpServletRequest req,HttpServletResponse resp) throws Exception{
		
		System.out.println("Ҫɾ������Ʒid:"+id);
		Product product = productService.findProdById(id);
		
		System.out.println("Ҫɾ���Ĳ�Ʒ��"+product);
		
		Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
		cartmap.remove(product);
		
		//�ض����ﳵ
		resp.sendRedirect("shopCart.jsp");
	}
	
	/**
	 * viewBook.jspҳ��
	 */
	@RequestMapping("/prodInfor")
	public String  ProdInfo(String id,HttpServletResponse response,HttpServletRequest request) throws Exception{

	/*	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		productService=(ProductService) applicationContext.getBean("ProductService");
		categoryDetailService=(CategoryDetailService) applicationContext.getBean("CategoryDetailService");
		categoryService=(CategoryService) applicationContext.getBean("CategoryService");*/
		
		Product product = productService.findProdById(id);

		// ͨ����Ʒid��ѯ�ò�Ʒ��������ϸ����
		CategoryDetail categoryDetail = categoryDetailService.findProductDetailById(id);
		// ���ݲ�Ʒ��ϸ����id��ȡ��Ʒ����id
		String category_id = String.valueOf(categoryDetail.getId());
		// ͨ������id��ѯ����
		Category category = categoryService.findCategoryById(category_id);
		System.out.println("��Ʒ���ࣺ" + category);
		categoryDetail.setCategory(category);

		System.out.println("�����ϸ����:" + categoryDetail);
		product.setCate_detail(categoryDetail);

		System.out.println("���ҵ����鼮��" + product);

		if (product != null) {
			request.setAttribute("product", product);
		}
		//request.getRequestDispatcher("/viewBook.jsp").forward(request, response);
		return "viewBook";
	}
}
