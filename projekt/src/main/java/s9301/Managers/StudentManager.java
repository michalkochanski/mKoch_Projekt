package s9301.Managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import s9301.Persons.StudentClass;
import s9301.Services.DBconnector;
import s9301.Services.DBeditor;

public class StudentManager implements StudentManagerInterface {

	public void studentsReadAll() {
		String query = "select * from students";

		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableEditor(query);

		try {
			while (result.next()) {
				System.out.println(result.getString(1) + ", "
						+ result.getString(2) + ", " + result.getString(3)
						+ ", " + result.getString(4) + ", "
						+ result.getString(5) + ", " + result.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void studentsAdd(String query) {
		// TODO Auto-generated method stub
		
	}

	public void studentsEdit(String query) {
		// TODO Auto-generated method stub

	}

	public void studentsRemove(String query) {
		// TODO Auto-generated method stub

	}
}
