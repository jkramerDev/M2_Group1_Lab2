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
		int length = set.size();
		Contact[] array = new Contact[length];
		set.toArray(array);
		
		
		for (int i = 0; i < length - 1; i++)
		{
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j].getName().compareTo(array[j + 1].getName()) < 0) {
					swap(array, j, j + 1);
				}
			}
		}
		
		List<Contact> list = Arrays.asList(array);
		Collections.reverse(list);
		
		return list;
		
	}
	
	void swap(Contact[] a, int m, int n) {
		Contact temp = a[m];
		a[m] = a[n];
		a[n] = temp;
	}

	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
		int low = 0;
		int high = sortedContacts.size() - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (sortedContacts.get(mid).getName().equals(name)) {
				return sortedContacts.get(mid).getPhonebookEntries();
			}
			if (sortedContacts.get(mid).getName().compareTo(name) < 0) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return null;
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		System.out.println("Sorted Phonebook (Bubble Sort)");
		for (Contact contact : sortedContacts) {
			System.out.println(contact.getName());
		}
		
	}

	
}
