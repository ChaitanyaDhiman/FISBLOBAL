package Java8;

import java.util.*;
class MyBank{
	String name;
	int balance;
	int withdrawAmount;
	public MyBank(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public int calBalance(int bal,int wAmount) {
		return bal - wAmount;
	}
}

public class WithdrawAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter Bank Balance : ");
		int balance = sc.nextInt();
		MyBank B = new MyBank(name,balance);
		
		System.out.println("Enter Withdraw Amount : ");
		int withdrawAmount = sc.nextInt();
		
		WithdrawTest t = new WithdrawTest();
		int tempAmount = B.calBalance(balance, withdrawAmount);
		try {
			
			t.testBalance(tempAmount);
		}
		catch(MinimumBalanceException e){
			System.out.println(e);
			
		}
		catch(LowBalanceException e) {
			System.out.println(e);
		}
      sc.close();
	}

}
