public class SortF{
	
	public void Sort(double a, double b, double c){
		if(a < b){
			if(b < c){
				say(a,b,c);
			}else {
				if(a < c){
					say(a,c,b);
				}else{
					say(c,a,b);
				}
			}
		}else{
			if(a < c){
				say(b,a,c);
			} else {
				if(b < c){
					say(b,c,a);
				} else {
					say(c,b,a);
				}
			}
		}
	}
	
	public void say(double a, double b, double c){
		System.out.println("doubles in a ascending order:");
		System.out.println(a + " " + b + " " + c + "\n");
	}
}