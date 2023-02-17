package calendarTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class CalendarMain {
	
	public static void main(String[] args) throws IOException {
		
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
		
		
		
	}

}
