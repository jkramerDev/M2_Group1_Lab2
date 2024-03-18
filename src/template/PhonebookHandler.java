package template;

import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{

	Map<Contact, List<PhonebookEntry>> phonebook;
	Set<Contact> set; 
	
	public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
		this.phonebook = phonebook;
	}

	@Override
	public List<Contact> sortByName() {
		set = phonebook.keySet();
		Contact[] array = (Contact[]) set.toArray();
		
		for (int i = 0; i < set.size() - 1; i++)
		{
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].toString().compareTo(array[j + 1].toString()) == -1) {
					swap(array, j, j + 1);
				}
			}
		}
		
		List<Contact> list = new ArrayList<>();
		for (Contact e : array) {
			list.add(e);
		}
		return list;
	}
	
	void swap(Contact[] a, int m, int n) {
		Contact temp = a[m];
		a[m] = a[n];
		a[n] = temp;
	}

	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		for (Contact contact : sortedContacts) {
			System.out.print("Name: " + contact.name + ", Phone Number(s): ");
			for (PhonebookEntry entry : contact.getPhonebookEntries()) {
				System.out.print("[" + entry.getPhoneNumber() + ", " + entry.getType());
			}
		}
		
	}

	
}
