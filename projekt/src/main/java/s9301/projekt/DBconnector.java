package s9301.projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconnector {
	
	void baza()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection db = DriverManager.getConnection("jdbc:mysql://mysql51.iq.pl:3306/michalkoch_java","michalkoch_java","7hxvhhw3k6");
			
			PreparedStatement deklaracja = db.prepareStatement("select * from test");
			ResultSet wynik = deklaracja.executeQuery();
			
			System.out.println("id | nazwa");
			
			while (wynik.next())
			{
				System.out.println(wynik.getString(1) + "     " + wynik.getString(2));
			}
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
