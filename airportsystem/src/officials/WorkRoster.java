package officials;


public class WorkRoster {
	public static void main(String [] args)
	{
	ImmigrationOfficer immiofficer1 = new ImmigrationOfficer("George F.", 32188);
	ImmigrationOfficer immiofficer2 = new ImmigrationOfficer("Harry G.", 51332);
	ImmigrationOfficer immiofficer3 = new ImmigrationOfficer("Tanya Y.", 89717);
	ImmigrationOfficer immiofficer4 = new ImmigrationOfficer("Carol T.", 60221);
	ImmigrationOfficer immiofficer5 = new ImmigrationOfficer("Dennis C.", 42436);
	
	System.out.println("Work Roster Today: ");
	
	immiofficer1.workingToday();
	immiofficer2.workingToday();
	immiofficer3.workingToday();
	immiofficer4.workingToday();
	immiofficer5.workingToday();


	}
}
