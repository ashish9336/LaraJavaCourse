class BankAccount 
{
	//encapsulation the balance amount / making 
	private double balance;
    
	public double getBalance()
	{
	return balance;
	}
    
	public void setDeposite(double amount)
	{
	//implement deposite logic here
	this.balance += amount;
	
	}
	
	public void setWithdraw(double amount)
	{
	//implement withdraw logic here
	this.balance -= amount;
	}
}
    class BankAccountDeiver
    {
    
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		System.out.println("balance Initial: " + account.getBalance());
		account.setDeposite(10000);
		System.out.println("Balance after Deposite : " + account.getBalance());
		account.setWithdraw(500);
		//System.out.println("Balance :" + balance );
		System.out.println("Balance after Withdraw : " + account.getBalance());
	}
	
}
