
public class Double_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Employee_Name [] [] = new String [3] [3];
		
		// First row
		Employee_Name [0] [0]="Jack";
		Employee_Name [0] [1]="Sean";
		Employee_Name [0] [2]="Mike";
		
		// Second row
		Employee_Name [1] [0]="Angelina";
		Employee_Name [1] [1]="Linda";
		Employee_Name [1] [2]="Bob";
		
		//Third row
		Employee_Name [2] [0]="Nancy";
		Employee_Name [2] [1]="Julli";
		Employee_Name [2] [2]="Kelvin";
		
		
		System.out.println("I want to find Kelvin");
		System.out.println(Employee_Name [2] [2]);
		
		System.out.println("");
		
		int rows = Employee_Name.length;
		int cols = Employee_Name [0].length;
		
		for (int rownum = 0; rownum < rows; rownum++) {
			
	    for (int colnum =0; colnum < cols; colnum++) {
	    System.out.println(Employee_Name [rownum] [colnum]);
	    
	   }
	    
		}
		
		System.out.println("");
		
		String Employee_City [] = new String [4];
		
		Employee_City [0]="Dallas";
		Employee_City [1]="Fort Worth";
		Employee_City [2]="Plano";
		Employee_City [3]="Richardson";
		
		for (int x=0; x < Employee_City.length; x++) {
			
		System.out.println(Employee_City[x]);
		
		}
		
	}
}
	
	
	


