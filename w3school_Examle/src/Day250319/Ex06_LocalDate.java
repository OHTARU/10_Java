package Day250319;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex06_LocalDate {

	public static void main(String[] args) {

		LocalDate myObj = LocalDate.now();
		LocalTime myObj1 = LocalTime.now();
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println(myObj + " " + myObj1);
		System.out.println("------------------------");
		System.out.println(myObj2);

		System.out.println("========================");

		System.out.println("변환 전 : " + myObj2);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String formattedDate = myObj2.format(myFormatObj);
		System.out.println("변환 후 : " + formattedDate);

		
		/*
		 * yyyy-MM-dd "1988-09-29"
		 * dd/MM/yyyy "29/09/1988"
		 * dd-MMM-yyyy "29-Sep-1988"
		 * E,MMM dd yyyy "Thu, Sep 29 1988"
		 */
	}

}
