package s9301.Managers;

import java.sql.ResultSet;
import java.util.List;

import s9301.Persons.GroupClass;
import s9301.Persons.StudentClass;
import s9301.Services.DBeditor;

public class GroupManager implements ManagerInterface<GroupClass> {
	
	public void ReadAll() {
		String query = "select * from groups";
		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableViewer(query);

		try {
			System.out.println("idGroup" + "\t" + "name" + "\t\t"
					+ "idStarosty" + "\t" + "about");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t\t" + result.getString(4)
						+ "\t\t" + result.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ReadOne(int id) {
		String query = "select * from groups where idGroup = " + id;
		DBeditor dbedit = new DBeditor();

		ResultSet result = dbedit.tableViewer(query);

		try {
			System.out.println("idGroup" + "\t" + "name" + "\t\t"
					+ "idStarosty" + "\t" + "about");
			while (result.next()) {
				System.out.println(result.getString(1) + "\t"
						+ result.getString(2) + "\t\t" + result.getString(4)
						+ "\t\t" + result.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void Add(GroupClass obj) {
		GroupClass g = new GroupClass();
		String query = "INSERT INTO `groups` (`name`,`about`,`idStarosty`) VALUES ('"
				+ g.getName() + "','" + g.getAbout() + "'," + g.getIdStarosty() + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);		
	}

	public void Edit(GroupClass obj) {
		GroupClass g = new GroupClass();
		String query = "UPDATE groups SET `name` = '" + g.getName() + "', `about` = '"
				+ g.getAbout() + "', `idStarosty` = " + g.getIdStarosty()
				+ " WHERE `idGroup` = " + g.getIdGroup();

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void Remove(int id) {
		String query = "delete from groups where idGroup = " + id;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);		
	}
	
/*
 * OLD METODS:
 * 
	public void groupsRead() {}

	public void groupsRead(int idGroup) {}

	public void groupsAdd(String name, String about, int idStarosty) {}

	public void groupsEdit(int idGroup, String name, String about, int idStarosty) {}

	public void groupsRemove(int idGroup) {}
*/
}