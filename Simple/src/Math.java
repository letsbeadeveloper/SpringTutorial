
public class Math {
	
	public void calculation(int a, int b ,int c){
		
	
		if (Calculator.addstatic(a, b)==Calculator.addstatic(b, c))
		{
			System.out.println("equal");
		}
		
	}
	public static void main(String[] args) {
		Math m = new Math();
		m.calculation(1,2, 1);
	}

}
