package by.htp.les02.customer.entity;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int creditcard;
	private int bankAccount;

	public Customer() {
	}

	public Customer(int id, String surname, String name, String patronymic, String address, int creditcard,
			int bankAccount) {

		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditcard = creditcard;
		this.bankAccount = bankAccount;

	}

	public void setId(int id) {

		this.id = id;

	}

	public void setSurname(String surname) {

		this.surname = surname;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setPatronymic(String patronymic) {

		this.patronymic = patronymic;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public void setCreditcard(int creditcard) {

		this.creditcard = creditcard;

	}

	public void setBankAccount(int bankAccount) {

		this.bankAccount = bankAccount;

	}

	public int getId() {

		return this.id;

	}

	public String getSurname() {

		return this.surname;

	}

	public String getName() {

		return this.name;

	}

	public String getPatronymic() {

		return this.patronymic;

	}

	public String getAddress() {

		return this.address;

	}

	public int getCreditcard() {

		return this.creditcard;

	}

	public int getBankAccount() {

		return this.bankAccount;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccount;
		result = prime * result + creditcard;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccount != other.bankAccount)
			return false;
		if (creditcard != other.creditcard)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ("Customer\n" + "  id: " + this.id + "\n" + "  surname: " + this.surname + "\n" + "  name: " + this.name
				+ "\n" + "  patronymic: " + this.patronymic + "\n" + "  address: " + this.address + "\n"
				+ "  creditcard: " + this.creditcard + "\n" + "  bank_account :" + this.bankAccount + "\n");
	}

}
