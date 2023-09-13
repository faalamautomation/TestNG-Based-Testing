package com.videoslots.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

	@Test
	public void Test1Palindrome()
	{
		
		String input="kayak";
		
		String expected="Kayak";
		
		
		String actual=Palindrome.checkPalindrome(input);
		
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(),"Max ten characters string is allowed");
		
	}
	
	@Test
	public void Test2Palindrome()
	{
		
		String input="Level";
		
		String expected="level";
		
		
		String actual=Palindrome.checkPalindrome(input);
		
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(),"Max ten characters string is allowed");
		
	}
	
	@Test
	public void Test3Palindrome()
	{
		
		String input="Radar";
		
		String expected="radar";
		
		
		String actual=Palindrome.checkPalindrome(input);
		
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(),"Max ten characters string is allowed");
		
	}
	
	@Test
	public void Test4Palindrome()
	{
		
		String input="12121";
		
		String expected="12121";
		
		
		String actual=Palindrome.checkPalindrome(input);
		
		Assert.assertEquals(actual, expected,"Max ten characters string is allowed");
		
	}
	
	@Test
	public void Test5Palindrome()
	{
		
		String input="0000";
		
		String expected="0000";
		
		
		String actual=Palindrome.checkPalindrome(input);
		
		Assert.assertEquals(actual, expected,"Max ten characters string is allowed");
		
	}
	
}