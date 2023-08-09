package money;

public class AxisBank extends BankInfo{
public void  deposit() {
	System.out.println("deposit 500");
}
	//override
	public static void main(String []args) {
		AxisBank total = new AxisBank();
		total.deposit();
		total.saving();
		total.fixed();
		total.deposit();
	}
	
	
}
