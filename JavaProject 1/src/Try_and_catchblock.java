import java.util.Scanner;

public class Try_and_catchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=30+4;

		try {
		
		Scanner reader = new Scanner (System.in);

		System.out.println("What product's price do you want to know?");
		String productname=reader.next ();
		
		System.out.println("Product ID in the category");
		int productID=reader.nextInt ();
		
		System.out.println("Product color and flavor");
		String flavor=reader.next();
		
		System.out.println("Product price");
		int price=reader.nextInt();
		
		System.out.println("The product is " +productname+ " ProductId is " + productID+ 
							". The flover is" + flavor+ ". Product price is "+price+
							" and with $4 tax the price is "+ a+" in the store");
		
		}
		catch (Exception e) {	
			System.out.println("**need integer value in the price field**");
		}
		finally {
			System.out.println("Thanks for shopping with us");
		}
	
	}
}








