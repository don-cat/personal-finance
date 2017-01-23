package AccountUtil;

import java.math.BigDecimal;

/**
 * 利率计算器
 * @author ljrxxx
 *
 */
public class InterestCal {
	
	/**
	 * 
	 * @param capital 本金
	 * @param interest 利率
	 * @param term 期限
	 * @return finalValue 单利终值
	 */
	public BigDecimal simpleInterCal(BigDecimal capital,double interest,int term){
		BigDecimal factor = new BigDecimal(1+(interest*0.01/365)*term);
		BigDecimal finalValue = capital.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return finalValue;
	}
	
	/**
	 * 
	 * @param capital 本金
	 * @param interest 利率
	 * @param term 期限
	 * @return finalValue 复利终值
	 */
	public BigDecimal compoundInterCal(BigDecimal capital,double interest,int term){
		BigDecimal factor = new BigDecimal(Math.pow(1+interest*0.01/365,term));
		BigDecimal finalValue = capital.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return finalValue;
	}
}
