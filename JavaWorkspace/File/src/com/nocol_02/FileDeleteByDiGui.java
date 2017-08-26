package com.nocol_02;

import java.io.File;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 需求：递归删除带内容的目录
 * 
 * 目录我已经给定：demo
 * 
 * 分析： A:封装目录 B:获取该目录下的所有文件或者文件夹的File数组 C:遍历该File数组，得到每一个File对象
 * D:判断该File对象是否是文件夹 是：回到B 否：就删除
 */
public class FileDeleteByDiGui {
	public static void main(String[] args) {
		// 封装目录
		File srcFileFolder = new File("Demo");
		// 写功能实现递归删除
		deleteFileFolder(srcFileFolder);
	}

	private static void deleteFileFolder(File srcFileFolder) {
		// 获取该目录下的所有文件或者文件夹的File数组
		File[] fileArray = srcFileFolder.listFiles();
		// 遍历数组对象
		if (fileArray != null) {
			for (File file : fileArray) {
				if (fileArray != null)
					if (file.isDirectory()) {
						deleteFileFolder(file);
					} else {
						file.delete();
					}
			}
			srcFileFolder.delete();
		}
	}
}
