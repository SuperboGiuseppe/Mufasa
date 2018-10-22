import java.util.regex.Pattern;

public class BankAccount {
	private String street_address;
	private String city;
	private String postalcode;
	private String country;
	private String password;
	private CreditCard creditcard;
	
	public BankAccount(String street_address, String city, String postalcode, String country, String password, CreditCard creditcard) {
		this.setStreetAddress(street_address);
		this.setCity(city);
		this.setPostalcode(postalcode);
		this.setCountry(country);
		this.setPassword(password);
		this.setCreditCard(creditcard);
	}
	
	public String getStreetAddress() {
		return street_address;
	}
	
	public void setStreetAddress(String street_address) {
		this.street_address = street_address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		if(city.matches("[a-zA-Z]+"))
			this.city = city;
	}
	
	public String getPostalcode() {
		return postalcode;
	}
	
	public void setPostalcode(String postalcode) {
		int UpperscoreFlag = 0;
		boolean flag = true;
		for(int i = 0; i < postalcode.length(); i++) {
			if(postalcode.charAt(i) == '-' )
				UpperscoreFlag += 1;
			if(!Character.isDigit(postalcode.charAt(i)) && postalcode.charAt(i) != '-')
				flag = false;
		}
		
		if(UpperscoreFlag < 2 && flag == true) {
			this.postalcode = postalcode;
		}
		
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		if(country.matches("[a-zA-Z]+"))
			this.country = country;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setCreditCard(CreditCard card) {
		this.creditcard = card;
	}
	
	public Double getBalance() {
		return creditcard.getBalance();
	}
	
	public void setPassword(String password) {
		if(password.length() > 7)
			this.password = password;
	}
}
