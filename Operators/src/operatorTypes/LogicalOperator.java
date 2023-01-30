package operatorTypes;

public class LogicalOperator {
	public static void main(String[] args) {
		
		System.out.println("Logical AND(&&) Operator");
		System.out.println( (10>5) && (11<22) );
		System.out.println( (10<5) && (11>22) );
		System.out.println( (10>5) && (11>22) );
		System.out.println( (10<5) && (11<22) );
		
		System.out.println("Logical OR(||) Operator");
		System.out.println( (10>5) || (11<22) );
		System.out.println( (10<5) || (11>22) );
		System.out.println( (10>5) || (11>22) );
		System.out.println( (10<5) || (11<22) );
		
		System.out.println("Logical Not(!) Operator");
		System.out.println(!(10>5));
		System.out.println(!(10<5));
	}

}
