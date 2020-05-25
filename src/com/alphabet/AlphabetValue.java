package com.alphabet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("unused")
public class AlphabetValue {

	// Alphabet Map which holds the Values for each alphabet
	static HashMap<String, Integer> alphaValue = new HashMap<String, Integer>();

	// forming values to alphabets
	public static void makeArray() {

		ArrayList<String> keys = getAplhaKeys();

		for (int i = 0; i < 26; i++) {
			alphaValue.put(keys.get(i), i + 1);
		}

		// printing HashMap
		// alphaValue.forEach((k,v) -> System.out.println(k +" = "+v));
	}

	// forming the Alphabets as Keys
	public static ArrayList<String> getAplhaKeys() {

		int initialAsciiValue = 65;
		ArrayList<String> alphaKeys = new ArrayList<String>();

		for (int i = 0; i < 26; i++) {
			alphaKeys.add(Character.toString((char) initialAsciiValue));
			initialAsciiValue += 1;
		}

		// printing Keys
		// alphaKeys.forEach((k) -> System.out.println(k));

		return alphaKeys;
	}

	// Calculating the value of string
	public static int getValue(String[] str) {

		makeArray();
		int value = 0;
		Integer temp;
		for (String alphabet : str) {
			temp = alphaValue.get(alphabet);
			int tmpValue = (temp == null) ? 0 : temp;
			value = value + tmpValue;
		}
		temp = null;
		return value;
	}

	public static void main(String[] args) {

		System.out.println("Enter the string you want to find value of ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine(), actStr = s;
		in.close();
		String[] str = s.toUpperCase().split("");
		System.out.println("The value of the string \"" + actStr + "\" is " + getValue(str));

	}

}
