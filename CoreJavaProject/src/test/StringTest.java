package test;

public class StringTest {

	public static void main(String[] args) {
		String st="1Hello World";
		String a=new String("Hello World");
		String acc=new String("Account Number: 0112");
		String acc1=new String("Account Number: 0112456");
		System.out.println(st);
		
		char c=st.charAt(0);
		System.out.println(c);
		
		System.out.println(st.length());
		
		c=st.charAt(st.length()-1);
		System.out.println(c);
		
		System.out.println(st.equals("Hello"));
		
		System.out.println(st.equals(a));
		
		System.out.println(st==a);
		
		
		System.out.println(st.endsWith("World"));
		String sub=st.substring(5);
		System.out.println(sub);
		
		String subAcc=acc1.substring(16);
		System.out.println(subAcc);
		
		System.out.println(sub.trim());
		System.out.println(sub);
		
		System.out.println(st.codePointAt(0));
	
		System.out.println("ABC".compareTo("ADD"));
		System.out.println("B".compareTo("A"));
		System.out.println("+123".compareTo("-234"));
		
		
		String s="001001110101010";
		String res="";
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(c=='1')
				res=c+res;
			else
				res=res+c;
				
		}
		System.out.println(res);
		
		String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		byte b[]=alphabets.getBytes();
		for(byte x:b)
			System.out.print(x+", ");
		
		
	}

}
