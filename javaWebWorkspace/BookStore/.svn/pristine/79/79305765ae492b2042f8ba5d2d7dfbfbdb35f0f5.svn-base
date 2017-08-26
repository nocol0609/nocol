package com.nocol.Web.Listener;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.nocol.Bean.Category;
import com.nocol.Bean.CategoryDetail;
import com.nocol.Bean.PriceRank;
import com.nocol.Bean.Product;
import com.nocol.Bean.Publish;
import com.nocol.Service.CategoryDetailService;
import com.nocol.Service.CategoryService;
import com.nocol.Service.PriceRankService;
import com.nocol.Service.ProductService;
import com.nocol.Service.PublishService;
import com.nocol.Service.Impl.CategoryDetailServiceImpl;
import com.nocol.Service.Impl.CategoryServiceImpl;
import com.nocol.Service.Impl.PriceRankServiceImpl;
import com.nocol.Service.Impl.ProductServiceImpl;
import com.nocol.Service.Impl.PublishServiceImpl;

public class MyApplicationListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		CategoryService categoryService = new CategoryServiceImpl();
		ProductService productService = new ProductServiceImpl();
		CategoryDetailService categoryDetailService = new CategoryDetailServiceImpl();
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
		PriceRankService priceRankService=new PriceRankServiceImpl();
		List<PriceRank> priceList=priceRankService.findAllPriceRank();
		for (PriceRank priceRank : priceList) {
			System.out.println("所有价格区间："+priceRank);
		}
		event.getServletContext().setAttribute("priceList", priceList);
		
		//查询所有出版社
		PublishService publishService=new PublishServiceImpl();
		List<Publish> publishList=publishService.findAllPublish();
		for (Publish publish : publishList) {
			System.out.println("所有出版社:"+publish);
		}
		event.getServletContext().setAttribute("publishList", publishList);
	}
}
