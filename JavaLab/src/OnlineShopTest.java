abstract class OnlineShop {
	public OnlineShop() {
		System.out.println("online shopping is initited...");
	}

	public void selectGoods() {
		System.out.println("Items can be selected through www.shop.com");
	}

	public abstract void payment();

	public void shipment() {
		System.out.println("shipment is done through dtdc courier");
	}
}

class CreditCardShops extends OnlineShop {
	public void payment() {
		System.out.println("Credit card transactions are allowed");
	}
}

class CashShops extends OnlineShop {
	public void payment() {
		System.out.println("Cash transactions are only allowed..");
	}
}

public class OnlineShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCardShops shop1 = new CreditCardShops();
		shop1.selectGoods();
		shop1.payment();
		shop1.shipment();

		CashShops shop2 = new CashShops();
		shop2.selectGoods();
		shop2.payment();
		shop2.shipment();

	}

}