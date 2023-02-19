package calendarTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CalendarMain {
	
	public static void main(String[] args) throws IOException {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println (System.currentTimeMillis());
		System.out.println (new Date());
		System.out.println("inserisci un numero");
		try {
			//String s = br.readLine();
			int s = br.read();
			s++;
			System.out.println(s);
			
		}catch (Exception e) {
			System.out.println("lanciata eccezione");
		}
		
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			System.out.println(a);
		}
		*/
		
		Date d = new Date();
		System.out.println(d);
		
		//LocalDate ld = LocalDate.now();
		LocalDate ld = LocalDate.of(2020, 1, 1);
		LocalDate ld2 = LocalDate.of(2022, 12, 31);
		
		/*
		Year y = Year.of(2020);
		System.out.print(y.getValue());
		*/
		
		
		
			Stream<LocalDate> localdate =ld.datesUntil(ld2.plusDays(1));
			List<LocalDate> al = localdate.toList();
			System.out.println(al.toString());
			
			int year = 0;	
			int month = 0;
			
			int countDay = 0;
			
		for(LocalDate local : al) {
			if(year < local.getYear()) {
				year = local.getYear();
				System.out.println("   anno   " + year);
			}
			
			if(month < local.getMonthValue()) {
				month = local.getMonthValue();
				String monthName = "";
				try {
					monthName = switchMonth(month);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				System.out.println("\n   " + monthName );
				
				
			}
			
			System.out.print(local.getDayOfMonth() + " ");
			countDay++;
			if(countDay == 7) {
				System.out.println("");
				countDay = 0;
			}
			if(month == 12 && local.getDayOfMonth() == 31) {
				month = 0;
				System.out.println("");
			}
			
			
			
			//System.out.println(local.toString());
		}
		
		//System.out.print(ld);
		
		
		/*
		Calendar c = Calendar.getInstance();
		c.getTime();
		System.out.println(c.getTime());
		*/
	}
	
	
	
	public static String switchMonth(int i) {
		
		
		switch (i) {
		case 1: {
			
			return "gennaio";
		}
		case 2: {
			
			return "febbraio";
		}
		case 3: {
			
			return "marzo";
		}
		case 4: {
			
			return "aprile";
		}
		case 5: {
			
			return "maggio";
		}
		case 6: {
			
			return "giugno";
		}
		case 7: {
			
			return "luglio";
		}
		case 8: {
			
			return "agosto";
		}
		case 9: {
			
			return "settembre";
		}
		case 10: {
			
			return "ottobre";
		}
		case 11: {
			
			return "novembre";
		}
		case 12: {
			
			return "dicembre";
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
		
		
		
	}

}
