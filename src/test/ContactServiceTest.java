package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

class ContactServiceTest {

	// Add Contact Test
	@Test
	void testAddContact() {      
        ContactService cs = new ContactService();
        Contact test1 = new Contact("123", "Jim", "Jones", "6518479635", "2500 Chipper Ln");
		assertEquals(true,ContactService.addContact(test1));
		
		
	}
	
	// Delete Contact Test
	@Test
	void testDeleteContact() {     
        
        ContactService cs = new ContactService();
        Contact test1 = new Contact("123", "Jim", "Jones", "6518479635", "2500 Chipper Ln");
        Contact test2 = new Contact("456", "Sarah", "Harpper", "1658823495", "100 Harpper Dr");
        Contact test3 = new Contact("789", "Daniel", "Brown", "2321589648", "946 Newtown Rd");
        
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);
        
        assertEquals(true,ContactService.deleteContact("123"));
        assertEquals(true,ContactService.deleteContact("456"));
        assertEquals(true,ContactService.deleteContact("789"));
        
        
		
	}
	
	// Update Contact Test
	@Test
	void testUpdateContact() {
		ContactService cs = new ContactService();
        Contact test1 = new Contact("123", "Jim", "Jones", "6518479635", "2500 Chipper Ln");
        Contact test2 = new Contact("456", "Sarah", "Harpper", "1658823495", "100 Harpper Dr");
        Contact test3 = new Contact("789", "Daniel", "Brown", "2321589648", "946 Newtown Rd");
        
        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);
        
        assertEquals(true,ContactService.updateContact("1234", "Jimmy", "Jones", "6518479635", "2500 Chipper Ln"));
        assertEquals(false,ContactService.updateContact("1234", "Jimmy", "Jones", "6518479635", "2500 Chipper Ln"));
	}

}