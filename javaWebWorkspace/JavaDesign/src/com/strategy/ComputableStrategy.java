package com.strategy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义抽象策略接口
public interface ComputableStrategy {
	//计算分数
	public abstract double computableScore(double[] a);
}
