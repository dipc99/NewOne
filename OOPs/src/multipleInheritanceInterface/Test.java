package multipleInheritanceInterface;

public class Test implements Printable,Showable{

	@Override
	public void show() {
		System.out.println("This is show Method");
		
	}

	@Override
	public void print() {
		System.out.println("this is print method");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.show();
		t.print();
		
		Showable s=new Test();		
		s.show();	
		
		Printable p=new Test();
		p.print();
		
	}

}
