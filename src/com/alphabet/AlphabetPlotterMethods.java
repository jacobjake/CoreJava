package com.alphabet;

import java.util.TreeMap;
import java.util.Map.Entry;

public class AlphabetPlotterMethods {

	static TreeMap<Double, String> tm = new TreeMap<Double, String>();

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

	public static TreeMap<Double, String> gatherPoints(int fontSize, double limit, double loop, String Alphabet,
			TreeMap<Double, String> tm, int iterator) {
		double k = fontSize * loop, l = fontSize * loop, i = 0, j = k / loop, m = (k / (2 * loop));
		switch (Alphabet) {
		case "A": {

			if (iterator == 0) {
				for (; k > limit; k--, l++, i++) {
					if (i == m) {
						tm.put(i, "rs:" + k + ",rc:" + j + 1);
					} else {
						tm.put(i, "rs:" + k + ",rs:" + ((l + 1) - k));
					}
				}
			} else {
				for (; k > limit; l++, i++) {
					if (i == m) {
						String str = tm.get(i);
						tm.put(i, str + ",rs:" + k + ",rc:" + j + 1);
					} else {
						String str = tm.get(i);
						tm.put(i, str + ",rs:" + k + ",rs:" + ((l + 1) - k-i));
					}
					k= k-2;
				}
			}
			break;
		}
		}
		return tm;
	}

	public static void plot(TreeMap<Double, String> tm) {
		for (Entry<Double, String> entry : tm.entrySet()) {
			String stringToPlot = "";
			String value = entry.getValue();
			String[] elements = value.split(",");
			for (String ele : elements) {
				double point;
				String[] filler = ele.split(":");
				point = Double.parseDouble(filler[1]);
				if (filler[0].equalsIgnoreCase("rs")) {
					stringToPlot = stringToPlot + returnSpace(point);
				} else {
					stringToPlot = stringToPlot + returnChar(point);
				}
			}
			System.out.println(stringToPlot);
		}

	}
}