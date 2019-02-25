package overloadingAndOverriding;

public class CalulateExp extends OverrideTest{
	
	public void example (int a,int b) {
		System.out.println("a:"+ a+"b:"+ b);
	}
	
	public void example(int a) {
		System.out.println("a:"+ a);
	}
	public void example (double a,double b) {

		System.out.println("a:"+ a+"b:"+ b);
	}
	
	@Override
	public void print() {
		System.out.println("Child");
	}
}
