public class SortFTester{
	
	public static void main(String[] args){
		
		double[] aIn = { 1, 2, 5, 22, 30, 42};
		double[] bIn = { 3, 13, 2, 7, 42, 24};
		double[] cIn = { 9, 6, 12, 17, 4, 8};
		
		SortF sort = new SortF();
		
		for(int i = 0; i < aIn.length; i++){
			sort.Sort(aIn[i], bIn[i], cIn[i]);
		}
	}
}