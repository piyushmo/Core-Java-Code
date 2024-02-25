abstract class Product implements Service{
	public void packing(){                               //interface
		System.out.println("Every Product Packaging");
	}
	public void on(){                                  //concreate mathod
		System.out.println(".....Power On....");
	}
	public void off(){                                //concrete method
		System.out.println(".....Power Off.....");
	}
	public void customerServices(){                  //interface
		System.out.println("Repairing Services Center For product");
	}
	abstract void modelNo();
	abstract void size();
	abstract void color();
	abstract void weight();
}