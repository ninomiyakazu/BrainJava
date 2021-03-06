package chap06;

class BonusPointAcount extends Account {
	int bonusPoint;
	
	public BonusPointAcount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	@Override
	void deposit(int amount) {
		balance += amount; //super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);
	}
		
}

public class InheritanceExample4 {

	public static void main(String[] args) {
		
		BonusPointAcount obj = new BonusPointAcount("333-33-333333", "김미영", 0, 0);
	    obj.deposit(1000000);
		System.out.println("잔액:" + obj.balance);
		System.out.println("누적포인트:" + obj.bonusPoint);
	}

}
