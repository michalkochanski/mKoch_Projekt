package s9301.Managers;

public interface GroupManagerInterface {
	
	public void groupsRead();
	
	public void groupsRead(int idGroup);

	public void groupsAdd(String name, String about, int idStarosty);

	public void groupsEdit(int idGroup, String name, String about, int idStarosty);

	public void groupsRemove(int idGroup);
}
