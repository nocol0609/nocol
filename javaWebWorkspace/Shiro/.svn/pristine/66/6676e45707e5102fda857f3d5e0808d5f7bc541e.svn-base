package com.shiro.md5;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

/**
 * 测试Md5加密
 * 
 * @author Nocol
 *
 */
public class Md5Test {
	@Test
	public void testMd5() {

		// 原始密码
		String source = "123";

		// 盐
		String salt = "abcd";

		// 散列的次数
		int hashIterations = 1;

		// 散列1次：79cfeb94595de33b3326c06ab1c7dbda
		// 散列2次：dbdaabb80c9aac1288768ff017acf1a0

		/**
		 * 第一个参数：明文，原始密码
		 * 第二个参数：盐，通过使用随机数 
		 * 第三个参数：散列的次数，比如散列两次，相当于md5(md5(''))-----不同散列次数加密后密码不一样
		 */
		Md5Hash md5Hash = new Md5Hash(source, salt, hashIterations);

		// 获取加密后的密码
		String password = md5Hash.toString();
		System.out.println("经散列后加密后的密码：" + password);

		// 用shiro提供的另一种构造方法
		// 第一个参数指明用什么散列算法
		SimpleHash simpleHash = new SimpleHash("md5", source, salt, hashIterations);
		System.out.println("simphash加密后：" + simpleHash.toString());
		// 79cfeb94595de33b3326c06ab1c7dbda
	}
	
	
	@Test
	public void testSimpleHash(){
		
		
		System.out.println("======================");
		
		SimpleHash simpleHash=new SimpleHash("sha1","123","user",1);
		System.out.println("user为盐加密明文123："+simpleHash); //6ad14ba9986e3615423dfca256d04e3f
		
		simpleHash=new SimpleHash("sha1","123","admin",1);
		System.out.println("admin为盐加密明文123："+simpleHash); //0192023a7bbd73250516f069df18b500
		
	}
	
}
