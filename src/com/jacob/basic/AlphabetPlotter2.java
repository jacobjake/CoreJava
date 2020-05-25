package com.jacob.basic;

import java.util.TreeMap;

public class AlphabetPlotter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Plotter plot = new Plotter();
		TreeMap<Double, PlotterPojo> tm = plot.gatherPoints(8,0,1,"A");
		plot.plot(tm);
		TreeMap<Double, PlotterPojo> tm2 = plot.gatherPoints(8,16,3,"A");
		plot.plot(tm2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
