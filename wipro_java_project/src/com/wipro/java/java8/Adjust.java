package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
	public static void CheckingAdjusters() {
		LocalDate date=LocalDate.now();
		System.out.println("The current date is : "+date);
		
		LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First Day Of NextMonth is : "+dayOfNextMonth);
		
		LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("The next Saturday from now is : "+nextSaturday);
		
		LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day of Month : "+firstDay);
		
		LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last Day of Month : "+ lastDay);
	}
	public static void main(String[] args) {
		CheckingAdjusters();
	}
}
