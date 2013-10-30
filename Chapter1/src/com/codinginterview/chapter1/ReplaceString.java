package com.codinginterview.chapter1;
public class ReplaceString {
	public String replaceSpaces(String input){
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' '){
				String temp = input.substring(0,i) + "%20" + input.substring(i+1);
				input = temp;
			}
		}
		return input;
	}
}
