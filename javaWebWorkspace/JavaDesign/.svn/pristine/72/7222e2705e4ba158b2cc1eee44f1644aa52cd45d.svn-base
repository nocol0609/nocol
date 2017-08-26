package com.strategy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义上下文的环境类（Context）
public class Game {

	private ComputableStrategy strategy;
	double Score;

	// 定义使用某种策略的方法
	public void setStrategy(ComputableStrategy strategy) {
		this.strategy = strategy;
	}

	// 获得最终的Score
	public double getScore(double[] a) {
		if (strategy == null) {
			return 0;
		} else {
			Score = strategy.computableScore(a);
		}
		return Score;
	}
}
