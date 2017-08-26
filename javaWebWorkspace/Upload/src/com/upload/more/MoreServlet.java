package com.upload.more;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/more")
public class MoreServlet extends HttpServlet {
	//fileupload 工具类使用详解
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1 创建配置工厂=> 有参的构造可以 直接设置下面两个配置
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 1.1 设置文件上传临时目录 => 默认位置 => tomcat/temp
		factory.setRepository(new File("i://upload"));
		// 1.2 设置文件写入硬盘的缓冲区大小=>默认值=>10k
		factory.setSizeThreshold(10240);
		// 2 根据配置工厂创建解析器(解析request对象)
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 2.1 判断当前请求是否是多段式提交
		upload.isMultipartContent(req);
		// 2.2 设置多段中每段 段头 在解析时,使用什么码表解码 => 当段头中出现中文时,一定要调用该方式指定段头码表
		upload.setHeaderEncoding("UTF-8");//解决文件名称乱码
		// 2.3 设置文件最大上传大小 (单位:字节)
		upload.setSizeMax(1024 * 1024 * 10); // 单次请求,总上传大小限制 10兆
		upload.setFileSizeMax(1024 * 1024);// 每个文件上传段,大小限制 1兆
		List<FileItem> list = null;
		try {
			// 2.4 解析request,将每个分段中的内容封装到FileItem中
			list = upload.parseRequest(req);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		if (list != null) {
			for (FileItem item : list) {
				// 3.1 item 判断当前分段是否是普通表单段
				boolean flag = item.isFormField();
				// 普通段
				// 3.2获得 表单提交的键.(input元素,name属性的值)
				String fname = item.getFieldName();
				// 3.3 返回文件名称
				String name = item.getName();
				// 3.4 获得文件上传中的正文
				// item.getInputStream();
				// 3.5 以字符串形式返回段体中的内容 注意:文件上传段不建议使用该方法.
				String content = item.getString("utf-8");//解决文件里面内容乱码
				// 3.6 删除上传的临时文件
				item.delete();
				System.out.println("是否是普通表单提交:" + flag + ",表单提交的键:" + fname + ",文件名称:" + name + ",文件内容:" + content);
			}
		}

	}
}
