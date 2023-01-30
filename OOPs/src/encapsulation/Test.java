package encapsulation;

//import encap.aa;

public class Test {
	
	public static void main(String[] args) {
		
		Person p=new Person();				// for Person Class
		p.setName("dipali");
		p.setAddress("Pune");
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		
		
/*		aa a=new aa();				// Encapsulate from another package
		a.setId(1);
		a.setName("dip");
		
		System.out.println(a.getId());
		System.out.println(a.getName());
	
*/	
	}

}


/*   
 
 Encapsulation : Encapsulation is mechanism through which we can wrapping the data members
(variables) and data member methods of class into a single unit/entity is called as encapsulation.

Encapsulation =data hiding + abstraction .

Real time example :  Medical Capsul .

How to achieve Encapsulation in java ?

1)Declare data variable as private.
2)Declare method as public

Example : Java class is example of encapsulation.
 java class which has private members and public methods.


Encapsulation =data hiding + abstraction .
Data Hiding : Hiding internal data is nothing but data hiding.

how to achieve data hiding in java?

By declaring variable as private we achieve data hiding in java.
*/