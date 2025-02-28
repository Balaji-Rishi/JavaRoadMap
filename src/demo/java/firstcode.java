
package demo.java;


public class firstcode {
	static int val=2;

	int valsof =10;
	
	static void mysam() {
		System.out.println("this sam methods");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("balaji is the java code is running");
		
		
		System.out.println(val);
		firstcode ref = new firstcode();
		System.out.println(ref.valsof);
		val=4;
		System.out.println(val);
		
//		windening casting - type casting
		
		int x = 5;
		System.out.println(x);
		double doubleValue= x;
		System.out.println(doubleValue);
		
//		Narrowing Casting
		
		double doubleValues = 100.99;
		System.out.println(doubleValues);
		int intValue = (int) doubleValues; // Explicit casting
		System.out.println(intValue); // Outputs: 100
		
		int a=0;
		while(a<5)
		{
			System.out.println(a);
			a++;
		}
		
		int b=0;
		do {
			System.out.println(b);
			b++;}
			while(b<10);
		
		int [] [] arr= {{1,2},{3,4}};
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		mysam();
		


	}

}
