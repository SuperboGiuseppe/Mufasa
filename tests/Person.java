import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.easymock.EasyMock;

public class Person {
	
	User user1;
	Mufasa mufasa1;
	CreditCard card1;
	
	@Before
	public void setup() {
		user1 = new User("Firstname" , "Lastname" , "username1", "password123", "Countrytest", "21/02/1997", "555444888", "test@test.it" );
		//mock create
		mufasa1 = EasyMock.createMock(Mufasa.class);
		card1 = EasyMock.createMock(CreditCard.class);
	}
	
	
	@Test
	public void BankAccountCreationWithCreditCardAttachmentTest() {
		//Mock set expectations
		EasyMock.expect(card1.getCVC()).andReturn("123"); //recording the expected behaviour
		EasyMock.expect(card1.getBalance()).andReturn(5.49);
		EasyMock.expect(mufasa1.testattachment(card1, "123")).andReturn(true);
		
		//Mock ready
		EasyMock.replay(card1); //activating the expected behaviour
		EasyMock.replay(mufasa1);
		BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
		assertEquals(5.49, bank1.getBalance(), 0.0);
	}

}
