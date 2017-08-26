package test2;

import java.util.ArrayList;
import java.util.List;

public class SetTest {
    public static void main(String[] args) {
    	addPopLst("1");
    	addPopLst("2");
    	addPopLst("3");
    	addPopLst("4");
    	addPopLst("5");
    	addPopLst("6");
    	for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
    }
    
    private static List<String> lst=new ArrayList<String>();
    /**
     * 	Java用ArrayList实现先进先出的队列通用方法
     * @param newstr
     * @return
     */
    public static List<String> addPopLst(String newstr){
    	if(newstr!=null && !"".equals(newstr)){
    		lst.add(0,newstr);
        	if(lst.size()>5){ //队列满5,移除最开始入队的元素
        		lst.remove(5);
        	}
    	}
    	return lst;
    }
} 