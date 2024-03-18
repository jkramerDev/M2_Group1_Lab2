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

	public void addPhonebookEntry(String type, String number) {
		list.add(new PhonebookEntry(type, number));
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

}
