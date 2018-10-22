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
		EasyMock.expect(card1.getBalance()).andReturn(5.50).times(2);
		EasyMock.expect(mufasa1.testattachment(card1, "123")).andReturn(true);
		
		//Mock ready
		EasyMock.replay(card1); //activating the expected behaviour
		EasyMock.replay(mufasa1);
		if(mufasa1.testattachment(card1, "123") && card1.getBalance() - 0.01 > 0.00) {
			BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
			assertEquals(5.50, bank1.getBalance(), 0.0);
			System.out.println("BankAccount created successfully.");
		}	
	}
	
	@Test
	public void BankAccountCreationWithCreditCardAttachmentTestFailureWrongCVC() {
		//Mock set expectations
		EasyMock.expect(card1.getCVC()).andReturn("123"); //recording the expected behaviour
		EasyMock.expect(card1.getBalance()).andReturn(5.50).times(1);
		EasyMock.expect(mufasa1.testattachment(card1, "435")).andReturn(false).times(2);
		//Mock ready
		EasyMock.replay(card1); //activating the expected behaviour
		EasyMock.replay(mufasa1);
		if(mufasa1.testattachment(card1, "435") && card1.getBalance() - 0.01 >= 0.00) {
				BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
		}	
		else {
			System.out.println("BankAccount creation failed, check your credit card informations or your current balance (You need at least 0.01$ inside your credit card)!");
			assertEquals(false, mufasa1.testattachment(card1, "435"));
		}
	}
	
	@Test
	public void BankAccountCreationWithCreditCardAttachmentTestFailureNoCredit() {
		//Mock set expectations
		EasyMock.expect(card1.getCVC()).andReturn("123"); //recording the expected behaviour
		EasyMock.expect(card1.getBalance()).andReturn(0.00).times(2);
		EasyMock.expect(mufasa1.testattachment(card1, "123")).andReturn(true);
		//Mock ready
		EasyMock.replay(card1); //activating the expected behaviour
		EasyMock.replay(mufasa1);
		if(mufasa1.testattachment(card1, "123") && card1.getBalance() - 0.01 >= 0.00) {
				BankAccount bank1 = new BankAccount("StreetAddress", "city", "5646854", "Country", "password", card1, mufasa1, "123");
		}	
		else {
			System.out.println("BankAccount creation failed, check your credit card informations or your current balance (You need at least 0.01$ inside your credit card)!");
			assertEquals(false, card1.getBalance() - 0.01 >= 0.00);
		}
	}

}
