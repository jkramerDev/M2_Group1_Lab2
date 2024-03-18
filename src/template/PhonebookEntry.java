package template;

/**
 *   model a PhonebookEntry 
 *   
 *   PhonebookEntry has a phoneNumber and type
 *   
 *   
 *   
 */

class PhonebookEntry{

	String type;
	String phoneNumber;
	
	public PhonebookEntry(String type, String phoneNumber) {
		this.type = type;
		this.phoneNumber = phoneNumber;
		}
	
	public String getType() {
		return type;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

 
}
	