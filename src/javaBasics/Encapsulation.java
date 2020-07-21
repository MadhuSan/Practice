package javaBasics;

public class Encapsulation {
	
	private int a;
	private String name;
	
	public void getterMethod(int a) {
		this.a = a;
	}
	
	public int setterMethod() {
		return a;
	}

	public static void main(String[] args) {
		
		Encapsulation enc = new Encapsulation();
		enc.getterMethod(5);
		System.out.println(enc.setterMethod());
		

	}

}
