package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {
	// Testing if ID is too long
		@Test
		void testIdTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() -> {
				new Contact("12345678901", "Peter", "Parker", "9497246281", "11 Candy Lane");
			});
		}
		// Testing if ID is null
		@Test
		void testIdNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() -> {
				new Contact(null, "Peter", "Parker", "9497246281", "11 Candy Lane");
		});
		}
		// Testing if first name is too long
		@Test
		void testFirstNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() -> {
				new Contact("1234567890", "Peter Parker", "Parker", "9497246281", "11 Candy Lane");
		});
		}
		// Testing if first name is null
		@Test
		void testFirstNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() -> {
				new Contact("1234567890", null, "Parker", "9497246281", "11 Candy Lane");
		});
		}
		// Testing if last name is too long
			@Test
			void testLastNameTooLong() {
				Assertions.assertThrows(IllegalArgumentException.class,() -> {
					new Contact("1234567890", "Peter", "Peter Parker", "9497246281", "11 Candy Lane");
			});
			}
		// Testing if last name is null
			@Test
			void testLastNameNull() {
				Assertions.assertThrows(IllegalArgumentException.class,() -> {
					new Contact("1234567890", "Peter Parker", null, "9497246281", "11 Candy Lane");
			});
			}
		// Testing if phone is too long
			@Test
			void testPhoneTooLong() {
				Assertions.assertThrows(IllegalArgumentException.class,() -> {
					new Contact("1234567890", "Peter", "Peter", "94972462812", "11 Candy Lane");
			});
			}
		// Testing if phone is null
			@Test
			void testPhoneNull() {
				Assertions.assertThrows(IllegalArgumentException.class,() -> {
					new Contact("1234567890", "Peter", "Parker", null, "11 Candy Lane");
			});
			}
		// Testing if address is too long
			@Test
			void testAddressTooLong() {
				Assertions.assertThrows(IllegalArgumentException.class,() -> {
					new Contact("1234567890", "Peter", "Peter", "9497246281", "11 Candy Lane djkiunh gytbandbv jkuo");
			});
			}
		// Testing if address is null
			@Test
			void testAddressNull() {
				Assertions.assertThrows(IllegalArgumentException.class,() -> {
					new Contact("1234567890", "Peter", "Parker", "9497246281", null);
			});
			}
	}