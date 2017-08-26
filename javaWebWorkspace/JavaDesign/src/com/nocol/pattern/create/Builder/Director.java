package com.nocol.pattern.create.Builder;

//Director�?(导演)
//指导如何具体的创造电�?
public class Director {
	private ComputerBuilder builder;     
    public Director(ComputerBuilder builder) {     
        this.builder = builder;     
    }    
    //用户自定义的自�?�顺�?
    public void construct() {
    	
    	builder.buildCPU();
    	builder.buildMemory();
    	builder.buildMainboard();
    }
}
