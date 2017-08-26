package Test;
/*package test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import javax.servlet.ServletInputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Test1 {
	//private static Log log = LogFactory.getLog(Test1.class);

	//public static HashMap uploadFile(ServletInputStream sis, String encoding, int length, String upLoadPath)
			//throws IOException {
		HashMap paramMap = new HashMap();
		boolean isFirst = true;
		String boundary = null;// 分界符
		byte[] tmpBytes = new byte[4096];// tmpBytes用于存储每行读取到的字节。
		int[] readBytesLength = new int[1];// 数组readBytesLength中的元素i[0]，用于保存readLine()方法中读取的实际字节数。
		int readStreamlength = 0;// readStreamlength用于记录已经读取的流的长度。
		//String tmpString = null;
		//tmpString = readLine(tmpBytes, readBytesLength, sis, encoding);
		readStreamlength = readStreamlength + readBytesLength[0];
		while (readStreamlength < length) {
			if (isFirst) {
				//boundary = tmpString;
				isFirst = false;
			}
			//if (tmpString.equals(boundary)) {
				String contentDisposition = readLine(tmpBytes, readBytesLength, sis, encoding);
				readStreamlength = readStreamlength + readBytesLength[0];
				String contentType = readLine(tmpBytes, readBytesLength, sis, encoding);
				readStreamlength = readStreamlength + readBytesLength[0];
				// 当时上传文件时content-Type不会是null
				if (contentType != null && contentType.trim().length() != 0) {
					String paramName = getPramName(contentDisposition);
					String fileName = getFileName(getFilePath(contentDisposition));
					paramMap.put(paramName, fileName);
					// 跳过空格行
					readLine(tmpBytes, readBytesLength, sis, encoding);
					readStreamlength = readStreamlength + readBytesLength[0];
					if (fileName != null && fileName.trim().length() != 0) {
						fileName = upLoadPath + fileName;
						// 开始读取数据
						byte[] cash = new byte[4096];
						int flag = 0;
						FileOutputStream fos = new FileOutputStream(fileName);
						tmpString = readLine(tmpBytes, readBytesLength, sis, encoding);
						readStreamlength = readStreamlength + readBytesLength[0];
						while (tmpString.indexOf(boundary.substring(0, boundary.length() - 2)) == -1) {
							for (int j = 0; j < readBytesLength[0]; j++) {
								cash[j] = tmpBytes[j];
							}
							flag = readBytesLength[0];
							tmpString = readLine(tmpBytes, readBytesLength, sis, encoding);
							readStreamlength = readStreamlength + readBytesLength[0];
							if (tmpString.indexOf(boundary.substring(0, boundary.length() - 2)) == -1) {
								fos.write(cash, 0, flag);
								fos.flush();
							} else {
								fos.write(cash, 0, flag - 2);
								fos.flush();
							}
						}
						fos.close();
					} else {
						// 跳过空格行
						readLine(tmpBytes, readBytesLength, sis, encoding);
						readStreamlength = readStreamlength + readBytesLength[0];
						// 读取分界符或者结束符
						tmpString = readLine(tmpBytes, readBytesLength, sis, encoding);
						readStreamlength = readStreamlength + readBytesLength[0];
					}
				} // 当不是长传文件时
				else {
					String paramName = getPramName(contentDisposition);
					String value = readLine(tmpBytes, readBytesLength, sis, encoding);
					// 去掉回车换行符(最后两个字节)
					byte[] valueByte = value.getBytes(encoding);
					value = new String(valueByte, 0, valueByte.length - 2, encoding);
					readStreamlength = readStreamlength + readBytesLength[0];
					paramMap.put(paramName, value);
					tmpString = readLine(tmpBytes, readBytesLength, sis, encoding);
					readStreamlength = readStreamlength + readBytesLength[0];
				}
			}
		}
		sis.close();
		return paramMap;
	}

	private static String readLine(byte[] bytes, int[] index, ServletInputStream sis, String encoding) {
		try {
			index[0] = sis.readLine(bytes, 0, bytes.length);// readLine()方法把读取的内容保存到bytes数组的第0到第bytes.length处，返回值是实际读取的
															// 字节数。
			if (index[0] < 0) {
				return null;
			}
		} catch (IOException e) {
			//log.error("read line ioexception");
			return null;
		}
		if (encoding == null) {
			return new String(bytes, 0, index[0]);
		} else {
			try {
				return new String(bytes, 0, index[0], encoding);
			} catch (UnsupportedEncodingException ex) {
				//log.error("Unsupported Encoding");
				return null;
			}
		}
	}

	private static String getPramName(String contentDisposition) {  
        String s = contentDisposition.substring(contentDisposition.indexOf("name="+"") + 6);  
        s = s.substring(0, s.indexOf('"'));  
        return s;  
	}

	private static String getFilePath(String contentDisposition) {  
        String s = contentDisposition.substring(contentDisposition.indexOf("filename="+"") + 10);  
        s = s.substring(0, s.indexOf('"'));  
        return s;  
	}

	private static String getFileName(String filePath) {  
        String rtn = null;  
        if (filePath != null) {  
        	int index = filePath.lastIndexOf("/");//根据name中包不包含/来判断浏览器的类型。
        	if (index != -1)//包含/，则此时可以判断文件由火狐浏览器上传
            {  
                rtn = filePath.substring(index + 1);//获得文件名
            } else//不包含/,可以判断文件由ie浏览器上传。
            {  
                index = filePath.lastIndexOf("/");
                if (index != -1) {  
                    rtn = filePath.substring(index + 1);//获得文件名
                } else {  
                    rtn = filePath;  
                }  
            }  
        }  
		return rtn;  
    }
}
*/