public class SortSTester
{
	
	public static void main(String[] args)
	{
		String[] a = {"dog", "Harambe", "Purple", "Hawaii"};
		String[] b = {"kitteh", "Donald", "violet", "California"};
		String[] c = {"wallabee", "Govinator", "Pink", "Potato"};
		
		SortS sort = new SortS();
		
		for(int i = 0; i < a.length; i++)
		{
			sort.Sort(a[i], b[i], c[i]);
		}
	}
}