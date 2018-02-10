import java.util.Scanner;

public class Class_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1) Write a program that asks for your name, age, salary,State, city, house adreees, zipcode
	
Scanner reader = new Scanner (System.in);

System.out.println("What is your name");
String name=reader.next ();

System.out.println("What is your age");
int age=reader.nextInt ();

System.out.println("What is your salary");
int salary=reader.nextInt();

System.out.println("What is your state");
String statename=reader.next ();

System.out.println("What is your city");
String city=reader.next ();

System.out.println("What is your zipcode");
int zipcode=reader.nextInt ();

System.out.println("I am "+ name + " I am "+ age+ "years old" + 
"my expected salary is "+ salary+ "My state is " + statename + "Cureent city is "+ city + "And the zipcode starts with "+ zipcode);
	}

}
