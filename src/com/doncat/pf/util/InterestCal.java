package com.doncat.pf.util;

import java.math.BigDecimal;

/**
 * ���ʼ�����
 * @author ljrxxx
 *
 */
public class InterestCal {
	
	/**
	 * ��������
	 * @param p ����
	 * @param i ������
	 * @param n ����(��)
	 * @return f ������ֵ
	 */
	public BigDecimal simpleInterCal(BigDecimal p,double i,int n){
		BigDecimal factor = new BigDecimal(1+(i*0.01/365)*n);
		BigDecimal f = p.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return f;
	}
	
	/**
	 * ��������
	 * @param p ����
	 * @param i ������
	 * @param n ��Ϣ����(��80�죬3���£�2���)
	 * @return f ������ֵ
	 * �����ļ��㹫ʽ�ǣ�F=P��1+i��^n
	 */
	public BigDecimal compoundInterCal(BigDecimal p,double i,int n){
		BigDecimal factor = new BigDecimal(Math.pow(1+i*0.01/365,n));
		BigDecimal f = p.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return f;
	}
	
}
