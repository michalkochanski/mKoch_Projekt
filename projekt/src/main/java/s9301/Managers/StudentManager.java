package s9301.Managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import s9301.Persons.StudentClass;
import s9301.Services.DBconnector;
import s9301.Services.DBreader;

public class StudentManager implements ManagerInterface {

	public void testRead() {
		String query = "select * from test";

		DBreader reader = new DBreader();

		ResultSet result = reader.tableReader(query);

		try {
			while (result.next()) {
				System.out.println(result.getString(1) + "    "
						+ result.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
