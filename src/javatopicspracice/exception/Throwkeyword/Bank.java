package javatopicspracice.exception.Throwkeyword;

public class Bank {

	private int totalbalance;

	public Bank(int initialdeposit) {
		totalbalance = initialdeposit;
	}

	public void checkbalance() {
		System.out.println("your total balance is  " + totalbalance);
	}

	public void withdrawamount(int amounttowithdraw) throws WithDrawAmountExceptions {
		if (amounttowithdraw > totalbalance) {
			throw new WithDrawAmountExceptions("amounttowithdraw is exceeding the totalbalence");
		}
		if (amounttowithdraw > 40000) {
			throw new WithDrawAmountExceptions("amounttowithdraw is exceeding daily withdraw limit");
		}
		if (amounttowithdraw % 100 != 0) {
			// throw message like you not using the right denomination to withdraw
			throw new WithDrawAmountExceptions("you are not using the right denomination to withdraw amount");

		}
		totalbalance = totalbalance - amounttowithdraw;
		System.out.println("your remaining balance is   " + totalbalance);
	}

	public void cashDeposit(int amounttodeposit) {
		totalbalance = totalbalance + amounttodeposit;
		System.out.println("your total balance is  "+ totalbalance);

	}
     public void onlinemoneytransfor(int amounttotransfer) throws WithDrawAmountExceptions {
    	 if (amounttotransfer > totalbalance) {
 			throw new WithDrawAmountExceptions("amounttowithdraw is exceeding the totalbalence");
 		}
 		if (amounttotransfer > 40000) {
 			throw new WithDrawAmountExceptions("amounttowithdraw is exceeding daily withdraw limit");
 		}
 	 
    	totalbalance= totalbalance-amounttotransfer; 
    	System.out.println("your remaining balance is   " +totalbalance);     }
     
	public static void main(String[] args) throws WithDrawAmountExceptions {
		Bank deepthi = new Bank(5000);
		deepthi.checkbalance();
		deepthi.withdrawamount(5000);
		deepthi.cashDeposit(4000);
		deepthi.onlinemoneytransfor(1000);

	}
}
