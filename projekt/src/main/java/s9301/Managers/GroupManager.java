package s9301.Managers;

import java.sql.ResultSet;

import s9301.Services.DBeditor;

public class GroupManager implements GroupManagerInterface {

	public void groupsRead() {
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

	public void groupsRead(int idGroup) {
		String query = "select * from groups where idGroup = " + idGroup;
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

	public void groupsAdd(String name, String about, int idStarosty) {
		String query = "INSERT INTO `groups` (`name`,`about`,`idStarosty`) VALUES ('"
				+ name + "','" + about + "'," + idStarosty + ");";

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void groupsEdit(int idGroup, String name, String about, int idStarosty) {
		String query = "UPDATE groups SET `name` = '" + name + "', `about` = '"
				+ about + "', `idStarosty` = " + idStarosty
				+ " WHERE `idGroup` = " + idGroup;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

	public void groupsRemove(int idGroup) {
		String query = "delete from groups where idGroup = " + idGroup;

		DBeditor dbedit = new DBeditor();

		dbedit.tableEditor(query);
	}

}