import java.util.ArrayList;

public class User {
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String country;
	private String birthdate;
	private String phonenumber;
	private String email;
	private ArrayList<BankAccount> bankaccount;
	
	public User(String firstname, String lastname, String username, String password, String country, String birthdate, String phonenumber, String email) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setUsername(username);
		this.setPassword(password);
		this.setBirthdate(birthdate);
		this.setCountry(country);
		this.setPhonenumber(phonenumber);
		this.setEmail(email);
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		if(firstname.matches("[a-zA-Z]+"))
			this.firstname = firstname;	
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		if(lastname.matches("[a-zA-Z]+"))
			this.lastname = lastname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		int UnderscoreFlag = 0;
		for(int i = 0; i < username.length(); i++) {
			if(username.charAt(i) == '_')
				UnderscoreFlag += 1;
		}
		
		if(UnderscoreFlag < 2 && username.length() < 16)
			this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		if(password.length() > 7)
			this.password = password;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber) {
		boolean flag = true;
		for(int i = 0; i < phonenumber.length(); i++) {
			if(!Character.isDigit(phonenumber.charAt(i)))
				flag = false;
		}
		if(flag == true)
			this.phonenumber = phonenumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.contains("@"))
			this.email = email;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		if(country.matches("[a-zA-Z]+"))
			this.country = country;
	}
	
	public void addBankAccount(BankAccount account) {
		this.bankaccount.add(account);
	}
}
