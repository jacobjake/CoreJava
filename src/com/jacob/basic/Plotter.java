package com.jacob.basic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Plotter {

	public void PlotRs(double d) {

		String str = "";
		for (int n = 1; n < d; n++) {
			str = str + " ";
		}
		str = str + "*";
		System.out.println(str);
	}

	public void PlotRs2(double d[]) {
		String str = "";
		for (int i = 0; i < 2; i++) {
			for (int n = 1; n < d[i]; n++) {
				str = str + " ";
			}
			str = str + "*";
		}
		System.out.println(str);
	}

	public void PlotRc(double d) {
		String str = "";
		for (int n = 1; n < d; n++) {
			str = str + "*";
		}
		str = str + "*";
		System.out.println(str);
	}

	public void PlotRc2(double d[]) {
		String str = "";
		for (int i = 0; i < 2; i++) {
			for (int n = 1; n < d[i]; n++) {
				str = str + "*";
			}
			str = str + "*";
		}
		System.out.println(str);
	}

	public void PlotMix(double d[]) {
		String str = "";
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				for (int n = 1; n < d[i]; n++) {
					str = str + " ";
				}
				str = str + "*";
			} else {
				for (int n = 1; n < d[i]; n++) {
					str = str + "*";
				}
				str = str + "*";
			}
		}
		System.out.println(str);
	}

	public String returnSpace(double d) {
		String str = "";
		for (int n = 1; n < d; n++) {
			str = str + " ";
		}
		str = str + "*";
		return str;
	}

	public String returnChar(double d) {
		String str = "";
		for (int n = 1; n < d; n++) {
			str = str + "*";
		}
		str = str + "*";
		return str;
	}

	public void plot(TreeMap<Double, PlotterPojo> tm) {
		for (Entry<Double, PlotterPojo> entry : tm.entrySet()) {
			// System.out.println("Key = " + entry.getKey() + ", Value = "
			// +entry.getValue());
			PlotterPojo pp = entry.getValue();
			LinkedList<Double> rsl = pp.getRs();
			double a[] = { 0, 0 };
			int n = 0;
			boolean second = false;
			for (Iterator<Double> i = rsl.iterator(); i.hasNext();) {
				a[n] = i.next();
				if (n == 1) {
					second = true;
				}
				++n;
			}
			LinkedList<Double> rcl = pp.getRc();
			double b[] = { 0, 0 };
			int m = 0;
			@SuppressWarnings("unused")
			boolean secondRC = false;
			for (Iterator<Double> i = rcl.iterator(); i.hasNext();) {
				b[m] = i.next();
				if (m == 1) {
					secondRC = true;
				}
				++m;
			}
			if (second) {
				PlotRs2(a);
			} else {
				double o[] = { a[0], b[0] };
				PlotMix(o);
			}
		}
	}

	public TreeMap<Double, PlotterPojo> gatherPoints(int fontSize, double limit, double loop, String Alphabet) {
		double k = fontSize * loop, l = fontSize * loop, i = 0, j = k / loop, m = (k / (2 * loop));
		TreeMap<Double, PlotterPojo> plotterTM = new TreeMap<Double, PlotterPojo>();
		switch (Alphabet) {
		case "A": {
			for (; k > limit; k--, l++, i++) {
				LinkedList<Double> rs = new LinkedList<Double>();
				LinkedList<Double> rc = new LinkedList<Double>();
				PlotterPojo p = new PlotterPojo();
				if (i == m) {
					rs.add(k);
					rc.add(j + 1);
					// System.out.println(returnSpace(k) + returnChar(j + 1));
					p.setRs(rs);
					p.setRc(rc);
				} else {
					rs.add(k);
					rs.add((l + 1) - k);
					// System.out.println(returnSpace(k) + returnSpace((l + 1) - k));
					p.setRs(rs);
					p.setRc(rc);
				}
				plotterTM.put(i, p);
				p = null;
			}
			break;
		}
		}
		return plotterTM;
	}
}