package s9301.Managers;

import java.sql.ResultSet;
import java.util.List;

import s9301.Persons.StudentClass;
import s9301.Services.DBeditor;

public class StudentManager implements ManagerInterface<StudentClass> {

	public void ReadAll() {
		String query = "select * from students";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableViewer(query);

		try {
			System.out.println("idStud" + "\t" + "firstName" + "\t"
					+ "lastName" + "\t" + "yearOfBorn" + "\t" + "idGroup"
					+ "\t\t" + "about");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t\t" + result.getString(3)
						+ "\t\t" + result.getString(4) + "\t\t"
						+ result.getString(6) + "\t\t" + result.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ReadOne(int id) {
		String query = "select * from students where idStudent = " + id;

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableViewer(query);

		try {
			System.out.println("idStud" + "\t" + "firstName" + "\t"
					+ "lastName" + "\t" + "yearOfBorn" + "\t" + "idGroup"
					+ "\t\t" + "about");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t\t" + result.getString(3)
						+ "\t\t" + result.getString(4) + "\t\t"
						+ result.getString(6) + "\t\t" + result.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Add(StudentClass obj) {
		StudentClass s = new StudentClass();
		String query = "INSERT INTO `students` (`firstName`,`lastName`,`yearOfBorn`,`about`,`idGroup`) VALUES ('"
				+ s.getFirstName()
				+ "','"
				+ s.getLastName()
				+ "',"
				+ s.getYearOfBorn()
				+ ",'"
				+ s.getAbout() + "'," + s.getIdGroup() + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void Edit(StudentClass obj) {
		StudentClass s = new StudentClass();
		String query = "UPDATE students SET `firstName` = '" + s.getFirstName()
				+ "', `lastName` = '" + s.getLastName() + "', `yearOfBorn` = "
				+ s.getYearOfBorn() + ", `about` = '" + s.getAbout() + "', `idGroup` = "
				+ s.getIdGroup() + " WHERE `idStudent` = " + s.getIdStudent();

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void Remove(int id) {
		String query = "delete from students where idStudent = " + id;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}
	
	/*
	 * OLD METODS
	 * 
		public void studentsRead() {}

		public void studentsRead(int idStudent) {}

		public void studentsAdd(String firstName, String lastName, int yearOfBorn,
				String about, int idGroup) {}

		public void studentsEdit(int idStudent, String firstName, String lastName,
				int yearOfBorn, String about, int idGroup) {}

		public void studentsRemove(int idStudent) {}
	*/
}