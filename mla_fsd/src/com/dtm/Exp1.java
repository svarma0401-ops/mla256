package com.dtm;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exp1 {

	public static void main(String[] args) {
		
		// get the current date 
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// get the current date and time
		LocalDateTime ldt =  LocalDateTime.now();
		System.out.println(ldt);
		
		// get specific date 
		LocalDate ldspd = LocalDate.of(2001,Month.OCTOBER, 4);
		System.out.println(ldspd);
		
		// get date of plus 1 week
		LocalDate plswk = ld.plusWeeks(1);
		System.out.println(plswk);
		
		Period prd = Period.between(ld,ldspd);
		System.out.println(prd);
		
		DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String formatedDate = ldt.format(dfmt);
		System.out.println(formatedDate);
		
		ZonedDateTime zndt = ZonedDateTime.now();
		System.out.println(zndt);
		
		ZoneId znid = ZoneId.of("Asia/Tokyo");
		System.out.println(znid);
		
		ZonedDateTime tk = ZonedDateTime.now(znid);
		System.out.println(tk);
	}

}
