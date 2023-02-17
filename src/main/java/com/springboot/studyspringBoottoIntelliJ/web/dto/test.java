package com.springboot.studyspringBoottoIntelliJ.web.dto;

import java.util.Calendar;

public class test {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		
		int w = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		System.out.println(w);
	}
}
