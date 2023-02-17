package contact;

public class Contact {
		// Contact variables to store info
		private String contactID;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String address;
		
		public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
	        // Constructors
			super();
	        this.contactID = contactID;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        
	        //Methods to check if input is null and doesn't meet character length    
	        if (contactID == null || contactID.length() > 10) {
	        	throw new IllegalArgumentException("Invalid contact ID");
	        }
	        if (firstName == null || firstName.length() > 10) {
	        	throw new IllegalArgumentException("Invalid first name");
	        }
	        if (lastName == null || lastName.length() > 10) {
	        	throw new IllegalArgumentException("Invalid last name");
	        }
	        if (phoneNumber == null || phoneNumber.length() != 10) {
	        	throw new IllegalArgumentException("Invalid phone number");
	        }
	        if (address == null || address.length() >= 30) {
	        	throw new IllegalArgumentException("Invalid address");
	        }
	       
	    }
		
		
		// setters and getters
		public String getContactID() {
	        return contactID;
	    }

	    public void setContactID(String contactID) {
	        this.contactID = contactID;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	  
	}