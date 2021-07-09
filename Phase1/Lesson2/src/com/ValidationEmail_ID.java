package com;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.*;

public class ValidationEmail_ID {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email1 = "lama1749@gmail.com";
		String email2 = "atheer@gmail.com";
		String email3 = "may@gmail.com";
		String email4 = "taif@gmail.com";
		String email5 = "ahmed@gmail.com";
		String email6 = "majd@gmail.com";

		System.out.println("Enter the Email Id that you want to search: ");
		String email_ID = scanner.nextLine();
		String FirstSplit;
		String SecondSplit;
		// ..................try another solution ................//
//		String[] AllEmail = { "lama1749@gmail.com", "atheer@gmail.com", "may@gmail.com", "taif@gmail.com",
//				"ahmed@gmail.com", "taif@gmail.com" };
//		for (int i = 0; i < AllEmail.length; i++) {
//			String emailId = AllEmail[i];
//			FirstSplit = emailId.substring(0, emailId.indexOf("@"));
//			SecondSplit = emailId.substring(emailId.indexOf("@") + 1);
//			if (FirstSplit.matches(email_ID)) {
//				System.out.println("This Email Id [" + FirstSplit + "] is found");
//				break;
//			}
//
//		}
		
// ..............solution 1 ..........//
		List<String> EmailList = new ArrayList<String>();
		EmailList.add(email1);
		EmailList.add(email2);
		EmailList.add(email3);
		EmailList.add(email4);
		EmailList.add(email5);
		EmailList.add(email6);

		for (String e : EmailList) {
			FirstSplit = e.substring(0, e.indexOf("@"));
			SecondSplit = e.substring(e.indexOf("@") + 1);

			if (FirstSplit.contentEquals(email_ID)) {
				System.out.println("This Email Id [" + FirstSplit + "] is found with the full Email ["+e+"]");
				break;
			}
		}
		;

	}// End of main.

}// End of class.
