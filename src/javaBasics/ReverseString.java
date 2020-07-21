package javaBasics;

public class ReverseString {
	
	private String str;
	
	public String getterMethod() {
		return this.str;
	}
	
	public void settrMethod(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		String revString = null;
		ReverseString revStr = new ReverseString();
		revStr.settrMethod("Java World");
		String str = revStr.getterMethod();
		char[] ch = str.toCharArray();
		for(int i=(ch.length-1);i>=0;i--)
			revString+=ch[i];
		System.out.println(revString);
	}

}
