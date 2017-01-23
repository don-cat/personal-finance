package AccountUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * »ãÂÊ¼ÆËãÆ÷
 * @author mamay
 *
 */
public class ExchangeRateCal {
	public void GetExchangeRate() throws IOException {
		URL u = new URL("http://api.k780.com:88/?app=finance.rate&scur=USD&tcur=CNY&appkey={APPKEY}&sign={SIGN}&format=json");
		InputStream in = u.openStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			byte buf[] = new byte[1024];
			int read = 0;
			while((read = in.read(buf))>0){
				out.write(buf, 0, read);
			}
		}finally{
			if (in != null){
				in.close();
			}
		}
		byte b[]=out.toByteArray();
		System.out.println(new String(b,"utf-8"));            
	}
}
