package com.basics;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp();
	}

	
	public static void temp(){
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDate2 = LocalDate.of(2016, 1, 18);
		System.out.println(localDate2);
		System.out.println(localDate.equals(localDate2));
		
		// ???
		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
		MonthDay currentMonthDay = MonthDay.from(localDate);
		     
		if(currentMonthDay.equals(birthday)){
		   System.out.println("Many Many happy returns of the day !!");
		}else{
		   System.out.println("Sorry, today is not your birthday");
		}
		
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(localTime.plusHours(2));

		
		LocalDate nextWeek = localDate.plus(1, ChronoUnit.WEEKS);
		System.out.println("Today is : " + localDate);
		System.out.println("Date after 1 week : " + nextWeek);

		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock);

		System.out.println();
		// Date and time with timezone in Java 8
		ZoneId america = ZoneId.of("America/New_York");
		LocalDateTime localtDateAndTime = LocalDateTime.now();
		ZonedDateTime dateAndTimeInNewYork  = ZonedDateTime.of(localtDateAndTime, america );
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
		 

		YearMonth currentYearMonth = YearMonth.now();
		System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
		YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);


		System.out.println();

		LocalDate java8Release = LocalDate.of(2015, Month.JANUARY, 18);
		Period periodToNextJavaRelease = Period.between(java8Release, LocalDate.now() );
		System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.toTotalMonths() );


		System.out.println();
		LocalDateTime datetime = LocalDateTime.of(2014, Month.JANUARY, 14, 19, 30);
		ZoneOffset offset = ZoneOffset.of("+05:30");
		OffsetDateTime date = OffsetDateTime.of(datetime, offset);
		System.out.println(datetime);
		System.out.println("Date and Time with timezone offset in Java : " + date);


		Instant timestamp = Instant.now();
		System.out.println("What is value of this instant " + timestamp);












	}
}
