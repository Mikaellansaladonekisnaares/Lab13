package org.example;

public class Lab13 {
	public int Number;
	static  void ChengNumber (int Num) {
		String Re = "";
		int C = 0;
		
		if(Num%3==0) {
			Re = Re+"Fizz";
			C=1;
		}

		if(Num%5==0) {
			Re = Re+"Buzz";
			C=1;
		}
		
		if(C==0) {

			System.out.println(Num);
		}
		System.out.println(Re);
		
		
	}

	static void NumAndPrint() {
		for(int i=1;i<=100;i++) {
			ChengNumber(i);
		}
	}
}
