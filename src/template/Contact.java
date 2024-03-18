package template;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

	public void addPhonebookEntry(String number, String type) {
		list.add(new PhonebookEntry(number, type));
	}

	public List<PhonebookEntry> getPhonebookEntries() {
		return list;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(list, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(list, other.list) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		String word = "Name: " + name + ", Phone Number(s): [";
		int i = 0;
		int size = getPhonebookEntries().size();
		for (PhonebookEntry entry : getPhonebookEntries()) {
			if (i != size - 1) {
				word += entry.getType() + " " + entry.getPhoneNumber() + ", ";
			}
			else {
				word += entry.getType() + " " + entry.getPhoneNumber();
			}
			i++;
		}
		word += "]";
		return word;
	}

}
