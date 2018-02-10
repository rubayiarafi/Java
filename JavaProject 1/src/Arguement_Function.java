
public class Arguement_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum (4,5);
		//addtion(6,7,8);
		//substruction(10,5);
		age("Texas",8);

	}
	
	public static void sum (int x, int y)
	{
		System.out.println(x+y);
	}

	public static void addtion (int a, int b, int c)
	{
	int x= a+b+c;
	System.out.println(x);
	
	}
public static void substruction (int x, int y)

{
	int z=x-y;
	System.out.println("This result is" + z);
	
}
public static void age (String name, int age)

{
	System.out.println("Identity is equal to "+ name+age);
}
}
