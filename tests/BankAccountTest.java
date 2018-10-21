import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.easymock.EasyMock;

public class BankAccountTest {
	Mufasa mufasa1;
	CreditCard card1;
	
	@Before
	public void setup() {
		//mock create
		mufasa1 = EasyMock.createMock(Mufasa.class);
		card1 = EasyMock.createMock(CreditCard.class);
	}
	//Test for setPassword() method
	@Test
	public void setValidPassword() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
		bank1.setPassword("asdfqwer");
		assertEquals("asdfqwer",bank1.getPassword());
	}
	
	@Test
	public void setInvalidPassword() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password123", card1, mufasa1, "123");
		bank1.setPassword("asdf");
		assertEquals("password123", bank1.getPassword());
	}
	
	//Test for setCity() method
	@Test
	public void setValidCity() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
		bank1.setCity("asdfqwer");
		assertEquals("asdfqwer",bank1.getCity());
	}
		
	@Test
	public void setInvalidCity() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password123", card1, mufasa1, "123");
		bank1.setCity("1234");
		assertEquals("city", bank1.getCity());
	}
	
	//Test for setPostalcode() method
	@Test
	public void setValidPostalcode() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
		bank1.setPostalcode("22222222");
		assertEquals("22222222",bank1.getPostalcode());
	}
			
	@Test
	public void setInvalidPostalcodeMorethanOneUpperScore() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password123", card1, mufasa1, "123");
		bank1.setPostalcode("1234-2222-222");
		assertEquals("5646854", bank1.getPostalcode());
	}
		
	@Test
	public void setInvalidPostalcodeLetters() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password123", card1, mufasa1, "123");
		bank1.setPostalcode("asdsadsad");
		assertEquals("5646854", bank1.getPostalcode());
	}
	
	//Test for setCountry() method
	@Test
	public void setValidCountry() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password123", card1, mufasa1, "123");
		bank1.setCountry("Finland");
		assertEquals("Finland", bank1.getCountry());		
	}
			
	@Test
	public void setInvalidCountry() {
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password123", card1, mufasa1, "123");
		bank1.setCountry("12321321331");
		assertEquals("Country", bank1.getCountry());
	}
}
