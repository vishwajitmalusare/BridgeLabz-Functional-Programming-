package com.jsonprograms;

import java.util.Scanner;

public class Menu {

	static AddressBook addressBook = new AddressBook();// to implement all the methods 
	public static void addressMenu(boolean value)
	{
	Scanner sc=new Scanner(System.in);
	try {
		while(value)
		{
			System.out.println("Enter the choice:");
			System.out.println("1. Create New Address Book");
			System.out.println("2. Open existing Address Book");
			System.out.println("3. Add Person");
			System.out.println("4. Edit Person");
			System.out.println("5. Remove Person");
			System.out.println("6. Sort entries by name");
			System.out.println("7. Sort entries by zip");
			System.out.println("8. Print entries");
			System.out.println("9. Save Address Book");
			System.out.println("10.Save As Address Book");
			System.out.println("11.Quit Program");
			
			int n=sc.nextInt();
			switch(n)
			{
				case 1:	AddressBookManager.addnewCustomerBook();
						break;
						
				case 2: AddressBookManager.openExistingAddressBook();						
						break;
					
				case 3: AddressBookManager.addPersonInAddressBook();
						break;
						
				case 4:	AddressBookManager.updatePersonInAddressBook();
						break;						
						
				case 5: AddressBookManager.removePersonInAddressBook();
						break;
					
				case 6:	AddressBookManager.sortAddressBookByName();
						break;
						
				case 7: AddressBookManager.sortAddressBookByzipCode();;
						break;
					
				case 8: AddressBookManager.printAddressBook();
						break;
					
				case 9: AddressBookManager.saveAddressBook();
						break;
						
				case 10: AddressBookManager.saveAsAnotherAddressBook();		
						break;
						
				case 11: System.out.println("\nApplication stopped!\n"); 
						value = false;
						break;
						
						
				default: System.out.println("invalid choice... try again");
						
			}	
		}	sc.close();
	}
	catch(NullPointerException e)
	{
		System.out.println("\nNo AddressBook opened currently!");
	}
	
}

}


