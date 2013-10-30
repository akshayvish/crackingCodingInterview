package com.codinginterview.chapter1;
public class RemoveDupInString {

	public String removeDuplicates(String input){
		String temp="";
		boolean flag = false;
		for(int i=0;i<input.length()-1;i++){
			for(int j=i+1;j<input.length();j++){
				if(input.charAt(i) == input.charAt(j)){
					flag = true;
				}
			}
			
			if(!flag){
				temp = temp + input.charAt(i);
			}
			if(i==input.length()-2){
				temp = temp + input.charAt(i+1);
			}
			flag = false;
		}
		return temp;
	}
}
