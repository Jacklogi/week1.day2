package week1.day2;

public class Calculator {

	int a=1;
	int b=2;
	int c=3;
	int sum= a+b+c;
	int sub= a-b;
double d=10.57d;
double e=20.43d;
double mul = d*e;
float f=10f;
float g=5f;
float div =f/g;

public void sum() {
	System.out.println("sum");
	
}
	public void sub () {
		System.out.println("sub");
		
	}
	public void mul () {
		System.out.println("mul");
		
	}
	public void div () {
		System.out.println("div");
		
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();
				
		// TODO Auto-generated method stub

	}

}
