package overloadingAndOverriding;

public class TestOvld {

	public static void main(String[] args) {
		CalulateExp ce = new CalulateExp();
		
		ce.example(0);
		ce.example(3.0, 3.0);
		ce.example(1, 1);
		
		OverrideTest ot = new CalulateExp();
		
		ot.print();
		
	}

}

/*
 * 
 * 
 * 
 * 
 * 
 */
