package com.codinginterview.chapter1;
public class Anagram {

	public boolean isAnagram(String input1, String input2){
		boolean flag = false;
		if(input1.length()!=input2.length()){
			flag = false;
		}
		else{
			int count=0;
			for(int i=0;i<input1.length();i++){
				for(int j=0;j<input2.length();j++)
				{
					if(input1.charAt(i) == input2.charAt(j)){
						count++;
					}
				}
			}

			if(count == input1.length())
			{
				flag = true;
			}
		}
		return flag;
	}
}
