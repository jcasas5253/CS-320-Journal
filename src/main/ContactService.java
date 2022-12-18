package main;

import java.util.ArrayList;

public class ContactService {

	private static ArrayList<Contact> MyContactList = new ArrayList<Contact>();	
	
 // Adding contacts to a list
    public static void initializeContactList() {
        Contact contact_1 = new Contact("123", "Jim", "Jones", "6518479635", "2500 Chipper Ln");
        Contact contact_2 = new Contact("456", "Sarah", "Harpper", "1658823495", "100 Harpper Dr");
        Contact contact_3 = new Contact("789", "Daniel", "Brown", "2321589648", "946 Newtown Rd");
        
        MyContactList.add(contact_1);
        MyContactList.add(contact_2);
        MyContactList.add(contact_3);
    }

    public void addContact(String id, String firstname,String lastname, String phone, String address) {
        
    	// Check if ID is already active
    	for(Contact contact: MyContactList) {
            if(contact.getid().equalsIgnoreCase(id)) {
            	return; 
            }
        }
        
        Contact newContact = new Contact(id,firstname,lastname,phone,address);
        MyContactList.add(newContact);
    }
	
	// Delete contact
    @SuppressWarnings("unlikely-arg-type")
	public static void deleteContact(String id) {
        
    	// Check to see if ID is already active
    	for(Contact contact: MyContactList) {
            if(contact.getid().equalsIgnoreCase(id)) {
            	MyContactList.remove(id);
            	return;
            }
        }
    }
	
	// Update contact
    public static void updateContact(String id, String firstname,String lastname, String phone, String address) {
    	int cntr=0;
    	
    	// Check to see if ID is already active
    	for(Contact contact: MyContactList) {
    		
            if(contact.getid().equalsIgnoreCase(id)) {
            	MyContactList.set(cntr,new Contact(id,firstname,lastname,phone,address));
            	return;
            }
            cntr++;
        }       
    }
}