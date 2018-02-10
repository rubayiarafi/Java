import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader=new Scanner (System.in);
System.out.println("your age");
int n=reader.nextInt ();

System.out.println("I am " + n + " years old");


System.out.println("Where do you live");
String Dallas = reader.next();
System.out.println("My city" + Dallas);
	}

}
