package AccountUtil;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * �����ʲ�������
 * @author ljrxxx
 *
 */
public class assetsCal {
	public BigDecimal totalAssets(ArrayList<BigDecimal> assetDetail){
		BigDecimal total = null;
		for(int i=0;i<assetDetail.size();i++){
			total = total.add(assetDetail.get(i));
		}
		return total;
	}
}
