package entities;

public class Contacts {

	private String name;
	private String email;
	private Integer number;

	public Contacts(String name, String email, Integer number) {

		this.name = name;
		this.email = email;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String toString() {
		return "Contacts [name=" + name + ", email=" + email + ", number=" + number + "]";
	}

}
