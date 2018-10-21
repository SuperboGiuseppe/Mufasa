import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

	//Test for setFirstname() method
	@Test
	public void setValidFirstName() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setFirstname("Validname");
		assertEquals("Validname", user1.getFirstname());		
	}
	
	@Test
	public void setInvalidFirstName() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setFirstname("12321321331");
		assertEquals("Firstname", user1.getFirstname());
	}
	
	//Test for setLastname() method
	@Test
	public void setValidLastName() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setLastname("Validname");
		assertEquals("Validname", user1.getLastname());		
	}
	
	@Test
	public void setInvalidLastName() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setLastname("1234567");
		assertEquals("Lastname", user1.getLastname());		
	}
	
	//Test for setUsername() method
	@Test
	public void setValidUserName() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setUsername("Validname_123");
		assertEquals("Validname_123", user1.getUsername());		
	}
		
	@Test
	public void setInvalidUsernameOver16Characters() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setUsername("1234567321321321321321321");
		assertEquals("username1", user1.getUsername());		
	}
		
	@Test
	public void setInvalidUsernameMoreThanOneUnderscore() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setUsername("Test____");
		assertEquals("username1", user1.getUsername());		
	}
	
	//Test for setPassword() method
	@Test
	public void setValidPassword() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setPassword("asdfqwer");
		assertEquals("asdfqwer",user1.getPassword());
	}
	
	@Test
	public void setInvalidPassword() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setPassword("asdf");
		assertEquals("password123", user1.getPassword());
	}
	
	//Test for setPhonenumber() method
	@Test
	public void setValidPhoneNumber() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setPhonenumber("123456789");
		assertEquals("123456789", user1.getPhonenumber());
	}
	
	@Test
	public void setInvalidPhoneNumber() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setPhonenumber("qwerty");
		assertEquals("555444888", user1.getPhonenumber());
	}
	
	//Test for setEmail() method
	@Test
	public void setValidEmail() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setEmail("test2@test.it");
		assertEquals("test2@test.it", user1.getEmail());
	}
	
	@Test
	public void setInvalidEmail() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setEmail("test2test.it");
		assertEquals("test@test.it", user1.getEmail());
	}
	
	//Test for setCountry() method
	@Test
	public void setValidCountry() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setCountry("Finland");
		assertEquals("Finland", user1.getCountry());		
	}
		
	@Test
	public void setInvalidCountry() {
		User user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		user1.setCountry("12321321331");
		assertEquals("Countrytest", user1.getCountry());
	}
	
}
