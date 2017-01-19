package test;
public class DataTypeAndVariable {

	public static void main(String[] args) {
		boolean b=true; //1 bit
		byte by=5; //1 Byte  255
		short s=120; // 2 Bytes -32768 to 32767, 55545
		int i=10000; //4 bytes
		char c='a'; // 2 Bytes
		long l=1231231l; // 8 Bytes
		float f=12.5f;  //4 Bytes
		double d=123231.3423; //8 Bytes
		
		i=by;  // Implicit conversion
		by=(byte)s;  //Explicit conversion, typcasting
		
		d=f;
		f=(float)d;
		
		short res= (short)(s+by);
		
		String st="Hello";
		System.out.println(st);
		System.out.print(by);
		System.out.println(st);
		
		
		
		

	}

}
