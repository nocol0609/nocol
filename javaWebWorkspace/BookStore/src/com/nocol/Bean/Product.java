package com.nocol.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 * 产品
 */
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	// 产品名称
	private String name;
	// 产品价格
	private double price;
	// 付款方式
	private String service_fg;
	// 是否免运费
	private String service_myf;
	// 取货方式eg:自提
	private String service_zt;
	// 退货情况提示
	private String service_th;
	// 产品的版本： 1精装版，2简装版，3收藏版,7原装版等...
	private int version;
	// 产品的库存
	private long stock;
	// 产品的描述信息
	private String description;
	/*
	 * 产品的参数
	 */
	// 产品的作者
	private String writer;
	// 书的页数
	private long pages;
	// 书的唯一标示码
	private String ISBN;
	// 出版时间
	private String publish_date;
	// 产品的特点
	private String feature_images;
	// 产品的图片
	private String images;
	// 产品清单
	private String bill;
	// 产品上架时间
	private String start_date;
	// 产品销售的数量
	private long sale_num;
	// 特推产品 1 普通产品 0，热卖3（最多3件）
	private int flag;
	// 说明,如覆盖什么。。。知识点
	private String explain;
	// 出版社
	private Publish publish;
	// 产品所属的类型
	private CategoryDetail cate_detail;
	// 产品的评价
	private Set<Evaluate> evaluates;
	// 订单项
	private Set<OrderLine> orderlines;
	// 简报
	private Set<Report> reports;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getService_fg() {
		return service_fg;
	}

	public void setService_fg(String service_fg) {
		this.service_fg = service_fg;
	}

	public String getService_myf() {
		return service_myf;
	}

	public void setService_myf(String service_myf) {
		this.service_myf = service_myf;
	}

	public String getService_zt() {
		return service_zt;
	}

	public void setService_zt(String service_zt) {
		this.service_zt = service_zt;
	}

	public String getService_th() {
		return service_th;
	}

	public void setService_th(String service_th) {
		this.service_th = service_th;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Publish getPublish() {
		return publish;
	}

	public void setPublish(Publish publish) {
		this.publish = publish;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getFeature_images() {
		return feature_images;
	}

	public void setFeature_images(String feature_images) {
		this.feature_images = feature_images;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
	}

	public CategoryDetail getCate_detail() {
		return cate_detail;
	}

	public void setCate_detail(CategoryDetail cate_detail) {
		this.cate_detail = cate_detail;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public Set<Evaluate> getEvaluates() {
		return evaluates;
	}

	public void setEvaluates(Set<Evaluate> evaluates) {
		this.evaluates = evaluates;
	}

	public Set<OrderLine> getOrderlines() {
		return orderlines;
	}

	public void setOrderlines(Set<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public long getSale_num() {
		return sale_num;
	}

	public void setSale_num(long sale_num) {
		this.sale_num = sale_num;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public Set<Report> getReports() {
		return reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((bill == null) ? 0 : bill.hashCode());
		result = prime * result + ((cate_detail == null) ? 0 : cate_detail.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((evaluates == null) ? 0 : evaluates.hashCode());
		result = prime * result + ((explain == null) ? 0 : explain.hashCode());
		result = prime * result + ((feature_images == null) ? 0 : feature_images.hashCode());
		result = prime * result + flag;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderlines == null) ? 0 : orderlines.hashCode());
		result = prime * result + (int) (pages ^ (pages >>> 32));
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publish == null) ? 0 : publish.hashCode());
		result = prime * result + ((publish_date == null) ? 0 : publish_date.hashCode());
		result = prime * result + ((reports == null) ? 0 : reports.hashCode());
		result = prime * result + (int) (sale_num ^ (sale_num >>> 32));
		result = prime * result + ((service_fg == null) ? 0 : service_fg.hashCode());
		result = prime * result + ((service_myf == null) ? 0 : service_myf.hashCode());
		result = prime * result + ((service_th == null) ? 0 : service_th.hashCode());
		result = prime * result + ((service_zt == null) ? 0 : service_zt.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + (int) (stock ^ (stock >>> 32));
		result = prime * result + version;
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (bill == null) {
			if (other.bill != null)
				return false;
		} else if (!bill.equals(other.bill))
			return false;
		if (cate_detail == null) {
			if (other.cate_detail != null)
				return false;
		} else if (!cate_detail.equals(other.cate_detail))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (evaluates == null) {
			if (other.evaluates != null)
				return false;
		} else if (!evaluates.equals(other.evaluates))
			return false;
		if (explain == null) {
			if (other.explain != null)
				return false;
		} else if (!explain.equals(other.explain))
			return false;
		if (feature_images == null) {
			if (other.feature_images != null)
				return false;
		} else if (!feature_images.equals(other.feature_images))
			return false;
		if (flag != other.flag)
			return false;
		if (id != other.id)
			return false;
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orderlines == null) {
			if (other.orderlines != null)
				return false;
		} else if (!orderlines.equals(other.orderlines))
			return false;
		if (pages != other.pages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publish == null) {
			if (other.publish != null)
				return false;
		} else if (!publish.equals(other.publish))
			return false;
		if (publish_date == null) {
			if (other.publish_date != null)
				return false;
		} else if (!publish_date.equals(other.publish_date))
			return false;
		if (reports == null) {
			if (other.reports != null)
				return false;
		} else if (!reports.equals(other.reports))
			return false;
		if (sale_num != other.sale_num)
			return false;
		if (service_fg == null) {
			if (other.service_fg != null)
				return false;
		} else if (!service_fg.equals(other.service_fg))
			return false;
		if (service_myf == null) {
			if (other.service_myf != null)
				return false;
		} else if (!service_myf.equals(other.service_myf))
			return false;
		if (service_th == null) {
			if (other.service_th != null)
				return false;
		} else if (!service_th.equals(other.service_th))
			return false;
		if (service_zt == null) {
			if (other.service_zt != null)
				return false;
		} else if (!service_zt.equals(other.service_zt))
			return false;
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		if (stock != other.stock)
			return false;
		if (version != other.version)
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cate_detail=" + cate_detail + "]";
	}
	
}
