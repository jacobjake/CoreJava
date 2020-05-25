package com.jacob.basic;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {-2,5,1,4,0,6,8};
		int target=-6;
		Map<Integer,Integer> visibleNumbers = new HashMap<>();
		
		for(int i=0;i<numbers.length;i++) {
			int delta = target - numbers[i];
			if(visibleNumbers.containsKey(delta)) {
				System.out.println(i+","+visibleNumbers.get(delta));
			}else {
				visibleNumbers.put(numbers[i], i);
			}
		}
	}

}
