package test;

public class ArrayDemo {

	public static void main(String[] args) {
	
		int studentRoll[]=new int[10];
		studentRoll[0]=1001;
		studentRoll[1]=1002;
		studentRoll[9]=1010;
		//int arr[]={10,20};
		String studentName[]={"X","Y","Z"};
		
		for(int i=0;i<studentRoll.length;i++){
			System.out.println(studentRoll[i]);
		}
		
		//For Each loop
		for(String temp:studentName){
			System.out.println(temp);
		}
		
		for (int SR:studentRoll){
			System.out.println(SR);
			
		}
		
		int i=0;
		while(i<studentName.length){
			System.out.println(studentName[i]);
			i++;
		}
		System.out.println(studentName.length);

	}

}
