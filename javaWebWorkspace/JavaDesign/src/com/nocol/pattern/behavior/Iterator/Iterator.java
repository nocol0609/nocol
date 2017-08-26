package com.nocol.pattern.behavior.Iterator;

public interface Iterator {  
    //前移  上一个元�?
    public Object previous();  
      
    //后移  下一个元�?
    public Object next();  
    public boolean hasNext();  
      
    //取得第一个元�?  
    public Object first();  
}  