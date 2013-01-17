package s9301.Managers;

public interface StudentManagerInterface {

	public void studentsReadAll();

	public void studentsAdd(String firstName, String lastName, int yearOfBorn, String about, int idGroup);

	public void studentsEdit(int idStudent, String firstName, String lastName, int yearOfBorn, String about, int idGroup);

	public void studentsRemove(int idStudent);
}