package travelers;

public abstract class ImmigrationSystem {
    protected String name;
    protected int age;
    protected String passportNumber;
    protected String travelPurpose;
    protected boolean visa;
    
    public ImmigrationSystem(String name, int age, String passportNumber, String travelPurpose, boolean visa) 
    {
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
        this.travelPurpose = travelPurpose;
        this.visa = visa;
    }
    
    public abstract void checkSystem();
}
