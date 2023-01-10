package com.bl.addressbook.wrokshop;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println(" Address boook programs");

		AddressBook addressbook = new AddressBook();

		Scanner scanner = new Scanner(System.in);

		boolean flag1 = true;
		while (flag1) {
			System.out.println("\n Selection Option");
			System.out.println("1.Add contact\n 2.Edit Contact\n 3.Display conatct\n");
			int option = scanner.nextInt();

			switch (option) {

			case 1:
				addressbook.createContact();
				break;

			case 2:
				addressbook.addContact();
				break;
			case 3:
				addressbook.displayContact();
				break;

			default:
				System.out.println(" option is not valid");
				break;

			}

		}
	}

}
