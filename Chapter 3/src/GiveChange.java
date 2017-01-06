public class GiveChange
{
	int hundreds, fifties, twenties, tens, fives, ones;
	int dollars;
	
	double price, cash;
	
	String out;
	
	public GiveChange()
	{
		this.price= 0;
		this.cash= 0;
		this.hundreds= 0;
		this.fifties=0 ;
		this.twenties=0 ;
		this.tens= 0;
		this.fives= 0;
		this.ones= 0;		 
	}

	public void GiveChange(double price, double cash)
	{
		this.price = price;
		this.cash = cash;
		
		 this.out= "";
		 makedollars();
	}
	public void makedollars()
	{
		dollars= (int) price;
	}
	public String toString()
	{
		out += "$" + cash + " given The price is $" + price;
		out += "\nChange should be $" + (cash - price) + "\n";
		out += dollars;
		
		return out;
	}
}