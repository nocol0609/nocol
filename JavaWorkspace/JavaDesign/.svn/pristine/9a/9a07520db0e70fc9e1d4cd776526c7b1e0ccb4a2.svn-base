package com.strategy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义策略一实现策略接口
public class StrategyOne implements ComputableStrategy {

	@Override
	public double computableScore(double[] a) {//计算数组a的元素的代数平均值
		// TODO Auto-generated method stub
		double Score = 0, Sum = 0;
		for (int i = 0; i < a.length; i++) {
			Sum += a[i];
		}
		Score = Sum / a.length;

		return Score;
	}

}
