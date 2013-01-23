package s9301.Managers;

public interface ManagerInterface<TEntity> {
	
	public void ReadAll();
	
	public void ReadOne(int id);

	public void Add(TEntity obj);

	public void Edit(TEntity obj);

	public void Remove(int id);
}
