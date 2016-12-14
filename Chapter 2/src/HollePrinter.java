public class HollePrinter {

	public static void main (String [] args)
	{
		String s = "Hello, World";
		
		s = s.replace('o', 'z');
		System.out.println(s);
		
		s = s.replace('e', 'o');
		System.out.println(s);
		
		s = s.replace('z', 'e');
		System.out.println(s);

	}

}
