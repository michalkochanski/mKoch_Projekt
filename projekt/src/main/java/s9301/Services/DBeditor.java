package s9301.Services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBeditor {
	
	private DBconnector db = new DBconnector();
	
	public ResultSet tableEditor(String query)
	{
		ResultSet result = null;
		try {
			PreparedStatement s = db.connect().prepareStatement(query);
			result = s.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Zapytanie tabeli ZAWIODŁO!");
		}
		return result;
	}

}
