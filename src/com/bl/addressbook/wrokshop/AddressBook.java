//Create Contacts with details(name, age, phoneNumber,city,state) -> 
//Add multiple contacts in each addressBook ->

package com.bl.addressbook.wrokshop;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	Scanner scanner = new Scanner(System.in);

	ArrayList<ContactPerson> addressbook1 = new ArrayList<>();

	public ContactPerson createContact() {

		ContactPerson person = new ContactPerson();
		System.out.println("Enter the Name");
		person.setFirstName(scanner.next());
		System.out.println("Enter the age");
		person.setAge(scanner.next());
		System.out.println("Enter the phone Number");
		person.setPhoneNumber(scanner.nextLong());
		System.out.println("Enter the City");
		person.setCity(scanner.next());
		System.out.println("Enter the State name");
		person.setState(scanner.next());

		return person;

	}

	public void addContact() {
		ContactPerson contactPerson = createContact();
		addressbook1.add(contactPerson);
		System.out.println(contactPerson);
		System.out.println("Contact created");
	}
	
	void displayContact() {
		for(ContactPerson contactPerson : addressbook1) {
			System.out.println(contactPerson);
			
		}
	}

}
