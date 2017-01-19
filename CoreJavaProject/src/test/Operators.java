package test;
public class Operators {

	public static void main(String[] args) {
		int x,y,z;
		x=10;
		y=2;
		z=x+y;System.out.println(z);
		z=x-y;System.out.println(z);
		z=x*y;System.out.println(z);
		z=x/y;System.out.println(z);
		z=x%y;
		System.out.println(z);
		
		x++; // Post increment
		++y; //pre increment
		System.out.println(x+","+y);
		y=x--; //Post decrement
		System.out.println(x+","+y);
		y=--x; //pre decrement
		System.out.println(x+","+y);
		
		System.out.println("23:"+(x==y));  //equality operator
		System.out.println(x!=y);
		
		System.err.println("26:"+(x>y));
		System.out.println("27:"+(x<=y));
		
		System.out.println(true && false);
		
		x++;
		x=x+1;
		x+=1;
		x+=10; // x=x+10;
		///x+10;
		
		System.out.println( 2 | 4);
		/*
		 * 010
		 * 100 
		 * ----
		 * 110  = 1*2*2  + 1*2 + 0*1= 6
		 * 110011 = 1*2*2*2*2*2  + 1*2*2*2*2  + 0*2*2*2 + 0*2*2 + 1* 2 + 1*1 = 32+16+0+0+2+1=51
		 */
		
		z=((x>y)?100:200);
		
		System.out.print(z);
		
	}

}
