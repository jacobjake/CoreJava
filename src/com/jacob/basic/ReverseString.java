package com.jacob.basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello World!";
		System.out.println(reverseString(str));
	}
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
