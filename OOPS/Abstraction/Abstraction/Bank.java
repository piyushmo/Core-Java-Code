abstract class Bank{                             // Abstract class
	public void deposit(){                      // Concrete method
		System.out.println("Deposit");
	}
	public void withdraw(){                     
		System.out.println("Withdraw");
	}
	public void acOpen(){                        
		System.out.println("acOpen");
	}
	
	abstract void time();                        //abstract method
	abstract void uniform();
	abstract void idCardD();
	abstract void location();
}
	
	