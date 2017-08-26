package com.nocol.pattern.behavior.Memento;

//测试�?
public class Test {  
  
    public static void main(String[] args) {  
          
        // 创建原始�?  
        Original origi = new Original("egg");  
  
        // 创建备忘�?  
        Storage storage = new Storage(origi.createMemento());  
  
        // 修改原始类的状�??  
        System.out.println("初始化状态为�?" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("修改后的状�?�为�?" + origi.getValue());  
  
        // 回复原始类的状�??  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("恢复后的状�?�为�?" + origi.getValue());  
    }  
}  
