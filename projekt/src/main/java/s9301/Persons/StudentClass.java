package s9301.Persons;

public class StudentClass implements PersonInterface {

	private int index;
	private String firstName;
	private String lastName;
	private String yearOfBorn;
	private String about;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
