package com.codinginterview.chapter1;
public class ReverseCString{
	public String reverse(String Cstring){
		String temp = "";
		for(int i=Cstring.length()-1;i>=0;i++)
		{
			temp = temp + Cstring.charAt(i);
		}
		return temp;
	}
}