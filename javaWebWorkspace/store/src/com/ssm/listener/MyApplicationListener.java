package com.ssm.listener;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.bean.Category;
import com.ssm.bean.CategoryDetail;
import com.ssm.bean.PriceRank;
import com.ssm.bean.Product;
import com.ssm.bean.Publish;
import com.ssm.service.CategoryDetailService;
import com.ssm.service.CategoryService;
import com.ssm.service.PriceRankService;
import com.ssm.service.ProductService;
import com.ssm.service.PublishService;

/**
 * application监听器
 * @author Nocol
 *
 */
public class MyApplicationListener implements ServletContextListener{
	
	private PriceRankService priceRankService;
	private PublishService publishService;
    private CategoryService categoryService;
	private CategoryDetailService categoryDetailService;
    private ProductService productService;
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
		//获取ProductService对象
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		productService=(ProductService) applicationContext.getBean("ProductService");
		categoryDetailService=(CategoryDetailService) applicationContext.getBean("CategoryDetailService");
		categoryService=(CategoryService) applicationContext.getBean("CategoryService");
		publishService=(PublishService)applicationContext.getBean("PublishService");
		priceRankService=(PriceRankService) applicationContext.getBean("PriceRankService");
		
		// 查询所有产品种类
		List<Category> allList = new ArrayList<Category>();
		allList = categoryService.findAllCategory();
		
		event.getServletContext().setAttribute("allList", allList);
		// 查找推荐产品
		List<Product> newList = new ArrayList<Product>();
		newList = productService.findNewProduct(3);
		
		for (Product product : newList) {
			
			//通过产品id查询该产品所属的详细种类
			CategoryDetail categoryDetail=categoryDetailService.findProductDetailById(String.valueOf(product.getId()));
			//根据产品详细种类id获取产品种类id
			String category_id = String.valueOf(categoryDetail.getId());
			//通过种类id查询种类			
			Category category=categoryService.findCategoryById(category_id);
			categoryDetail.setCategory(category);
					
			product.setCate_detail(categoryDetail);
			
			System.out.println("首页展示的推荐图书信息："+product);
			
		}
			event.getServletContext().setAttribute("newList", newList);
		
		// 查找产品详细种类
		LinkedHashMap<Category, ArrayList<CategoryDetail>> map=new LinkedHashMap<Category,ArrayList<CategoryDetail>>();	
		List<CategoryDetail> detailsList=new ArrayList<CategoryDetail>();
		//遍历所有种类及其详细分类
		for (Category category : allList) {
			//通过种类id查询详细分类的名称
			ArrayList<CategoryDetail> detailList= (ArrayList<CategoryDetail>) categoryDetailService.findProdDetailByCateId(category.getId());
			map.put(category, detailList);
		}
		
		event.getServletContext().setAttribute("map", map);
		
/*			//遍历map
		 Set<Category> set=map.keySet();
		 for (Category category : set) {
			 ArrayList<CategoryDetail> detailNameList=map.get(category);
			for (CategoryDetail categoryDetail : detailNameList) {
				System.out.println("详细分类："+category.getName()+"--"+categoryDetail);
			}
		}*/
		
		
		//查询热卖产品
		List<Product> hotList = new ArrayList<Product>();
		hotList = productService.fingHotProductByFlag(1);
		for (Product product : hotList) {
			
			//通过产品id查询该产品所属的详细种类
			CategoryDetail categoryDetail=categoryDetailService.findProductDetailById(String.valueOf(product.getId()));
			//根据产品详细种类id获取产品种类id
			String category_id = String.valueOf(categoryDetail.getId());
			//通过种类id查询种类			
			Category category=categoryService.findCategoryById(category_id);
			categoryDetail.setCategory(category);
					
			product.setCate_detail(categoryDetail);
			System.out.println("热卖商品:"+product);
		}
		event.getServletContext().setAttribute("hotList", hotList);
		
		
		//查询所有价格区间
		List<PriceRank> priceList=priceRankService.findAllPriceRank();
		for (PriceRank priceRank : priceList) {
			System.out.println("所有价格区间："+priceRank);
		}
		event.getServletContext().setAttribute("priceList", priceList);
		
		//查询所有出版社
		List<Publish> publishList=publishService.findAllPublish();
		for (Publish publish : publishList) {
			System.out.println("所有出版社:"+publish);
		}
		event.getServletContext().setAttribute("publishList", publishList);
	}
}
