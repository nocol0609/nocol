package com.strategy;

import java.util.Arrays;


/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义策略三实现策略接口
public class StrategyThree implements ComputableStrategy {

	@Override
	public double computableScore(double[] a) {// 计算数组a中去除最大值个最小值后的代数平均值
		// TODO Auto-generated method stub

		// 将数组a进行排序
		Arrays.sort(a);

		double Score = 0, Sum = 0;
		if (a.length <= 2) {
			return 0;
		} else {
			for (int i = 1; i < a.length - 1; i++) {
				Sum += a[i];
			}
			Score = Sum / (a.length - 2);
		}
		return Score;
	}

}
