package s9301.Persons;

public class GroupClass implements GroupInterface {

	private int idGroup;
	private String name;
	private String about;
	private int idStarosty;

	public GroupClass() {
		int idGroup = 0;
		String name = "";
		String about = "";
		int idStarosty = 0;
	}
	
	public int getIdGroup() {
		// TODO Auto-generated method stub
		return idGroup;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getAbout() {
		// TODO Auto-generated method stub
		return about;
	}

	public int getIdStarosty() {
		// TODO Auto-generated method stub
		return idStarosty;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public void setIdStarosty(int idStarosty) {
		this.idStarosty = idStarosty;
	}

}
