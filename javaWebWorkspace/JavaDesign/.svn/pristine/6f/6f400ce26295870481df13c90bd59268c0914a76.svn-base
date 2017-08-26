package com.nocol.pattern.behavior.Interpreter;

//测试�?
public class Test {  
  
    public static void main(String[] args) {  
  
        // 计算9+2-8的�??  
        int result = new Minus().interpret(new Context(
        		new Plus().interpret(new Context(9, 2)), 8));
        //相当�?:new Minus().interpret(new Context(11, 8));
        System.out.println(result);  
    }  
}  
