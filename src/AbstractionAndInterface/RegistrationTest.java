package AbstractionAndInterface;

/*Create registration class in which you would have variables as email, userName, and password
 * that have a access scope only within its own class
 * After creating an object of the class user should be able to call methods and in each method seperately pass values
 * to set user email
 * Requirements: 
 * Valid email to be gmail
 * valid username and password cant be empty and should be of length larger than
 * 6 characters 
 * also valid password cannot contain username
 */

class RegistrationClass {

	private String email, userName, password;

	// setting something - passing does not return anything use void as return type
	public void setEmail(String email) {

		if (email.contains("gmail.com")) {
			this.email = email;
		} else {
			System.out.println("Invalid email type. Email must be gmail");
		}
	}

	// getting email
	public String getEmail() {
		return email;
	}

	// setting username - void kw as return type
	
	public void setUsername(String userName) {
	    if (userName.isEmpty()) {
	        System.out.println("Username cannot be empty");
	    } else if (userName.length() <= 6) {
	        System.out.println("Username should have more than 6 characters");
	    } else {
	        // Set the username (you need to add the actual logic to store the username)
	        System.out.println("Username is valid and set successfully");
	    }
	}

	// getting username - returning something - change return type
	public String getUsername() {
		return userName;
	}
	
	//set password
	public void setPassword(String password) {
		
		if(!password.isEmpty()) {
			
			if(password.length()>6) {
				
				if(!password.contains(userName)) {
					this.password=password;
				}else {
					System.out.println("Password cannot contain username");
				}
				
			}else {
				System.out.println("Password should have more than 6 characters");
			}
		}else {
			System.out.println("Password cannot be empty");
		}
	}
	public String getPassword() {
		return password;
	}
}

	public class RegistrationTest {
		
		public static void main(String[] args) {
		
		RegistrationClass obj = new RegistrationClass();
		obj.setUsername("Terri12345454545");
		System.out.println(obj.getUsername());
		obj.setEmail("Terri@gmail.com");
		System.out.println(obj.getEmail());
		
	}
}
