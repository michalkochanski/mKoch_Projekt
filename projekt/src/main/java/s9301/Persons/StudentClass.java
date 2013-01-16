package s9301.Persons;

public class StudentClass implements PersonInterface {

	private int index;
	private String firstName;
	private String lastName;
	private String yearOfBorn;
	private String about;
	
	public StudentClass()
	{
		int index = 0;
		String firstName = "";
		String lastName = "";
		String yearOfBorn = "";
		String about = "";
	}

	public int getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getYearOfBorn() {
		return yearOfBorn;
	}

	public String getAbout() {
		return about;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setYearOfBorn(String yearOfBorn) {
		this.yearOfBorn = yearOfBorn;
	}

	public void setAbout(String about) {
		this.about= about;
	}
}