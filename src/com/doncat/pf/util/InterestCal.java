package com.doncat.pf.util;

import java.math.BigDecimal;

/**
 * 利率计算器
 * @author ljrxxx
 *
 */
public class InterestCal {
	
	/**
	 * 单利计算
	 * @param p 本金
	 * @param i 年利率
	 * @param n 期限(天)
	 * @return f 单利终值
	 */
	public BigDecimal simpleInterCal(BigDecimal p,double i,int n){
		BigDecimal factor = new BigDecimal(1+(i*0.01/365)*n);
		BigDecimal f = p.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return f;
	}
	
	/**
	 * 复利计算
	 * @param p 本金
	 * @param i 年利率
	 * @param n 计息期数(如80天，3个月，2年等)
	 * @return f 复利终值
	 * 复利的计算公式是：F=P（1+i）^n
	 */
	public BigDecimal compoundInterCal(BigDecimal p,double i,int n){
		BigDecimal factor = new BigDecimal(Math.pow(1+i*0.01/365,n));
		BigDecimal f = p.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return f;
	}
	
}
