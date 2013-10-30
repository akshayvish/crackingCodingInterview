package com.codinginterview.chapter1;
/*Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */

class UniqueCharInString{
	public boolean hasAllUnique(String input){
		char[] original = input.toCharArray();
		char[] compare = input.toCharArray();
		
		boolean flag = true;
		
		for(int i=0;i<original.length-1;i++)
		{
			for(int j=i+1;j<compare.length;j++)
			{
				if(original[i] == compare[j])
				{
					flag = false;
					System.out.println(original[i] + " ** " + compare[j]);
					break;
				}
			}
		}
		return flag;
	}
	public boolean hasAllUniqueWOMem(String input){
		boolean	flag = true; 
		int count=0;
			for(int i=0;i<input.length()-1;i++){
				for(int j=i+1;j<input.length();j++){
					if(input.charAt(i) == input.charAt(j)){
						count++;
						flag = false;
					}
				}
			}
			System.out.println("No of similar characters " + count);
			return flag;
		}
}