
public class Operators {
	
	public static void main(String args[]){
		
		int x,y,z;
		x=y=10;
		//Binary operator
		z=x+y;
		System.out.println("Add Result="+z);
		z=x-y;
		System.out.println("Substract Result="+z);
		z=x*y;
		System.out.println("Multiplicaiton Result="+z);
		z=x/y;
		System.out.println("Division Result="+z);
		z=x%y;
		System.out.println("Modulus Result="+z);
		//<>
		//Post increment operator
		y=x++;  // x=x+1;
		System.out.println("x="+x+",y="+y);
		//Pre Increment Operator
		y=++x;
		System.out.println("x="+x+",y="+y);
		//System.out.println(y);
		
		x--;
		System.out.println("x="+x);
		--x;
		System.out.println("x="+x);
		
		boolean b=true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(b);
		
		boolean a=false;
		
		//OR
		System.out.println(a || b);
		//AND
		System.out.println(a && b);
		 
		/*** True
		 *  A	B	A||B	A&&B
		 *  T	T	T		T
		 * 	T	F	T		F
		 * 	F	T	T		F
		 * 	F	F	F		F
		 */
		//Bitwise operator
		// & and |
		
	}

}
