package contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;


public class ContactTest {
	
	//This test method ensures that correct input is validated.
	@Test
	void testContact() {
		Contact contact = new Contact("302","John", "Smith", "7778889999", "Chicago Ave 3000");
		assertTrue(contact.getContactID().equals("302"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhoneNumber().equals("7778889999"));
		assertTrue(contact.getAddress().equals("Chicago Ave 3000"));
	}
	
	// These following tests ensures that input that does not
	// follow the conditional statements are being detected
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("30222222222","John", "Smith", "7778889999", "Chicago Ave 3000");
		});		}
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null,"John", "Smith", "7778889999", "Chicago Ave 3000");
		});		}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","Johnnnnnnnn", "Smith", "7778889999", "Chicago Ave 3000");
		});		}
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302",null, "Smith", "7778889999", "Chicago Ave 3000");
		});		}
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","John", "Smithhhhhhh", "7778889999", "Chicago Ave 3000");
		});		}
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","John", null, "7778889999", "Chicago Ave 3000");
		});		}
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","John", "Smith", "77788899999", "Chicago Ave 3000");
		});		}
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","John", "Smith", null, "Chicago Ave 3000");
		});		}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","John", "Smith", "7778889999", "Chicago Ave 3000 Aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		});		}
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("302","John", "Smith", "7778889999", null);
		});		}
}