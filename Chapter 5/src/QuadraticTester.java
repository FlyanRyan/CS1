public class QuadraticTester
{
	public static void main(String[] args)
	{
		double[] aIn = {2,5,16};
		double[] bIn = {20,65,180};
		double[] cIn = {5,8,22};
		
		Quadratic q = new Quadratic();
		
		for(int i = 0; i < aIn.length; i++)
			q.getRoots(aIn[i], bIn[i], cIn[i]);
	}
}