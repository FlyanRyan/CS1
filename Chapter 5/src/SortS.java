public class SortS 
{
	public void Sort(String a, String b, String c)
	{
		if(a.compareTo(b) < 0){
			if(b.compareTo(c) < 0){
			//a, b, c
			s(a,b,c);	
			}else{
				if(a.compareTo(c) < 0){
					//a, c, b
					s(a,c,b);	
				} else {
					//c, a, b
					s(c,a,b);	
				}
			}
		} else {
			if(a.compareTo(c) < 0){
				//b, a, c
					s(b,a,c);
			} else {
				if(b.compareTo(c) < 0){
					//b < a, c < a
					//b, c, a
					s(b,c,a);
				}
				//c, b, a
				s(c,b,a);
			}
		}
	}
	
	public void s(String a, String b, String c)
	{
		System.out.println("Lexographically ascending");
		System.out.println(a +" "+ b + " " + c + " \n" );
	
	}
}
