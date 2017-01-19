package test;

public class Loops {

	public static void main(String[] args) {
		int i=1;
		//while loop -> Entry control loop
		while(i<=10){
			System.out.println(i);
			if(i==5)
				break;
			i++;
		}
		System.out.println("Git changes2");
		
		
		//do while loop -> Exit control loop
		//i=50;
		do{
			if(i==5)
				continue;
			System.out.println(i);
			//i++;
		}while(i++<60);

		//For Loop
		for(i=100;i<200;i=i+10){
			System.out.println(i);
		}
		
		
	}

}
