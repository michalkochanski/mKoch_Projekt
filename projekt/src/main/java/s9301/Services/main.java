package s9301.Services;

import s9301.Managers.StudentManager;

public class main {
	public static void main(String[] args) {
		DBconnector db = new DBconnector();
		StudentManager student = new StudentManager();

		db.connect();
		student.studentsReadAll();

	}
}