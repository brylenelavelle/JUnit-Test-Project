package contact;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contacts;

    public ContactService() {
        // To create a new array list for contacts
        contacts = new ArrayList<>();
    }

    // To add new contact
    // If contact is already in the list, return true
    public boolean addContact(Contact contact) {
        boolean duplicate = false;
        for (Contact value : contacts) {
            if (value.equals(contact)) {
                duplicate = true;
            }
        }
        // If not in the list, then add new contact
        if (!duplicate) {
            contacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    // To delete contact
    public boolean deleteContact(String string) {
        for (Contact value : contacts) {
        	// If there is a match, remove contact info
        	// Else, return false
            if (value.getContactID().equals(string)) {
                contacts.remove(value);
                return true;
            }
        }
        return false;
    }

    // To update contact
    public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber,
            String address) {
        for (Contact contactList : contacts) {
            // If contact is not null and is not more than 10 characters
        	// Then set contact info
            if (contactList.getContactID().equals(contactID)) {
                if (!firstName.equals("") && !(firstName.length() > 10)) {
                    contactList.setFirstName(firstName);
                }
                if (!lastName.equals("") && !(lastName.length() > 10)) {
                    contactList.setLastName(lastName);
                }
                if (!phoneNumber.equals("") && (phoneNumber.length() == 10)) {
                    contactList.setPhoneNumber(phoneNumber);
                }
                if (!address.equals("") && !(address.length() > 30)) {
                    contactList.setAddress(address);
                }
                return true;
            }
        }
        return false;
    }
}
