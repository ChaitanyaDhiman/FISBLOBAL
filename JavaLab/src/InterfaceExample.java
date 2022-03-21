interface Shop{
	int x=10;  
	void selectGoods();
	void payment();
	public abstract void shipment(); //by default public abstract.
	
}

class ManualShops implements Shop{

	@Override
	public void selectGoods() {
		// TODO Auto-generated method stub
		System.out.println("Goods are to be selected from shop only");
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment is through cash only");
		
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("Goods should carry on your own");
		
	}
	
}

class CreditDebitShops implements Shop{

	@Override
	public void selectGoods() {
		// TODO Auto-generated method stub
		System.out.println("Goods can be selected through www.shop.com");
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Debit or Credit cards are accepted..");
		
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("It can be done through dtdc ");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditDebitShops shop1 = new CreditDebitShops();
		shop1.selectGoods();
		shop1.payment();
		shop1.shipment();
		
		ManualShops shop2 = new ManualShops();
		shop2.selectGoods();
		shop2.payment();
		shop2.shipment();

	}

}