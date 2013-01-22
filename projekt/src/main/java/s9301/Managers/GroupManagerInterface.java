package s9301.Managers;

public interface GroupManagerInterface {
	
	public void groupsReadAll();

	public void groupAdd(String name, String about, int idStarosty);

	public void groupEdit(int idGroup, String name, String about, int idStarosty);

	public void groupRemove(int idGroup);
}
