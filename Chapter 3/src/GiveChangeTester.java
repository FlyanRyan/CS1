public class GiveChangeTester
{
	public static void main(String[] args)
	{
		
		double price[]= {.99, 5.99, 12.56, 200.59, 56.82, 13.01};
		double cash[]= { 20.00, 10.00, 50.00, 300.00, 60.00, 300.00};
		
		GiveChange gc= new GiveChange();
		
		for ( int i=0; i < price.length; i++)
		{
			gc.GiveChange(price[i], cash[i]);
			System.out.println(gc);
		}
	}
} 