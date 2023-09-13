package com.videoslots.tasks;
import java.util.*;

public class Palindrome {

	public static String checkPalindrome(String s)
	{
		
        final int LIMIT=10;
	    
	    String rev="";
	    
		if(s.length()>10)
		{
			s=s.substring(0,LIMIT);
		}
		
		System.out.println("The string is " +s);
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("The reverse string is " +rev);
		
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("The string is Palindrome");
		}
		else 
		{
			System.out.println("The string is not Palindrome");
		}
		
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		
	  Palindrome.checkPalindrome("Level");
	}

}
