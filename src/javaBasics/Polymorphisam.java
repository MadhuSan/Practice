package javaBasics;

public class Polymorphisam {
	
	int a,b;
	
	public void sum(int c, int b) {
		System.out.println(a+b);		
	}
	
	public int sum(int c) {
		return (a+b+c);
	}

	public static void main(String[] args) {
		
		Polymorphisam p = new Polymorphisam();
		System.out.println(p.sum(4));

	}

}
