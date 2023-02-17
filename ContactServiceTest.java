package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	// Testing the add method
    public void testAdd() {
        ContactService serviceTest = new ContactService();
        Contact testCase1 = new Contact("303", "Jon", "Smiles", "1112223333", "West 1234");
        assertEquals(true, serviceTest.addContact(testCase1));
    }

    @Test
    // Testing the delete method
    public void testDelete() {
        ContactService serviceTest = new ContactService();

        Contact testCase1 = new Contact("303", "Jon", "Smiles", "1112223333", "West 1234");
        Contact testCase2 = new Contact("304", "Treecko", "Patrick", "1212221111", "North 1234");
        Contact testCase3 = new Contact("305", "Pikachu", "Senior", "1313332222", "East 1234");

        serviceTest.addContact(testCase1);
        serviceTest.addContact(testCase2);
        serviceTest.addContact(testCase3);

        assertEquals(true, serviceTest.deleteContact("304"));
        assertEquals(false, serviceTest.deleteContact("306"));
        assertEquals(false, serviceTest.deleteContact("304"));
    }

    @Test
    // Testing the update method
    public void testUpdate() {
        ContactService serviceTest = new ContactService();

        Contact testCase1 = new Contact("303", "Jon", "Smiles", "1112223333", "West 1234");
        Contact testCase2 = new Contact("304", "Treecko", "Patrick", "1212221111", "North 1234");
        Contact testCase3 = new Contact("305", "Pikachu", "Senior", "1313332222", "East 1234");

        serviceTest.addContact(testCase1);
        serviceTest.addContact(testCase2);
        serviceTest.addContact(testCase3);

        assertEquals(true, serviceTest.updateContact("305", "Pikachu", "Junior", "1313332222", "East 1234"));
        assertEquals(false, serviceTest.updateContact("3005", "Pikachu", "Senior", "1313332222", "East 1234"));
    }
}
