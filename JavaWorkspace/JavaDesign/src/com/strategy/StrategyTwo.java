package com.strategy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义策略二实现策略接口
public class StrategyTwo implements ComputableStrategy {

	@Override
	public double computableScore(double[] a) {// 计算数组a的元素的几何平均数
		// TODO Auto-generated method stub
		double Score = 0, Multi = 1;
		for (int i = 0; i < a.length; i++) {
			Multi = Multi * a[i];
		}
		Score = Math.pow(Multi, 1.0 / (a.length));
		return Score;
	}
}
