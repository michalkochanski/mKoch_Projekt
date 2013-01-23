package s9301.Services;

import s9301.Managers.GroupManager;
import s9301.Managers.StudentManager;

public class main {
	public static void main(String[] args) {
		StudentManager student = new StudentManager();
		GroupManager group = new GroupManager();

		// zmienna pomagająca w testach
		int newIDs = 22;

		// start of STUDENTS

		// Wyświetlenie wszystkich Studentów
		System.out.println("Wszyscy Studenci:");
		System.out.println();
			student.studentsRead();
		System.out.println();

		// Wyświetlenie pojedyńczego studenta
		System.out.println("Jeden konkretny Student:");
		System.out.println();
			student.studentsRead(15);
		System.out.println();

		// Dodanie nowego studenta, kod MySQL do resetowania Auto_Increment:
		// ALTER TABLE `michalkoch_java`.`students` AUTO_INCREMENT = 18 ;
		System.out.println("Dodaję Studenta \"Test Guy\"");
			student.studentsAdd("test", "guy", 666, "testing", 1);
		System.out.println("Po Dodaniu wyświetlam:");
		System.out.println();
			student.studentsRead();
		System.out.println();

		// Edytowanie istniejącego Studenta
		System.out.println("Edytuję studenta o id " + newIDs + ":");
			student.studentsEdit(newIDs, "Pati", "Super", 1969, "not bad", 3);
		System.out.println("Po Edycji wyświetlam:");
		System.out.println();
			student.studentsRead();
		System.out.println();

		// Usuwanie istniejącego studenta
		System.out.println("Usuwam Studenta o id " + newIDs + ":");
			student.studentsRemove(newIDs);
		System.out.println("Po Usunięciu wyświetlam:");
		System.out.println();
			student.studentsRead();
		System.out.println();

		// end of STUDENTS

		System.out.println();

		// start of Groups
		
		// zmienna pomagająca w testach
		int newIDg = 6;
		
		// Wyświetlanie wszystkich grup
		System.out.println("Wszystkie Grupy:");
		System.out.println();
			group.groupsRead();
		System.out.println();

		// Wyświetlenie pojedyńczej grupy
		System.out.println("Jedna konkretna Grupa:");
		System.out.println();
			group.groupsRead(2);
		System.out.println();

		// Dodanie nowej grupy
		System.out.println("Dodaję Grupę \"Test Group\"");
			group.groupsAdd("test", "group", 6);
		System.out.println("Po Dodaniu wyświetlam:");
		System.out.println();
			group.groupsRead();
		System.out.println();

		// Edytowanie istniejącej grupy
		System.out.println("Edytuję grupę o id " + newIDg + ":");
			group.groupsEdit(newIDg, "test2", "group2", 12);
		System.out.println("Po Edycji wyświetlam:");
		System.out.println();
			group.groupsRead();
		System.out.println();

		// Usuwanie istniejącej grupy
		System.out.println("Usuwam grupę o id " + newIDg + ":");
			group.groupsRemove(newIDg);
		System.out.println("Po Usunięciu wyświetlam:");
		System.out.println();
			group.groupsRead();
		System.out.println();
	}
}