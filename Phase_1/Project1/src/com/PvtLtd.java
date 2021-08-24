package com;

import java.util.*;

public class PvtLtd {
	public static void main(String[] args) {

		
		System.out.println("LockedMe.com ");
		
		System.out.println("This application is for retrieving the file names in ascending order, add, delete or search files from the application.\n");
		List<String> FilelList = new ArrayList<String>();
		FilelList.add("lama.doc");
		FilelList.add("wejdan.doc");
		FilelList.add("shehana.doc");
		FilelList.add("Atheer.doc");

		mainMenu(FilelList);

	}// end of main.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void mainMenu(List<String> FilelList) {
		System.out.println("********Slecte your choice from the menu********\n\n"
				+ "1- Print the current file names in ascending order\n" + "2- Details of the user interface\n"
				+ "3- Close the application\n");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		switch (input) {

		case "1":
			Collections.sort(FilelList);
			for (String file : FilelList) {
				System.out.println(file);
			}
			;
			break;

		case "2":

			secoundMenu(FilelList);
			break;

		case "3":
			System.out.println("Thank you");
			System.exit(0);

		}// End of switch.

	}// end of main menu method.

	public static void secoundMenu(List<String> FilelList) {
		System.out.println("********Slecte your choice from the menu********\n\n" + "1- Add new file\n"
				+ "2- Delete file\n" + "3- Search specified file\n" + "4- Back to the main menu");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();

		switch (input1) {
		case "1": // add case
			String answer;
			do {

				System.out.println("Enter the file name:\n");

				String fileInput = sc.nextLine();
				FilelList.add(fileInput);
				System.out.println("This file name"
						+fileInput+ " is added\n");

				System.out.println("Do you want to adding more file? yes-no \n");
				String userInput = sc.nextLine();

				answer = userInput;
			} while (answer.equals("yes"));
			back(FilelList);

			break;

		case "2":// delete case
			System.out.println("Enter the file name you want to delete:\n");
			String fileInput1 = sc.nextLine();
			boolean found = false;
			for (String file : FilelList) {
				if (fileInput1.contentEquals(file)) {
					FilelList.remove(fileInput1);
					System.out.println("This file name [" + fileInput1 + "] is is delete");
					found = true;
					break;

				}
			}
			;
			if (!found) {
				System.out.println("The file name is not found\n");
			}
			System.out.println("The current files now in the directory are:\n");
			for (String file1 : FilelList) {

				System.out.println(file1+"\n");
			}
			;
			back(FilelList);
			break;
		case "3":// search case
			System.out.println("Enter the file name you want to search:\n");
			String fileInput2 = sc.nextLine();
			boolean found1 = false;
			for (String file : FilelList) {
				if (fileInput2.contentEquals(file)) {
					FilelList.remove(fileInput2);
					System.out.println("This file name [" + fileInput2 + "] is found");
					found = true;
					break;

				}
			}
			;
			if (!found1) {
				System.out.println("The file name is not found\n");
			}
			
			
			back(FilelList);
			
			break;

		case "4":

			mainMenu(FilelList);

			break;

		}
	}// end of second menu.

	public static void back(List<String> FilelList) {
		System.out
				.println("********Slecte your choice ********\n\n" + "1- Back to menu\n" + "2- Exit the application");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		switch (input) {
		case "1":
			secoundMenu(FilelList);

			break;
		case "2":
			System.out.println("Thank you");
			System.exit(0);
			break;
		}

	}// back method.
	
	

}// end of class
