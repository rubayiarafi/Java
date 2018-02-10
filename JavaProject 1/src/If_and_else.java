
public class If_and_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Retail Store");
	
	String name= "Chocolate";
	int price=30+4;
	System.out.println("Prooduct ID: " + name + " and Product Price= "+ price);
		
	if(price> 30)
	{
		System.out.println("I would not buy the chocolate from the store");
    }
	else
	{
		System.out.println("I would like to buy two bars from the store");
    }
	
// Using switch and break
	System.out.println("");
	
	String flavor="Dark Chocolate";
	
	switch (flavor) {
	
	case "Dark Chocolate":
		
		System.out.println("Price is $25");
		break;
		
	case "Milk Chocolate":
		System.out.println("Price is $30");
		break;
		
	case "Mint Chocolate":
		System.out.println("Price is $35");
		break;
		
	default:
		System.out.println("I do not buy any chocolate");
		break;
}
}
}
