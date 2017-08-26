package com.spring.web;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 继承JdbcDaoSupport后自动提供setXXXX，注入jdbcTemplate
 * 
 * @author Nocol
 *
 */
public class ProductDao extends JdbcDaoSupport {
	/**
	 * 添加
	 * 
	 * @param product
	 */
	public void add(Product product) {
		String sql = "insert into product values(pro_id.nextVal,?)";
		this.getJdbcTemplate().update(sql, product.getName());
	}

	/**
	 * 删除
	 * 
	 * @param product
	 */
	public void delete(Product product) {
		String sql = "delete from product where id=?";
		this.getJdbcTemplate().update(sql, product.getId());
	}

	/**
	 * 修改
	 * 
	 * @param product
	 */
	public void update(Product product) {
		String sql = "update product set name=? where id=?";
		this.getJdbcTemplate().update(sql, product.getName(), product.getId());
	}

	/**
	 * 简单查询
	 * 
	 * 根据id查询名称（返回的是String类型（object））
	 * 
	 * @param id
	 * @return
	 */
	public String fingNameById(int id) {

		String sql = "select name from product where id=?";
		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	/**
	 * 查询产品数量（返回的是基本数据类型）
	 * 
	 * 如果返回结果 是一个简单值，使用jdbcTemplate 提供 queryForXXX 方法
	 * 
	 * spring 4.2.0后jdbcTemplate中不用queryForLong和queryForInt，全部用queryForObject
	 * 
	 * @return
	 */
	public long fingTotalCount() {
		String sql = "select count(*) from product";
		return this.getJdbcTemplate().queryForObject(sql, long.class);
	}

	/**
	 * 复杂查询
	 * 
	 * @param id
	 * @return
	 */
	public Product findProdById(int id) {
		String sql = "select * from product where id=?";
		return this.getJdbcTemplate().queryForObject(sql, new ProductRowMapper(), id);
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Product> findAllProd() {
		String sql = "select * from product";
		return this.getJdbcTemplate().query(sql, new ProductRowMapper());
	}

	/**
	 * （内部类）结果集封装程序----类似于dbUtils中的beanHaandler、beanListHandler，只不过这里需要自己手动封装
	 * 
	 * 不管是查询一个还是查询多个都可以使用
	 * 
	 * @author Nocol
	 *
	 */
	public class ProductRowMapper implements RowMapper<Product> {

		/**
		 * 只需要关注每行（每一行即为一对象）的封装，无需循环取出对象
		 * 
		 * @param rs
		 *            结果集
		 * @param rowNum
		 *            行号
		 * @return
		 * @throws SQLException
		 */
		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub

			Product product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			return product;
		}

	}
	
	
	
}
