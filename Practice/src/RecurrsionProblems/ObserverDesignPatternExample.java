 package RecurrsionProblems;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

interface CryptoCurrencyListener{
	
	public void increase(int amount);
	
	public void decrease(int amount);
	
	public void updatePrice(String action , int amount , LocalDateTime CurrentTime);
	
	public String getCurrencyCode();
	
	public Integer getPrice();
	
	public List<String> getCommandHistory();
	
	default String getPriceDiscription() {
		return getCurrencyCode() + "=" + getPrice();
	}
		

}

class CryptoCurrencyListenerImpl implements CryptoCurrencyListener{
	
	String CryptoCurrency;
	
	public CryptoCurrencyListenerImpl(String CryptoCurrency) {
		this.CryptoCurrency = CryptoCurrency;
	}

	List<CryptoCurrencyListener> list = new ArrayList<>();
	
	@Override
	public void increase(int amount) {
		// TODO Auto-generated method stub  
		
	}

	@Override
	public void decrease(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePrice(String action, int amount, LocalDateTime CurrentTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrencyCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCommandHistory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

class CryptoCurrencyManager{
	public void registerListener(CryptoCurrencyListener Listener) {
		
	}
	
	public void updatePrice(String cryptoCurrency, String action, int amount, LocalDateTime currentTime) {
		
	}
}
public class ObserverDesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
