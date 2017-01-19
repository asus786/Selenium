
public class ConditionalStatment {

	public static void main(String args[]){
		
		//IF
		int x=20;
		//Odd or Even check
		if(x%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		//find the largest number
		int a=10;
		int b=20;
		int c=25;
		if(a>b){
			if(a>c){
				System.out.println("a is greatest:"+a);
			}else{
				System.out.println("c is greatest:"+c);
			}
		}else{
			if(b>c){
				System.out.println("b is greatest:"+b);
			}else{
				System.out.println("c is gratest:"+c);
			}
		}
		
		//another way
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c && b> a)
		{
			System.out.println("b is greatest");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greatest");
		}
		
		//a number is positive , negative or zero
		int d=20;
		if(d>0){
			System.out.println("Positive");
		}//now you can try to write
		else if (d<0)
		{
			System.out.println("negetive");			
		}
		else 
		{
			System.out.println("zero");
		}
			
		//leap year
		//Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, 
		//but these centurial years are leap years if they are exactly divisible by 400
	
		//1900 -> not a leap year, but it is divisiable by 4, because it is divisable by 100
		//2000 -> leap year
		int y=2000;
		
		if (y%4==0)
		{
			if(y%100==0)
				if(y%400==0)
					System.out.println("Leap year");
				else
					System.out.println("not a leap");
			else
				System.out.println("Leap");
		}
		else 
		{
			System.out.println("Not Leap");
		}
		
		//one liner for leap year
		
	}

}

//()
//{}
//[]