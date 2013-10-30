package com.codinginterview.chapter1;
public class StringRev { 
	public String reverseWOSubstring(String input){
		String temp = "";
		for(int i=input.length()-1;i>=0;i--){
			temp = temp + input.charAt(i);
		}
		System.out.println(temp);
		return temp;
	}
	public String reverse(String input){
		String temp = ""; int j = input.length()-1;
		
		for(int i =0;i<=j;i++,j--){
			if(j-i > 1){
			temp = input.substring(0,i) 
					+ input.charAt(j)
					+ input.substring(i+1,j)
					+ input.charAt(i)
					+ input.substring(j+1);
			
			}else{
				temp = input.substring(0,i) 
						+ input.charAt(j)
						+ input.charAt(i)
						+ input.substring(j+1);
			}
			System.out.println(temp);
			input = temp;
		}
		
		return temp;
	}
}