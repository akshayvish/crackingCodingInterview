package com.codinginterview.chapter1;

public class Chapter1Main {
	public static void main(String args[]){
		UniqueCharInString ucs = new UniqueCharInString();
		//System.out.println(ucs.hasAllUnique("akshaya"));
		//System.out.println(ucs.hasAllUniqueWOMem("akshay"));
		
		//ReverseCString rcs = new ReverseCString();
		//char[] temp = new char[]{'a','b','c',(Character) null};
		//System.out.println("Reversed String " + rcs.reverse(new String(temp)));
		
		/*RemoveDupInString remDup = new RemoveDupInString();
		System.out.println(remDup.removeDuplicates("akshay"));
		
		Anagram anag = new Anagram();
		System.out.println(anag.isAnagram("asdflkjh", "lksrdhfa"));
		
		ReplaceString rs = new ReplaceString();
		System.out.println(rs.replaceSpaces("rain in spain stays mainly in the plains "));
		*/
		StringRev sr = new StringRev();
		sr.reverse("akshay");
	}
}
