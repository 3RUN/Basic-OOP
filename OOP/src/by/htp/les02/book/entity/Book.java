package by.htp.les02.book.entity;

public class Book {

	private int id;
	private String name;
	private String authors;
	private String publisher;
	private int year;
	private int pages;
	private double price;
	private String cover;

	public Book() {
	}

	public Book(int id, String name, String authors, String publisher, int year, int pages, double price,
			String cover) {

		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.cover = cover;

	}

	public void setId(int id) {

		this.id = id;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setAuthors(String authors) {

		this.authors = authors;

	}

	public void setPublisher(String publisher) {

		this.publisher = publisher;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public void setPages(int pages) {

		this.pages = pages;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public void setCover(String cover) {

		this.cover = cover;

	}

	public int getId() {

		return this.id;

	}

	public String getName() {

		return this.name;

	}

	public String getAuthors() {

		return this.authors;

	}

	public String getPublisher() {

		return this.publisher;

	}

	public int getYear() {

		return this.year;

	}

	public int getPages() {

		return this.pages;

	}

	public double getPrice() {

		return this.price;

	}

	public String getCover() {

		return this.cover;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages != other.pages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ("Book\n" + "  id: " + this.id + "\n" + "  name: " + this.name + "\n" + "  author(s): " + this.authors
				+ "\n" + "  publisher: " + this.publisher + "\n" + "  year: " + this.year + "\n" + "  pages: "
				+ this.pages + "\n" + "  price: " + this.price + "\n" + "  cover type: " + this.cover + "\n");
	}
}
