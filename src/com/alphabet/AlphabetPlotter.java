package com.alphabet;

import java.util.TreeMap;

public class AlphabetPlotter extends AlphabetPlotterMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Double,String> gp = new TreeMap<Double,String>();
		//gp = gatherPoints(8,0,1,"A",gp,0);
		gp = gatherPoints(8,16,3,"A",gp,0);
		System.out.println(gp.get(0.0));
		System.out.println(gp.get(1.0));
		System.out.println(gp.get(2.0));
		System.out.println(gp.get(3.0));
		System.out.println(gp.get(4.0));
		System.out.println(gp.get(5.0));
		System.out.println(gp.get(6.0));
		System.out.println(gp.get(7.0));
		
		TreeMap<Double,String> gp2 = new TreeMap<Double,String>();
		gp2 = gatherPoints(8,0,1,"A",gp2,0);
		gp2 = gatherPoints(8,8,3,"A",gp2,1);
		System.out.println(gp2.get(0.0));
		System.out.println(gp2.get(1.0));
		System.out.println(gp2.get(2.0));
		System.out.println(gp2.get(3.0));
		System.out.println(gp2.get(4.0));
		System.out.println(gp2.get(5.0));
		System.out.println(gp2.get(6.0));
		System.out.println(gp2.get(7.0));
		plot(gp2);
	}

}
