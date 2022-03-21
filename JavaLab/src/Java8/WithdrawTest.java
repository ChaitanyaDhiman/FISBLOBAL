package Java8;

public class WithdrawTest {

	public void testBalance(int balance) {
		if(balance >0 && balance < 4000)
			throw new MinimumBalanceException();
		else if(balance < 0)
			throw new LowBalanceException();
		else
			System.out.println("Amount Withdrawn , Balance = " + balance);
			
	}

}
