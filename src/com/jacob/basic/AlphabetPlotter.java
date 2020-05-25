package com.jacob.basic;

import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AlphabetPlotter {
	
	static TreeMap<Double,String> hm = new TreeMap<Double,String>();
	
	static TreeMap<Double,LinkedList<Double>> hlm = new TreeMap<Double,LinkedList<Double>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Double,String> hm1 = plotAlphabet(8,0,1,"A");
		for (Entry<Double, String> entry : hm1.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		//plotAlphabet(8,16,3,"A");
		//plotAlphabet(8,32,5,"A");
		//plotAlphabet(8,48,7,"A");
		//plotAlphabet(8,64,9,"A");
		//plotAlphabet(8,80,11,"A");
	}

	public static String returnSpace(double d) {
		String str = "";
		for (int n = 1; n < d; n++) {
			str = str + " ";
		}
		str = str + "*";
		return str;
	}

	public static String returnChar(double d) {
		String str = "";
		for (int n = 1; n < d; n++) {
			str = str + "*";
		}
		str = str + "*";
		return str;
	}
	public static TreeMap<Double,String> plotAlphabet(int fontSize, double limit, double loop, String Alphabet) {
		double k = fontSize*loop, l = fontSize*loop, i = 0, j = k/loop, m = (k / (2*loop));
		switch (Alphabet) {
		case "A": {
			for (; k > limit; k--, l++, i++) {
				if (i == m) {
					hm.put(i, "rs="+k+"|rc="+j+1);
					System.out.println(returnSpace(k) + returnChar(j + 1));
				} else {
					hm.put(i, "rs="+k+"+"+((l + 1)- k));
					System.out.println(returnSpace(k) + returnSpace((l + 1) - k));
				}
			}
			break;
		}
		}
		return hm;
	}

}
