package s9301.Services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBeditor {

	private DBconnector db = new DBconnector();

	public ResultSet tableViewer(String query) {
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

	public void tableEditor(String query) {
		try {
			PreparedStatement s = db.connect().prepareStatement(query);
			s.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Zapytanie tabeli ZAWIODŁO!");
		}
	}
	
	/*
	 * Próby sprawdzania ostatnio wstawianego id przez auto increment - zakończone niepowodzeniem 
	public int AutoIncrementCheck() {
		ResultSet result = null;
		int wynik = 0;
		String query = "SELECT LAST_INSERT_ID();";
		try {
			PreparedStatement s = db.connect().prepareStatement(query);
			result = s.executeQuery();
			while (result.next()) {
				System.out.println(wynik = result.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Zapytanie tabeli ZAWIODŁO!");
		}
		return wynik;
	}
	*/
}