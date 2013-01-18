package s9301.Services;

import s9301.Managers.StudentManager;

public class main {
	public static void main(String[] args) {
		DBconnector db = new DBconnector();
		StudentManager student = new StudentManager();

		db.connect();
		System.out.println("Pierwotna:");
		student.studentsReadAll();
		/*student.studentsAdd("test", "guy", 666, "testing", 1);
		System.out.println("Po Dodaniu:");
		student.studentsReadAll();
		student.studentsEdit(9, "Patriszja2", "Awesome", 1988, "zagraniczna", 2);
		System.out.println("Po edycji:");
		student.studentsReadAll();
		student.studentsRemove(25);
		System.out.println("Po usunięciu:");
		student.studentsReadAll();
		*/
	}
}