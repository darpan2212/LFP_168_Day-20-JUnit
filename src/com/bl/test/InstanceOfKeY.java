package com.bl.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class InstanceOfKeY {
	
	public static void main(String[] args) {
		
		List<Integer> li = new Vector<>();
		
		Number num1 = 45.21;
		
		if (li instanceof ArrayList<Integer>) {
			System.out.println(num1+" is integer");
		} else {
			System.out.println(num1+" is not integer");
		}
		
	}
	
}