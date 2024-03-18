package template;

import java.util.ArrayList;
import java.util.List;

/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

class Contact {
	
	String name;
	List<PhonebookEntry> list;

	public Contact(String name) {
		this.name = name;
		list = new ArrayList<>();
	}

	public void addPhonebookEntry(String type, String number) {
		list.add(new PhonebookEntry(type, number));
	}

	public List<PhonebookEntry> getPhonebookEntries() {
		return list;
	}
	 

}
