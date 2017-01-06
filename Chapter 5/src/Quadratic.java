public class Quadratic 
{
	
	double root1, root2;
	
	public void getRoots(double a, double b ,double c)
	{
		root1 = (-b + Math.pow(b*b - 4*a*c, 0.5)) / (2*a);
		root2 = (-b - Math.pow(b*b - 4*a*c, 0.5)) / (2*a);
		
		System.out.printf("Equation is : %.2fx^2 + %.2fx +%.2f \n", a, b, c);
		System.out.printf("Root1 = %.2f, Root2 = %.2f \n\n", root1, root2);
		
		//System.out.print(Math.pow(b*b - 4*a*c, 0.5));
		
	}
}