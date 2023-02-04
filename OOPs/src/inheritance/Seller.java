package inheritance;

public class Seller implements Customer {

	@Override
	public void purchase() {
				//	quantityOfSuger=9;
		System.out.println("Need"+quantityOfSuger+"kg suger");
	}
	
	public static void main(String[] args) {
		Seller s=new Seller();
		s.purchase();
		
		Customer c=new Seller();
		System.out.println(Customer.quantityOfSuger);
		c.purchase();
	}

}
