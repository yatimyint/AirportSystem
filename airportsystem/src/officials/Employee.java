package officials;

public class Employee {
	protected String name;
	protected int ID;
	
	public Employee(String name, int ID)
	{
		this.name = name;
		this.ID = ID;
		}
	
	public void workingToday()
	{
	System.out.println("Name: " + name + " ID: " + ID);
	}

}
