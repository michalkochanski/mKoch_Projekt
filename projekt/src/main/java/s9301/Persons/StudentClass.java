package s9301.Persons;

public class StudentClass implements PersonInterface {

	private int idStudent;
	private String firstName;
	private String lastName;
	private int yearOfBorn;
	private String about;
	private int idGroup;

	public StudentClass() {
		int idStudent = 0;
		String firstName = "";
		String lastName = "";
		int yearOfBorn = 0;
		String about = "";
		int idGroup = 0;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getYearOfBorn() {
		return yearOfBorn;
	}

	public String getAbout() {
		return about;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setYearOfBorn(int yearOfBorn) {
		this.yearOfBorn = yearOfBorn;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
}