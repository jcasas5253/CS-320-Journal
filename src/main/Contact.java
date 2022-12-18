package main;

public class Contact {
	private String id;
	private String firstname;
	private String lastname;
	private String phone;
	private String address;
	
	public Contact(String id, String firstname, String lastname, String phone, String address) {
		// if null or greater than 10; Invalid
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		// if null or greater than 10; Invalid
		if(firstname == null || firstname.length()>10){
			throw new IllegalArgumentException("Invalid First Name.");
		}
		// if null or greater than 10; Invalid
		if(lastname == null || lastname.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name.");
		}
		// if null or greater than 10; Invalid
		if(phone == null || phone.length()>10) {
			throw new IllegalArgumentException ("Phone number is too long. Must be 10 digits.");
		}
		// if less than 10; Invalid
		if(phone.length()<10) {
			throw new IllegalArgumentException ("Phone number is too short. Must be 10 digits.");
		}
		// if null or greater than 30; Invalid
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Adress. Must be less than 30 characters.");
		}
		
		// setting to object
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
	}
	
	// getters
	public String getid() {
		return id;
	}
	public String getfirstname() {
		return firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public String getphone() {
		return phone;
	}
	public String getaddress() {
		return address;
	}
}