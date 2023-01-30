package multiLevelInheritance;

public class Child extends Child1 {
	public void m2() {
		System.out.println("m2 method of child class");
	}
	
	public static void main(String[] args) {
		Child ch=new Child();
		ch.m1();
		ch.m2();
		ch.m3();
	}

}
