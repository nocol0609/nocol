package cn.briup.pattern.structure.Proxy.CglibProxy;

public class Test {
	public static void main(String[] args) {  
		
        MyCglibProxyFactory factory=new MyCglibProxyFactory();  
        
        //目标对象
        BookService target = new BookService();
        
        //代理对象
        BookService proxy= 
        	(BookService)factory.getInstance(target.getClass());  
        
       // proxy.addBook();  
        proxy.delete();
       // System.out.println(proxy.getClass()); 
    }  
}
