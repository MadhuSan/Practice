package javaBasics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.openqa.selenium.support.ui.ISelect;

public class DecryptPassword {
	
	static ArrayList<Character> newCh = new ArrayList<Character>();
	static char[] ch;
	static char c;
	
	public static String decryptPwd(String s) {
		ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[i])&&Character.isUpperCase(ch[i+1])) {
				c=ch[i];
				newCh.add(i+2,ch[i+1]);
				newCh.add(i+3,c);
				newCh.add(i+4,'*');
			}
			else if(Character.isDigit(ch[i])) {
				newCh.add(i,'0');
				newCh.add(0,ch[i]);
			}
			else
				newCh.add(ch[i+1],ch[i]);
		}
		
		
		
		return String.valueOf(newCh);
	}

	public static void main(String[] args) throws IOException {
	       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String result = DecryptPassword.decryptPwd(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }

	}

