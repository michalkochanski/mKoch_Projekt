package s9301.Persons;

public interface PersonInterface {
	public String getIndex();
	public String getFirstName();
	public String getLastName();
	public String getYearOfBorn();
	public String getAbout();

	public void setIndex(int index);
	public void setFirstName(String firstName);
	public void setLastName(String lastName);
	public void setYearOfBorn(String yearOfBorn);
	public void setAbout(String about);

}
