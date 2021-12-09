package assignments.oops;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesBySet{
	public static void main(String[] args) {
		String input = "We learn java basics as part of java sessions in java week1";
		
		
		//step1: convert the String into Character Array
		char[] charArray = input.toCharArray();
		
		//Step2: Create a set
		Set<Character> setChar = new LinkedHashSet<Character>();
		
		//Step3: add the array values into set
		for (Character value : charArray) {
			if(value!=' ') {
				setChar.add(value);
			}
			System.out.println(setChar);
		}
	
	}
}