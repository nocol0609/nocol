package com.nocol.Bean;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShopCart implements IShopCart {
	
	private Map<Long,OrderLine> orderlines = new HashMap<Long,OrderLine>();
	
	public void addProduct(Product product) throws Exception{
		System.out.println("进入ShopCart的add()方法！");
		long number = 1;
		long id = product.getId();
		if(orderlines.containsKey(id)) {
			OrderLine orderline = (OrderLine) orderlines.get(id);
			number = orderline.getAmount()+1L;
			orderline.setAmount(number);
		}else {
			OrderLine orderline = new OrderLine();
			orderline.setAmount(new Long(number));
			orderline.setProduct(product);
			orderlines.put(id, orderline);
		}
	}

	public void removeProduct(Integer productid) throws Exception{
		System.out.println("进入ShopCart的removeProduct()方法！");
		//map集合移除订单项
		orderlines.remove(productid);
	}

	public void removeAllProducts() throws Exception{
		System.out.println("进入ShopCart的removeAllProducts()方法！");
		//把map集合全部清空
		orderlines.clear();
	}

	public void updateProduct(Integer productid, Integer number) throws Exception{
		System.out.println("进入ShopCart的updateProduct()方法！");
		OrderLine orderline = orderlines.get(productid);
		orderline.setAmount(number);
	}

	public BigDecimal getTotalPrice() throws Exception{
		System.out.println("进入ShopCart的getTotalPrice()方法！");
		BigDecimal totalPrice = new BigDecimal(0);
		Iterator<OrderLine> iter = getOrderlines();
		//判断下一个值是否有值iter.hasNext()
		while(iter.hasNext()) {
			//获取值
			OrderLine o = (OrderLine) iter.next();
			Product p = o.getProduct();
			BigDecimal sum = new BigDecimal(p.getPrice()*o.getAmount());
			totalPrice = totalPrice.add(sum);    
		}
		return totalPrice;
	}
	//获取迭代器，对map集合的遍历方式
	public Iterator<OrderLine> getOrderlines() throws Exception{
		System.out.println("进入ShopCart的getOrderlines()方法！");
		//orderlines.values()得到所有的value值--》Set集合
		return orderlines.values().iterator();
	}
}
