package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordWithMoreNoOfVowels {
	String str = "Madhu Java World";
	int strLength =4;
	int index =0;
	int vowelCount=0;
	int largerVowelCount=0;
	
	public void getVowelsCount() {
		str=str.toLowerCase();
		List<String> myArray = new ArrayList<String>();
		while(index<str.length()) {
			myArray.add(str.substring(index, Math.min(index+strLength, str.length())));
			index+=strLength;
		}
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		for(String m:myArray) {
			vowelCount=0;
			char[] chArray = m.toCharArray();
			for (int j=0;j<chArray.length;j++) {
				if(chArray[j]=='a'||chArray[j]=='e'||chArray[j]=='i'||chArray[j]=='o'||chArray[j]=='u')
					vowelCount++;
			}
			
			myMap.put(m, vowelCount);
			
		}
		
		for(String s:myMap.keySet()) {
			if((myMap.get(s))>largerVowelCount)
				largerVowelCount = myMap.get(s);
		}
		
		for(String s:myMap.keySet()) {
			if((myMap.get(s))==largerVowelCount)
				System.out.println(s+"      "+myMap.get(s));
		}
		
		
	}
	

	public static void main(String[] args) {
		WordWithMoreNoOfVowels test = new WordWithMoreNoOfVowels();
		test.getVowelsCount();
		
	}

}
