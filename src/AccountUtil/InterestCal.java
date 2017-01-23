package AccountUtil;

import java.math.BigDecimal;

/**
 * ���ʼ�����
 * @author ljrxxx
 *
 */
public class InterestCal {
	
	/**
	 * 
	 * @param capital ����
	 * @param interest ����
	 * @param term ����
	 * @return finalValue ������ֵ
	 */
	public BigDecimal simpleInterCal(BigDecimal capital,double interest,int term){
		BigDecimal factor = new BigDecimal(1+(interest*0.01/365)*term);
		BigDecimal finalValue = capital.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return finalValue;
	}
	
	/**
	 * 
	 * @param capital ����
	 * @param interest ����
	 * @param term ����
	 * @return finalValue ������ֵ
	 */
	public BigDecimal compoundInterCal(BigDecimal capital,double interest,int term){
		BigDecimal factor = new BigDecimal(Math.pow(1+interest*0.01/365,term));
		BigDecimal finalValue = capital.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
		return finalValue;
	}
}
